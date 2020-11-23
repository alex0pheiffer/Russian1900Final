package com.example.russian1900final

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.russian1900final.ForScenes.CharacterChoice
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.Glide.G_Call

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SceneResponseFragment : Fragment() {

    var mListener: SceneResponseListener? = null
    var mScene: Scene? = null
    var gcall: G_Call? = null

    lateinit var date: TextView
    lateinit var title: TextView
    lateinit var text: TextView
    lateinit var endButtons: LinearLayout
    lateinit var responseBtn: Button
    lateinit var continueBtn: Button
    lateinit var homeBtn: Button
    lateinit var referenceBtn: ImageView

    var numPressed = 0

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sceneresponse, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gcall = G_Call()
        mScene = mListener?.getScene()
        val background = view.findViewById<ImageView>(R.id.response_background)
        val bottomImg = view.findViewById<ImageView>(R.id.response_bottomImg)
        // set images
        if (mScene != null) {
            val char: CharacterChoice
            if (mListener?.getCharacter() == 0) char = mScene!!.charChoice.first
            else char = mScene!!.charChoice.second
            gcall!!.loadImage(char.iconAlive, bottomImg, bottomImg)

            gcall!!.loadImage(mScene!!.mainBackground, background, background)
        }

        date = view.findViewById<TextView>(R.id.response_date)
        title = view.findViewById<TextView>(R.id.response_title)
        text = view.findViewById<TextView>(R.id.response_text)
        endButtons = view.findViewById<LinearLayout>(R.id.response_endButtons)
        continueBtn = view.findViewById<Button>(R.id.response_continue)
        homeBtn = view.findViewById<Button>(R.id.response_home)
        responseBtn = view.findViewById<Button>(R.id.response_textBtn)
        referenceBtn = view.findViewById<ImageView>(R.id.response_references)
        val upBtn = view.findViewById<ImageView>(R.id.response_up)


        // end buttons should be inv
        endButtons.visibility = View.INVISIBLE

        // set the title
        gcall?.setTitle(mScene, title, date)
        // set the initial text
        turnText()


        responseBtn.setOnClickListener {
            // increment the number of times the screen has been pressed
            numPressed++
            // change the text/screen
            turnText()
        }

        // todo set up the reference button

        continueBtn.setOnClickListener {
            // todo go to next scene
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        homeBtn.setOnClickListener {
            // todo go to home screen
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        upBtn.setOnClickListener {
            mListener?.upPressed()
        }
    }

    fun turnText() {
        if (mScene == null) {
            numPressed--
            Log.d("ERROR", "The scene is null and text cannot be shown.")
            return
        }
        if (numPressed < mScene!!.text.size) {
            // show next text
            text.text = mScene!!.text[numPressed]
        }
        else {
            // show the end result
            // todo show character in full screen
            // todo show end text ?
            // todo show end buttons
        }
    }

    interface SceneResponseListener {
        fun getCharacter(): Int
        fun getScene(): Scene?
        fun upPressed()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is SceneResponseListener) {
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