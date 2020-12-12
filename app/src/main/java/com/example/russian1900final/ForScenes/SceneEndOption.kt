package com.example.russian1900final.ForScenes

import com.example.russian1900final.Glide.MonthEnum

/*
    One of the possible outcomes for the chosen character for a given scene
 */
class SceneEndOption(
    val character: CharacterChoice, // what character does this scene correspond with?
    val text: Array<String>,        // text for the miniscenes
    val isDead: Boolean,            // if the character dies
    val mainBackground: String      // background (not necessarily the same as parent)
)