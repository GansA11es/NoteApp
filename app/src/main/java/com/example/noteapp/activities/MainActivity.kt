package com.example.noteapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.ListFragment
import androidx.navigation.Navigator
import com.example.noteapp.R
import com.example.noteapp.data.Note

class MainActivity : AppCompatActivity(), Navigator {


    private val canNavigateUp: Boolean
        get() = supportFragmentManager.backStackEntryCount > 0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding().inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, ListFragment(), null)
                .commit()
        }

        supportFragmentManager.addOnBackStackChangedListener {
            supportActionBar?.setDisplayHomeAsUpEnabled(canNavigateUp)
        }
    }

    override fun navigateToDetailsScreen(note: Note) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, DetailsFragment.newInstance(note.toString()), null)
            .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        return if (canNavigateUp) {
            supportFragmentManager.popBackStack()
            false
        } else {
            finish()
            true
        }
    }
}
