package com.example.russian1900final

import com.example.russian1900final.ForScenes.Scene
import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class SceneRecyclerAdapter(
    val mList: Array<Scene>,
    val listener: SceneRecycler.SceneRecyclerListener?,
    val activity: Activity
) :
    RecyclerView.Adapter<SceneRecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_scene_holder, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        if (mList[position].isFiller) {

            holder.scene = null
            holder.name?.text = ""
            holder.year?.text = ""

            holder.setThemeNonSelect(activity)

            holder.mView.setOnClickListener {
                // do nothing
            }
        }
        else {

            holder.scene = mList[position]
            holder.name?.text = mList[position].name

            // check if the previous position exists
            if (position - 1 >= 0) {
                if (mList[position - 1].year != mList[position].year) {
                    holder.year?.text = mList[position].year.toString()
                } else {
                    holder.year?.text = ""
                }
            } else {
                holder.year?.text = mList[position].year.toString()
            }

            // set default theme
            if (listener?.getScene() != holder.scene)
                holder.setThemeNonSelect(activity)
            else
                holder.setThemeSelect(activity)

            holder.mView.setOnClickListener {
                // chose the scene
                if (holder.scene != null)
                    listener?.setScene(holder.scene!!)

                // remove theme from now unselected
                notifyDataSetChanged()
            }
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(val mView: View) :
        RecyclerView.ViewHolder(mView) {
        var scene: Scene? = null
        var name: TextView? = null
        var year: TextView? = null

        init {
            name =      mView.findViewById<View>(R.id.recycler_name) as TextView
            year =      mView.findViewById<View>(R.id.recycler_year) as TextView
        }

        fun setThemeNonSelect(act: Context) {
            mView.setBackgroundColor(ContextCompat.getColor(act, R.color.greyDarker))
            name?.setTextColor(ContextCompat.getColor(act, R.color.greyLight))
            year?.setTextColor(ContextCompat.getColor(act, R.color.greyBase))
        }
        fun setThemeSelect(act: Context) {
            mView.setBackgroundColor(ContextCompat.getColor(act, R.color.redDeath))
            name?.setTextColor(ContextCompat.getColor(act, R.color.redLight))
            year?.setTextColor(ContextCompat.getColor(act, R.color.redLight))
        }
    }
}