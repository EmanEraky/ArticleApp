package com.eman.mostarticalapp.presentation.ui.main

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.BitmapImageViewTarget
import com.eman.mostarticalapp.R
import com.eman.mostarticalapp.databinding.ItemArticalBinding
import com.eman.mostarticalapp.domain.model.Artical
import com.eman.mostarticalapp.presentation.NavigationListener


class MainArticalAdapter(
    private var articals: ArrayList<Artical>,
    var listener: NavigationListener
) : RecyclerView.Adapter<MainArticalAdapter.DataViewHolder>() {
    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        context = parent.context
        val binding = DataBindingUtil.inflate<ItemArticalBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_artical,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = articals.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        if(articals.get(position).media!!.isNotEmpty()){
            if(articals.get(position).media!!.get(0).mediametadata!!.isNotEmpty()){
                articals.get(position).urlImg= articals.get(position).media!!.get(0).mediametadata!!.get(1).url!!
            }
        }
        holder.binding.articalApi = articals.get(position)
        holder.binding.listener = listener
    }

    class DataViewHolder(val binding: ItemArticalBinding) : RecyclerView.ViewHolder(binding.root)

    fun addData(list: ArrayList<Artical>) {
        articals.addAll(list)
        notifyDataSetChanged()
    }


}