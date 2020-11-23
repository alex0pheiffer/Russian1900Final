package com.example.russian1900final

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.Glide.G_Call

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class CharacterChoiceFragment : Fragment() {

    var mListener: CharacterChoiceListener? = null
    var mScene: Scene? = null
    var gcall: G_Call? = null

    lateinit var date: TextView
    lateinit var title: TextView
    lateinit var text: TextView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_characterchoice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gcall = G_Call()
        val background = view.findViewById<ImageView>(R.id.character_background)
        val char0img = view.findViewById<ImageView>(R.id.character_choice0img)
        val char1img = view.findViewById<ImageView>(R.id.character_choice1img)
        val char0 = view.findViewById<Button>(R.id.character_choice0)
        val char1 = view.findViewById<Button>(R.id.character_choice1)
        val upBtn = view.findViewById<ImageView>(R.id.character_up)

        date = view.findViewById<TextView>(R.id.character_date)
        title = view.findViewById<TextView>(R.id.character_title)
        text = view.findViewById<TextView>(R.id.character_text)

        // set up the images for the current scene
        mScene = mListener?.getScene()
        if (mScene != null) {
            // set images
            gcall?.loadImage(mScene!!.mainBackground, background, background)
            gcall?.loadImage(mScene!!.charChoice.first.iconAlive, char0img, char0img)
            gcall?.loadImage(mScene!!.charChoice.second.iconAlive, char1img, char1img)
            // set button names
            char0.text = mScene!!.charChoice.first.name
            char1.text = mScene!!.charChoice.second.name
        }

        gcall?.setTitle(mScene, title, date)


        char0.setOnClickListener {
            mListener?.setCharacter(0)
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        char1.setOnClickListener {
            mListener?.setCharacter(1)
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        upBtn.setOnClickListener {
            mListener?.upPressed()
        }
    }

    interface CharacterChoiceListener {
        fun upPressed()
        fun setCharacter(choice: Int)
        fun getScene(): Scene?
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CharacterChoiceListener) {
            mListener = context
        } else {
            throw RuntimeException(context.toString() + " must implement listener.")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
        mScene = null
        gcall = null
    }
}