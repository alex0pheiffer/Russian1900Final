package com.example.russian1900final.References

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.DialogFragment
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.ForScenes.SceneEndOption
import com.example.russian1900final.R


class ReferenceDialog: DialogFragment() {

    private var listener: DialogListener? = null
    private var recycler: ReferenceRecycler? = null
    private var height =0
    private var width = 0

    private var scene: Scene? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            if (it.getInt(DIALOGHEIGHT) > 0) {
                height = it.getInt(DIALOGHEIGHT)
                width = it.getInt(DIALOGWIDTH)
            }

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val viewwy = inflater.inflate(R.layout.dialog_reference, container, false)
        return viewwy
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        scene = listener?.getScene()

        if (scene != null) {
            recycler = ReferenceRecycler.newInstance(scene!!.textReferences, scene!!.imgReferences, width, height)
            val fm = childFragmentManager
            val ft = fm.beginTransaction()
            ft.add(R.id.dialog_recycler, recycler!!)
            ft.addToBackStack(null)
            ft.commit()
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = parentFragment as DialogListener
    }

    override fun onResume() {
        Log.d("Testing","Size of screen is $height by $width")
        dialog!!.window!!.setLayout(width, height)

        // Call super onResume after sizing
        super.onResume()
    }

    override fun onDetach() {
        super.onDetach()
        recycler = null
        scene = null
        listener = null
    }

    interface DialogListener {
        fun getScene(): Scene?
    }

    // Call this method to send the data back to the parent fragment
    fun dismissMe() {
        dismiss()
    }

    companion object {
        private val DIALOGWIDTH = "DIALOGWIDTH"
        private val DIALOGHEIGHT = "DIALOGHEIGHT"
        @JvmStatic
        fun newInstance(dialogW: Int, dialogH: Int) =
            ReferenceDialog().apply {
                arguments = Bundle().apply {
                    putInt(DIALOGWIDTH, dialogW)
                    putInt(DIALOGHEIGHT, dialogH)
                    }
            }
    }
}