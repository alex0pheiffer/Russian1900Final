package com.example.russian1900final

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.ForScenes.SceneList

class SceneRecycler: Fragment() {
    private val mColumnCount = 1
    private var mList: Array<Scene>? = SceneList().getList()
    private var mListener: SceneRecyclerListener? = null
    private var mAdapter: SceneRecyclerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.recycler_scene_view, container, false)
        // set the first item in the list to be the current scene
        mListener?.setScene(mList!![0])

        // Set the adapter
        if (view is RecyclerView) {
            val context = view.getContext()
            val recyclerView = view
            if (mColumnCount <= 1) {
                recyclerView.layoutManager = LinearLayoutManager(
                    context,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            } else {
                recyclerView.layoutManager = GridLayoutManager(context, mColumnCount)
            }
            if (mList != null) {
                mAdapter = SceneRecyclerAdapter(mList!!, mListener, requireActivity())
                recyclerView.adapter = mAdapter
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mListener = context as SceneRecyclerListener
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
        mList = null
        mAdapter = null
    }

    interface SceneRecyclerListener {
        //possibly pop up information about a given card
        fun setScene(scene: Scene)
        fun getScene(): Scene?
    }

    companion object {
        fun newInstance(
        ): SceneRecycler {
            val fragment = SceneRecycler()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}