package com.example.notesapps

import android.app.Application
import androidx.room.Room
import com.example.notesapps.db.NoteDatabase

class App : Application(){
        override fun onCreate() {
            super.onCreate()
              Room.databaseBuilder(
                this.applicationContext,
                NoteDatabase::class.java,
                "note_database"
            ).allowMainThreadQueries().build()
        }
        companion object{
            lateinit var NoteDatabase: NoteDatabase
        }
    }
