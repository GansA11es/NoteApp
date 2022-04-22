package com.example.noteapp.navigation

import androidx.fragment.app.Fragment
import com.example.noteapp.data.Note

interface Navigator {
    fun navigateToDetailsScreen(note: Note)
}

fun Fragment.navigator(): Navigator = (requireActivity() as Navigator)