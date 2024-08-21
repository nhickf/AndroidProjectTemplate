package com.grpcx.androidtask.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DefaultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int
)
