package com.example.noteapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    suspend fun addNote(note: Note)

    @Query("SELECT * FROM note_table ORDER BY id ASC")
    fun readAllNote(): LiveData<List<Note>>
}