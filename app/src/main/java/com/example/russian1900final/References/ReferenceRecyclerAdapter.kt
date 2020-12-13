package com.example.russian1900final.References

import com.example.russian1900final.ForScenes.Scene
import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.russian1900final.Glide.G_Call
import com.example.russian1900final.R

class ReferenceRecyclerAdapter(
    val mList: ArrayList<RefClass>,
    val activity: Activity,
    val W: Int,
    val H: Int
) :
    RecyclerView.Adapter<ReferenceRecyclerAdapter.ViewHolder>() {

    val gcall = G_Call()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View
        view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_reference_image, parent, false)
        return ViewHolder(
            view, W, gcall
        )
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.reference = mList[position]
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(val mView: View, val W: Int, val gc: G_Call) :
        RecyclerView.ViewHolder(mView) {
        var reference: RefClass? = null
        set(value) {
            if (value != null) {
                if (value.isImg) {
                    isNowImg = true
                    sizeImg()
                    gc.loadImageBackground(value.str, img, img)
                    text.gravity = Gravity.NO_GRAVITY
                    text.setTextColor(mView.resources.getColor(R.color.white, null))
                }
                else {
                    if (isNowImg) {
                        isNowImg = false
                        sizeText()
                    }

                    if (value.isBound) {
                        text.gravity = Gravity.CENTER
                        text.setTextColor(mView.resources.getColor(R.color.redLight, null))
                    }
                    else {
                        text.gravity = Gravity.NO_GRAVITY
                        text.setTextColor(mView.resources.getColor(R.color.white, null))
                    }
                }

                text.text = value.str
            }
            field = value
        }
        var isNowImg = false

        var mainBox: ConstraintLayout
        var text: TextView
        var imgBox: LinearLayout
        var img: ImageView

        init {
            mainBox =      mView.findViewById<View>(R.id.mainBox) as ConstraintLayout
            text =      mView.findViewById<View>(R.id.refText_name) as TextView
            imgBox =      mView.findViewById<View>(R.id.refImg_layout) as LinearLayout
            img =      mView.findViewById<View>(R.id.refImg_img) as ImageView
        }

        fun sizeImg() {
            val margin = 5 * mView.resources.getDimension(R.dimen.dialogMargin).toInt()
            val textH = mView.resources.getDimension(R.dimen.textRecyclerHeight).toInt()
            val mainLayout = ConstraintLayout.LayoutParams(W-margin, W+textH-margin)
            mainLayout.bottomMargin = mView.resources.getDimension(R.dimen.refTextMargin).toInt()
            val imgLayout = LinearLayout.LayoutParams(W-margin,W-margin)

            mainBox.layoutParams = mainLayout
            imgBox.layoutParams = imgLayout
        }
        fun sizeText() {
            val margin = 2 * mView.resources.getDimension(R.dimen.dialogMargin).toInt()
            val textH = mView.resources.getDimension(R.dimen.textRecyclerHeight).toInt()
            val mainLayout = LinearLayout.LayoutParams(W-margin, textH)
            val imgLayout = LinearLayout.LayoutParams(W-margin,0)

            mainBox.layoutParams = mainLayout
            imgBox.layoutParams = imgLayout
        }
    }
}