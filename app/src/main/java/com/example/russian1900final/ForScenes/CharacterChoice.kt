package com.example.russian1900final.ForScenes

/*
    CharacterChoice:
        a possible option to view a scene through
        //todo possibily include a theme color later
 */
open class CharacterChoice(
    val name: String,
    val iconAlive: String,
    val iconDead: String
)

class Civilian {
    val civils = arrayOf(
    /*  0 -Child*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/f/f8/Child0.png", "https://alex.pheiffer.net/russia/images/f/f9/Child1.png"),
    /*  3 -Emigrant*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/f/f5/Emigrant0.png", "https://alex.pheiffer.net/russia/images/e/e4/Emigrant1.png"),
    /*  4 -Worker*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/5/56/IndustrialWorker0.png", "https://alex.pheiffer.net/russia/images/4/41/IndustrialWorker1.png"),
    /*  6 -Male*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/6/69/Man0.png", "https://alex.pheiffer.net/russia/images/d/d7/Man1.png"),
    /*  7 -Mother*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/1/13/Mother0.png", "https://alex.pheiffer.net/russia/images/5/5e/Mother1.png"),
    /* 13 -Female*/ CharacterChoice("Civilian", "https://alex.pheiffer.net/russia/images/b/b4/Woman0.png", "https://alex.pheiffer.net/russia/images/8/86/Woman1.png"))

    fun craftCivilian(): CharacterChoice {
        val rand = Math.random()*civils.size
        return civils[rand.toInt()]
    }
}