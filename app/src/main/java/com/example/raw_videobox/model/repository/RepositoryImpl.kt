package com.example.raw_videobox.model.repository

import com.example.raw_videobox.model.data.Movie

class RepositoryImpl: Repository {
    override fun getMovieFromLocal(): Movie {
        return Movie(
            "Камень",
            "Лучший фильм((=",
            "12.12.2020",
            5
        )
    }
}