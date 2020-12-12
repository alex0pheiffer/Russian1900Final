package com.example.russian1900final.References

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
import com.example.russian1900final.R
import com.example.russian1900final.SceneRecyclerAdapter

class ReferenceRecycler(val WrittenRef: Array<RefClass>, val ImgLinks: Array<RefClass>, val W: Int, val H: Int): Fragment() {
    private val mColumnCount = 1
    private var mList: ArrayList<RefClass>? = null
    private var mAdapter: ReferenceRecyclerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.recycler_reference_view, container, false)

        // set the list
        mList = ArrayList<RefClass>()
        if (WrittenRef.size != 0)
            mList!!.add(TEXTBOUND())
        for (t in WrittenRef) {
            mList!!.add(t)
        }
        if (ImgLinks.size != 0)
            mList!!.add(IMGBOUND())
        for (i in ImgLinks) {
            mList!!.add(i)
        }
        mList!!.add(OTHERBOUND())
        mList!!.add(RefLecture())
        mList!!.add(RefSilhouette())

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
                mAdapter = ReferenceRecyclerAdapter(mList!!, requireActivity(), W, H)
                recyclerView.adapter = mAdapter
            }
        }
        return view
    }

    override fun onDetach() {
        super.onDetach()
        mList = null
        mAdapter = null
    }

    companion object {
        fun newInstance(writtenRef: Array<RefClass>, imgLinks: Array<RefClass>, width: Int, height: Int
        ): ReferenceRecycler {
            val fragment = ReferenceRecycler(writtenRef, imgLinks, width, height)
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}