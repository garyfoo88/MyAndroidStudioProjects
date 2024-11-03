package com.example.headlineshub.data.remote.dto

import com.example.headlineshub.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)