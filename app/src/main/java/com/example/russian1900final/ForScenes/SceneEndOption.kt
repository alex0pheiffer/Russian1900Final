package com.example.russian1900final.ForScenes

import com.example.russian1900final.Glide.MonthEnum

/*
    One of the possible outcomes for the chosen character for a given scene
 */
class SceneEndOption(
    val character: CharacterChoice, // what character does this scene correspond with?
    val miniSceneAmt: Int,    // how many parts are there to this?
    val specificMonth: MonthEnum?, // if there's no specific month, leave this null
    val specificDay: Int?, // a day in the above month. null if none.
    val charChoice: Pair<CharacterChoice, CharacterChoice>,
    val mainBackground: String
)