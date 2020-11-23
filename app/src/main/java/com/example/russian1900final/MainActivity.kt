package com.example.russian1900final

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import com.example.russian1900final.ForScenes.Scene

class MainActivity : AppCompatActivity(), SceneRecycler.SceneRecyclerListener,
    CharacterChoiceFragment.CharacterChoiceListener, SceneResponseFragment.SceneResponseListener {

    var mScene: Scene? = null // which scene is showing?
    var mChoice: Int = 0 // which character did the player chose?


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.toolbar))

        /*
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        */
    }

    override fun upPressed() {

        val navController = this.findNavController(R.id.nav_host_fragment)
        navController.navigateUp()

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        return navController.navigateUp()
    }

    override fun setScene(scene: Scene) {
        mScene = scene
    }

    override fun getScene(): Scene? {
        return mScene
    }

    override fun setCharacter(choice: Int) {
        mChoice = choice
    }

    override fun getCharacter(): Int {
        return mChoice
    }

}