package com.example.headlineshub.di

import android.app.Application
import com.example.headlineshub.data.model.LocalUserManagerImpl
import com.example.headlineshub.domain.manager.LocalUserManager
import com.example.headlineshub.domain.usecase.app_entry.AppEntryUseCase
import com.example.headlineshub.domain.usecase.app_entry.ReadAppEntry
import com.example.headlineshub.domain.usecase.app_entry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
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
}