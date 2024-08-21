package com.grpcx.androidtask.di

import com.grpcx.androidtask.data.network.AppService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Provides
    fun providesAppService(): AppService {
        return AppService()
    }

}