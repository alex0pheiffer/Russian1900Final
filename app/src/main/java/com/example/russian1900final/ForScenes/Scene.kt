package com.example.russian1900final.ForScenes

import com.example.russian1900final.Glide.MonthEnum
import com.example.russian1900final.References.RefClass

/*
    Scene: The main objects that give the information for each scene that a user may "play"
 */
class Scene(
    val name: String, // what is this scene called?
    val year: Int,    // what year did this scene (approximately) take place?
    val specificMonth: MonthEnum?, // if there's no specific month, leave this null
    val specificDay: Int?, // a day in the above month. null if none.
    val charChoice: Pair<SceneEndOption, SceneEndOption>,
    val mainBackground: String,
    val text: String,
    val textReferences: Array<RefClass>,
    val imgReferences: Array<RefClass>
)