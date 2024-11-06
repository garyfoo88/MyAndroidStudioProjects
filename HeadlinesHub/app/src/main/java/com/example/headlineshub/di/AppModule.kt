package com.example.headlineshub.di

import android.app.Application
import com.example.headlineshub.data.model.LocalUserManagerImpl
import com.example.headlineshub.data.remote.news.NewsApi
import com.example.headlineshub.data.repository.NewsRepositoryImpl
import com.example.headlineshub.domain.manager.LocalUserManager
import com.example.headlineshub.domain.repository.NewsRepository
import com.example.headlineshub.domain.usecase.app_entry.AppEntryUseCase
import com.example.headlineshub.domain.usecase.app_entry.ReadAppEntry
import com.example.headlineshub.domain.usecase.app_entry.SaveAppEntry
import com.example.headlineshub.domain.usecase.news.GetNews
import com.example.headlineshub.domain.usecase.news.NewsUseCase
import com.example.headlineshub.domain.usecase.news.SearchNews
import com.example.headlineshub.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //Below function is similar to this
    //fun provideLocalUserManager(application: Application): LocalUserManager {
    // return LocalUserManagerImpl(context = application)
    //}
    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCase(
        localUserManager: LocalUserManager
    ): AppEntryUseCase = AppEntryUseCase(
        saveAppEntry = SaveAppEntry(localUserManager),
        readAppEntry = ReadAppEntry(localUserManager)
    )

    @Provides
    @Singleton
    fun providesApiInstance(): NewsApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun providesNewsRepository(
        newsApi: NewsApi
    ): NewsRepository {
        return NewsRepositoryImpl(newsApi)
    }

    @Provides
    @Singleton
    fun providesNewsUseCase(
        newsRepository: NewsRepository
    ): NewsUseCase {
        return NewsUseCase(
            getNews = GetNews(newsRepository),
            searchNews = SearchNews(newsRepository)
        )
    }

}