package com.example.notesapps.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.random.Random


@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int = Random(1).nextInt(1000),
    var title: String,
    var description: String
)