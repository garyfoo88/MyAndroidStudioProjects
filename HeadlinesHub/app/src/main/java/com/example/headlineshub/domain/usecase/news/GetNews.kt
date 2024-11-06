package com.example.headlineshub.domain.usecase.news

import androidx.paging.PagingData
import com.example.headlineshub.domain.repository.NewsRepository
import com.example.headlineshub.model.Article
import kotlinx.coroutines.flow.Flow

class GetNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)
    }
}