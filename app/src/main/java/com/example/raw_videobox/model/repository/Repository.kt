package com.example.raw_videobox.model.repository

import com.example.raw_videobox.model.data.Movie

interface Repository {
    fun getMovieFromLocal(): Movie
}