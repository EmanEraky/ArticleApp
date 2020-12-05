package com.eman.mostarticalapp.presentation

import com.eman.mostarticalapp.domain.model.Artical

interface NavigationListener {
    fun onClickArtical(artical: Artical)
}