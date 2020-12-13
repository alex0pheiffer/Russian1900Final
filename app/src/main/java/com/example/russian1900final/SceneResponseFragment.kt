package com.example.russian1900final

import android.animation.ObjectAnimator
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.animation.doOnEnd
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.ForScenes.SceneEndOption
import com.example.russian1900final.ForScenes.SceneList
import com.example.russian1900final.Glide.G_Call
import com.example.russian1900final.References.ReferenceDialog


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SceneResponseFragment : Fragment(), ReferenceDialog.DialogListener {

    var mListener: SceneResponseListener? = null
    var mScene: Scene? = null
    var miniScene: SceneEndOption? = null
    lateinit var mChoice: String
    lateinit var mContinue: ContinueType
    var gcall: G_Call? = null

    lateinit var date: TextView
    lateinit var title: TextView
    lateinit var text: TextView
    lateinit var mImage: ImageView
    lateinit var mImageLayout: RelativeLayout
    lateinit var charGlow: ImageView
    lateinit var mDead: TextView

    lateinit var endButtons: LinearLayout
    lateinit var responseBtn: LinearLayout
    lateinit var continueBtn: Button
    lateinit var backBtn: Button
    lateinit var homeBtn: Button
    lateinit var referenceBtn: ImageView

    var dialog: ReferenceDialog? = null

    var numPressed = 0
    var width = 0
    var height = 0

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val args: SceneResponseFragmentArgs by navArgs()
        mChoice = args.charChoice
        val mcontinueLetter = args.continueType
        if (mcontinueLetter == ContinueType.CHRONOLOGICAL.typeNum) mContinue = ContinueType.CHRONOLOGICAL
        else mContinue = ContinueType.RANDOM

        return inflater.inflate(R.layout.fragment_sceneresponse, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gcall = G_Call()
        mScene = mListener?.getScene()

        val contentView = view.findViewById<View>(R.id.response_fullContainer)
        contentView.post {
            width = contentView.width
            height = contentView.height
        }


        val background = view.findViewById<ImageView>(R.id.response_background)
        mImage = view.findViewById<ImageView>(R.id.response_bottomImg)
        // set images
        if (mScene != null) {
            // determine the miniscene route that is being played
            if (mListener?.getCharacter() == 0 && mChoice == CharChoice.FIRST.typeNum) {
                // player chose the first option
                miniScene = mScene!!.charChoice.first
            }
            else if (mListener?.getCharacter() == 1 && mChoice == CharChoice.SECOND.typeNum) {
                // player chose the second option
                miniScene = mScene!!.charChoice.second
            }
            else {
                // something went wrong; assume first
                Log.d(
                        "ERROR",
                        "Character selection does not match. Using first character by default."
                )
                miniScene = mScene!!.charChoice.first
            }

            mDead = view.findViewById<TextView>(R.id.response_characterDead)
            // dead text should always be invisible
            mDead.alpha = 0f
            if (miniScene!!.isDead) {
                mDead.text = "D E A D"
                mDead.setTextColor(getResources().getColor(R.color.redLight, null))
            }
            else {
                mDead.text = "L I V E"
                mDead.setTextColor(getResources().getColor(R.color.live, null))
            }

            gcall!!.loadImageOther(miniScene!!.character.iconAlive, mImage, mImage)

            gcall!!.loadImageBackground(miniScene!!.mainBackground, background, background)
        }

        date = view.findViewById<TextView>(R.id.response_date)
        title = view.findViewById<TextView>(R.id.response_title)
        text = view.findViewById<TextView>(R.id.response_text)
        endButtons = view.findViewById<LinearLayout>(R.id.response_endButtons)
        continueBtn = view.findViewById<Button>(R.id.response_continue)
        backBtn = view.findViewById<Button>(R.id.response_back)
        homeBtn = view.findViewById<Button>(R.id.response_home)
        mImageLayout = view.findViewById<RelativeLayout>(R.id.response_bottomImg_layout)
        charGlow = view.findViewById<ImageView>(R.id.response_bottomImgGlow)
        responseBtn = view.findViewById<LinearLayout>(R.id.response_textBtn)
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

        continueBtn.setOnClickListener {
            // check that we can do things
            if (mScene == null || miniScene == null) {
                numPressed--
                Log.d("ERROR", "The scene/miniScene is null and text cannot be shown.")
            }
            else {
                // change the currently selected scene
                val mList = SceneList()

                // change scene chronologically
                if (mContinue == ContinueType.CHRONOLOGICAL) {
                    val index = mList.getScene(mScene!!)
                    Log.d("SET SCENE",""+mScene!!.name+" "+index)
                    if (index+1 >= mList.size()-1) // subtract one because theres a filler scene at the bottom of the recycler
                    {
                        // return to the home scene; we went through all the scenes
                        val action: NavDirections =SceneResponseFragmentDirections.actionSceneResponseFragmentToFirstFragment()
                        this.findNavController().navigate(action)
                    }
                    else {
                        Log.d("SET SCENE",mList.getScene(index + 1).name)
                        mListener?.setScene(mList.getScene(index + 1))
                        val action: NavDirections =SceneResponseFragmentDirections.actionSceneResponseFragmentToCharacterChoiceFragment(
                                mContinue.typeNum
                        )
                        this.findNavController().navigate(action)
                    }
                }
                // change scene randomly
                else {
                    val rand = (mList.size()*Math.random()).toInt()
                    mListener?.setScene(mList.getScene(rand))
                    val action: NavDirections =SceneResponseFragmentDirections.actionSceneResponseFragmentToCharacterChoiceFragment(
                            mContinue.typeNum
                    )
                    this.findNavController().navigate(action)
                }
            }
        }
        backBtn.setOnClickListener {
            val action: NavDirections =SceneResponseFragmentDirections.actionSceneResponseFragmentToCharacterChoiceFragment(
                    mContinue.typeNum
            )
            this.findNavController().navigate(action)
        }
        homeBtn.setOnClickListener {
            val action: NavDirections =SceneResponseFragmentDirections.actionSceneResponseFragmentToFirstFragment()
            this.findNavController().navigate(action)
        }
        referenceBtn.setOnClickListener {
            openDialog()
        }

        upBtn.setOnClickListener {
            mListener?.upPressed()
        }
    }

    fun turnText() {
        if (mScene == null || miniScene == null) {
            numPressed--
            Log.d("ERROR", "The scene/miniScene is null and text cannot be shown.")
            return
        }
        Log.d("Test", "turnText: writing...")
        if (numPressed < miniScene!!.text.size) {
            // show next text
            text.text = miniScene!!.text[numPressed]
            Log.d("Test", "There is more to show!!!")
        }
        else {
            Log.d("Test", "All has been shown")
            // show the end result
            ObjectAnimator.ofFloat(charGlow, "alpha", 0f).apply {
                duration = 2000.toLong()
                start()
            }
            ObjectAnimator.ofFloat(text, "alpha", 0f).apply {
                duration = 2000.toLong()
                start()
            }
            ObjectAnimator.ofFloat(mImageLayout, "translationY", -600f).apply {
                duration = 2000.toLong()
                this.doOnEnd {
                    // exchange the images
                    if (miniScene!!.isDead)
                        gcall?.fadeCharacter(miniScene!!.character.iconDead, mImage, mImage)
                    else
                        gcall?.fadeCharacter(miniScene!!.character.iconAlive, mImage, mImage)
                    ObjectAnimator.ofFloat(mDead, "alpha", 1f).apply {
                        duration = 3500.toLong()
                        this.doOnEnd {
                            // pull up button bar
                            endButtons.visibility = View.VISIBLE
                        }
                        start()
                    }
                }
                start()
            }
        }
    }

    override fun getScene(): Scene? {
        return mScene
    }

    /*
    *       REFERENCE DIALOG
    */
    fun openDialog() {
        // create the reference dialog

        // width = ~90% width height = ~90% height
        val w = (.9*width).toInt()
        val h = (.9*height).toInt()

        dialog = ReferenceDialog.newInstance(w,h)
        val fm = childFragmentManager
        dialog!!.show(fm, "strinig")
    }

    interface SceneResponseListener {
        fun getCharacter(): Int
        fun setScene(scene: Scene)
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