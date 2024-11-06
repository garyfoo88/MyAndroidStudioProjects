package com.example.headlineshub.domain.usecase.news

import androidx.paging.PagingData
import com.example.headlineshub.domain.repository.NewsRepository
import com.example.headlineshub.model.Article
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>, searchQuery: String): Flow<PagingData<Article>> {
        return newsRepository.searchNews(
            sources = sources,
            searchQuery = searchQuery
        )
    }
}