package com.example.notesapps.db

import androidx.room.*
import com.example.notesapps.models.Note
@Dao
interface NotDao {

        @Query("select * from note_table" )
        fun getAllNotes(): MutableList<Note>

        @Query("select * from note_table where id ==:carId")
        fun getNoteById(carId: Int): Note

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        fun addNewNote(note:Note)

        @Update
        fun updateNote(note:Note)

}
