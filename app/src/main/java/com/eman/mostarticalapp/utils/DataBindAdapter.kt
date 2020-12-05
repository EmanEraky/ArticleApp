package com.eman.mostarticalapp.utils

import android.graphics.Bitmap
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.BitmapImageViewTarget


@BindingAdapter("android:articalImage")
fun setImageUrl(view: AppCompatImageView, path: String) {

    if (!path.equals("")) {
        Glide.with(view.getContext()).asBitmap().load(path)
            .diskCacheStrategy(DiskCacheStrategy.ALL).dontAnimate().into(view)
    }

}





