package com.grpcx.androidtask.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.grpcx.androidtask.data.local.dao.DefaultDao
import com.grpcx.androidtask.data.local.entities.DefaultEntity

@Database(entities = [DefaultEntity::class], version = 1)
abstract class AppDatabase(): RoomDatabase() {
    abstract fun defaultDao(): DefaultDao
}