package com.eman.mostarticalapp.presentation.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eman.mostarticalapp.BuildConfig
import com.eman.mostarticalapp.R
import com.eman.mostarticalapp.domain.model.Artical
import com.eman.mostarticalapp.databinding.ActivityMainBinding
import com.eman.mostarticalapp.presentation.NavigationListener
import com.eman.mostarticalapp.presentation.ui.detail.DetailsActivity
import com.eman.mostarticalapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), NavigationListener {
    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var adapter: MainArticalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        adapter = MainArticalAdapter(arrayListOf(), this)
        binding.mainAdapter = adapter

        mainViewModel.getArticalResponse(BuildConfig.API_Key)

        setObserveArticals()
    }

    fun setObserveArticals() {
        mainViewModel.articals.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { artical ->
                        renderList(artical.results as ArrayList<Artical>)
                    }
                    binding.recyclerView.visibility = View.VISIBLE
                }
                Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
                Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.recyclerView.visibility = View.GONE
                }
            }
        })
    }


    private fun renderList(lArtical: ArrayList<Artical>) {
        adapter.addData(lArtical)
    }

    override fun onClickArtical(artical: Artical) {
        val mIntent = Intent(this, DetailsActivity::class.java)
        mIntent.putExtra("artical",artical)
        startActivity(mIntent)
    }
}