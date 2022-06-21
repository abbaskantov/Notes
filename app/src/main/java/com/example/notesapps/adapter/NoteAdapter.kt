package com.example.notesapps.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapps.R
import com.example.notesapps.databinding.NoteBinding
import com.example.notesapps.models.Note

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.CarViewHolder>() {
   @SuppressLint  var noteList: MutableList<Note> = mutableListOf()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }
    inner class CarViewHolder(private val binding: NoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(note: Note) = binding.apply {
            .text = note.title
            descText.text = note.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.add_note, parent, false)
        val binding = NoteBinding.bind(view)
        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(noteList[position])
    }
    fun addNewNote(note : Note){
        noteList.add(0,note)
        notifyItemInserted(0)
    }
    override fun getItemCount(): Int = noteList.size
}