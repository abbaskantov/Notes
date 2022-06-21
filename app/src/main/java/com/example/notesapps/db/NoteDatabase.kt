package com.example.notesapps.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesapps.models.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun NotDao(): NotDao

}