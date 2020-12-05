package com.eman.mostarticalapp.presentation.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.eman.mostarticalapp.R
import com.eman.mostarticalapp.databinding.ActivityDetailsBinding
import com.eman.mostarticalapp.domain.model.Artical
import com.eman.mostarticalapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_details)


        val artical = intent.getSerializableExtra("artical") as Artical

        binding.articalApi =artical

    }


}