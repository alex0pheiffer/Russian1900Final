package com.example.russian1900final.ForScenes

import com.example.russian1900final.Glide.MonthEnum

class SceneList {

    // characters for scenes
    private val mCharacters = arrayOf<CharacterChoice>(
        /*  0 */ CharacterChoice("Child", "https://alex.pheiffer.net/russia/images/f/f8/Child0.png", "https://alex.pheiffer.net/russia/images/f/f9/Child1.png"),
        /*  1 */ CharacterChoice("Cosmonaut", "https://alex.pheiffer.net/russia/images/a/ad/Cosmonaut0.png", "https://alex.pheiffer.net/russia/images/9/9c/Cosmonaut1.png"),
        /*  2 */ CharacterChoice("Dog", "https://alex.pheiffer.net/russia/images/6/6a/Dog0.png", "https://alex.pheiffer.net/russia/images/c/c5/Dog1.png"),
        /*  3 */ CharacterChoice("Emigrant", "https://alex.pheiffer.net/russia/images/f/f5/Emigrant0.png", "https://alex.pheiffer.net/russia/images/e/e4/Emigrant1.png"),
        /*  4 */ CharacterChoice("Industrial Worker", "https://alex.pheiffer.net/russia/index.php?title=File:IndustrialWorker0.png", "https://alex.pheiffer.net/russia/images/4/41/IndustrialWorker1.png"),
        /*  5 */ CharacterChoice("Lenin", "https://alex.pheiffer.net/russia/images/6/60/Lenin0.png", "https://alex.pheiffer.net/russia/images/e/ed/Lenin1.png"),
        /*  6 */ CharacterChoice("Male", "https://alex.pheiffer.net/russia/images/6/69/Man0.png", "https://alex.pheiffer.net/russia/images/d/d7/Man1.png"),
        /*  7 */ CharacterChoice("Mother", "https://alex.pheiffer.net/russia/images/1/13/Mother0.png", "https://alex.pheiffer.net/russia/images/5/5e/Mother1.png"),
        /*  8 */ CharacterChoice("Noble", "https://alex.pheiffer.net/russia/images/8/84/NobleWoman0.png", "https://alex.pheiffer.net/russia/images/8/82/NobleWoman1.png"),
        /*  9 */ CharacterChoice("Man of Faith", "https://alex.pheiffer.net/russia/images/e/eb/Prayer0.png", "https://alex.pheiffer.net/russia/images/9/9f/Prayer1.png"),
        /* 10 */ CharacterChoice("Scientist", "https://alex.pheiffer.net/russia/images/b/b9/Scientist0.png", "https://alex.pheiffer.net/russia/images/e/ef/Scientist1.png"),
        /* 11 */ CharacterChoice("Soldier", "https://alex.pheiffer.net/russia/images/0/03/Soldier0.png", "https://alex.pheiffer.net/russia/images/a/a1/Soldier1.png"),
        /* 12 */ CharacterChoice("Stalin", "https://alex.pheiffer.net/russia/images/9/91/Stalin0.png", "https://alex.pheiffer.net/russia/images/7/76/Stalin1.png"),
        /* 13 */ CharacterChoice("Female", "https://alex.pheiffer.net/russia/images/b/b4/Woman0.png", "https://alex.pheiffer.net/russia/images/8/86/Woman1.png")
    )

    private val mArray = arrayOf(
        Scene(
            "First Revolution",
            1905,
            MonthEnum.JANUARY,
            3,
            Pair(mCharacters[0], mCharacters[1]),
            "https://robertgraham.files.wordpress.com/2012/01/1905-russian-revolution.jpg",
                arrayOf("first","second","third"),
                arrayOf(Pair("ref1",null), Pair("ref2",null))
        ),
        Scene(
            "Bloody Sunday",
            1905,
            MonthEnum.JANUARY,
            22,
            // todo fix characters
            Pair(mCharacters[0], mCharacters[1]),
            "https://static.themoscowtimes.com/image/1360/d0/6355e1e36505412291792eb6e7f68d09.jpg",
                arrayOf("first","second","third"),
                arrayOf(Pair("ref1",null), Pair("ref2",null))
        ),
        Scene(
            "October Revolution",
            1917,
            MonthEnum.NOVEMBER,
            7,
            // todo fix characters
            Pair(mCharacters[0], mCharacters[1]),
            "https://teachwar.files.wordpress.com/2013/05/octrev.jpg?w=584",
                arrayOf("first","second","third"),
                arrayOf(Pair("ref1",null), Pair("ref2",null))
        ),
        Scene(
            "Post-Lenin Life",
            1924,
            null,
            null,
            // todo fix characters
            Pair(mCharacters[0], mCharacters[1]),
            "https://teachwar.files.wordpress.com/2013/05/octrev.jpg?w=584",
                arrayOf("first","second","third"),
                arrayOf(Pair("ref1",null), Pair("ref2",null))
        )
    )

    fun getList(): Array<Scene> {
        return mArray
    }

    fun getScene(index: Int): Scene {
        var i = index
        if (index < 0 || index >= mArray.size) {
            i = 0
        }
        return mArray[i]
    }


}