package com.example.noteapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.noteapp.databinding.FragmentTextNoteBinding

class TextNoteFragment : Fragment(R.layout.fragment_text_note) {

    private lateinit var binding: FragmentTextNoteBinding
    private lateinit var creationPageToolbar: Toolbar
    private lateinit var creationPageDrawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setSupportActionBar(creationPageToolbar)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        val inflate = menuInflater
        inflate.inflate(R.menu.creation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_text_note)
//
//        creationPageToolbar = findViewById(R.id.creation_page_toolbar)
//        creationPageDrawerLayout = findViewById(R.id.drawer_creation_page)
//
//        setSupportActionBar(creationPageToolbar)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val inflate = menuInflater
//        inflate.inflate(R.menu.creation_menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
}