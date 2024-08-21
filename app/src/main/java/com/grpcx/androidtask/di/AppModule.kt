package com.grpcx.androidtask.di

import com.grpcx.androidtask.data.local.dao.DefaultDao
import com.grpcx.androidtask.data.network.AppService
import com.grpcx.androidtask.data.repository.MainRepositoryImpl
import com.grpcx.androidtask.domain.repository.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesMainRepository(defaultDao: DefaultDao , appService: AppService): MainRepository {
        return MainRepositoryImpl(
            defaultDao = defaultDao,
            appService = appService
        )
    }

}