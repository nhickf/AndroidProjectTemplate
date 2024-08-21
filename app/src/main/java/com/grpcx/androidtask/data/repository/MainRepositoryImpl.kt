package com.grpcx.androidtask.data.repository

import com.grpcx.androidtask.data.local.dao.DefaultDao
import com.grpcx.androidtask.data.network.AppService
import com.grpcx.androidtask.domain.repository.MainRepository
import javax.inject.Inject


class MainRepositoryImpl @Inject constructor(private val defaultDao: DefaultDao ,
                                             private val appService: AppService): MainRepository {




}