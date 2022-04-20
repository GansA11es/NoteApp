package com.example.noteapp.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel(application: Application) : AndroidViewModel(application) {

    private val readAllNote: LiveData<List<Note>>
    private val repository: NoteRepository

    init {
        val noteDao = NoteDataBase.getDataBase(application).noteDao()
        repository = NoteRepository(noteDao)
        readAllNote = repository.readAllNote
    }

    fun addNote(note: Note) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addNote(note)
        }
    }
}