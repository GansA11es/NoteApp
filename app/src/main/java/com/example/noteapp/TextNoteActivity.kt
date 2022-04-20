package com.example.noteapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class TextNoteActivity : AppCompatActivity() {

    private lateinit var creationPageToolbar: Toolbar
    private lateinit var creationPageDrawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_note)

        creationPageToolbar = findViewById(R.id.creation_page_toolbar)
        creationPageDrawerLayout = findViewById(R.id.drawer_creation_page)

        setSupportActionBar(creationPageToolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.creation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}