package com.example.notesapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Dao
import com.example.notesapps.databinding.AddNoteBinding
import com.example.notesapps.db.NotDao
import com.example.notesapps.models.Note
import kotlin.random.Random

class AddNotActivity : AppCompatActivity() {
    private val binding: AddNoteBinding by lazy {
        AddNoteBinding.inflate(layoutInflater)
    }
    private val dao: NotDao by lazy {
        App.carDatabase.NotDao()
    }
    private var notesList = mutableListOf<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.saveBtn.setOnClickListener {
            fun addNewNote() {
                binding.apply {
                }
            }
        }
    }
}