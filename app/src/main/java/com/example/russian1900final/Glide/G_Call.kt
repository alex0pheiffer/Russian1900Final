package com.example.russian1900final.Glide

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory
import com.example.liberatingdelta2020.glide.GlideApp
import com.example.russian1900final.ForScenes.Scene
import com.example.russian1900final.R


/*
    A 'class' for using glide, so i dont have to recreate the loadimage function.

 */
class G_Call {

    // possibility add filler images... not important rn
    val factory =
        DrawableCrossFadeFactory.Builder().setCrossFadeEnabled(true).build()


    fun loadImageBackground(url: String, image: ImageView, viewContext: View) {
        try {
            Glide.with(viewContext)
                .load(url) // Load the URL.
                .centerCrop() // Apply the centerCrop transformation so that the photo fully fills the ImageView.
                .into(image) // Set the ImageView as the target.
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun loadImageOther(url: String, image: ImageView, viewContext: View) {
        try {
            Glide.with(viewContext)
                .load(url) // Load the URL.
                .fitCenter() // Apply the centerCrop transformation so that the photo fully fills the ImageView.
                .into(image) // Set the ImageView as the target.
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun fadeCharacter(url: String, image: ImageView, viewContext: View) {

        GlideApp.with(viewContext)
            .load(url)
            .transition(withCrossFade(factory))
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(image)
    }


    fun removeImg(image: ImageView) {
        Glide.with(image.context)
            .clear(image)
    }

    fun setTitle(scene: Scene?, title: TextView, date: TextView) {
        // set title
        title.text = scene?.name

        // set date
        if (scene?.specificDay == null) {
            if (scene?.specificMonth == null) {
                // set the date as the year
                date.text = scene?.year.toString()
            }
            else {
                // set the date as month and year
                date.text = title.context?.getString(R.string.month_year, scene.specificMonth.value,scene.year)
            }
        }
        else {
            // set the day, month, year
            date.text = title.context?.getString(R.string.day_month_year, scene.specificMonth?.value, scene.specificDay, scene.year)
        }
    }
}