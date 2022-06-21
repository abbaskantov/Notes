package com.example.notesapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notesapps.adapter.NoteAdapter
import com.example.notesapps.databinding.ActivityMainBinding
import com.example.notesapps.db.NotDao
import com.example.notesapps.models.Note

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val dao: NotDao by lazy {
        App.NoteDatabase.NotDao()
    }
    private val adapter: NoteAdapter by lazy {
        NoteAdapter()
    }
    var allNoteList = mutableListOf<Note>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.adapter = adapter

        val dao = App.NoteDatabase.NotDao()
        getAllNotes(dao)
        binding.addBtn.setOnClickListener {
            addNewNote(dao)
        }
    }
    private fun addNewNote(dao: NotDao) = binding.apply {
        
        adapter.addNewNote(note = newNote)
    }
    private fun getAllNotes(dao: NotDao) {
        allNoteList = dao.getAllNotes()
        adapter.noteList = dao.getAllNotes()
    }
}