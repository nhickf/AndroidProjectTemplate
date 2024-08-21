package com.grpcx.androidtask.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.grpcx.androidtask.data.local.entities.DefaultEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DefaultDao {
    @Query("SELECT * FROM DEFAULTENTITY")
    fun fetchData(): Flow<List<DefaultEntity>>
}