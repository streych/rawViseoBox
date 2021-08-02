package com.example.raw_videobox.model

import com.example.raw_videobox.model.data.Movie

sealed class Appstate{
    data class Success(val movieData: Movie): Appstate()
    class Error(): Appstate()
    object Loading: Appstate()
}
