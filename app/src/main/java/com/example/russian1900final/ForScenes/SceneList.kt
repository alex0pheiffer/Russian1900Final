package com.example.russian1900final.ForScenes

import com.example.russian1900final.Glide.MonthEnum
import com.example.russian1900final.References.RefClass

class SceneList {

    // characters for scenes
    private val mCharacters = arrayOf<CharacterChoice>(
        /*  0 -Child*/ CharacterChoice("Child", "https://alex.pheiffer.net/russia/images/f/f8/Child0.png", "https://alex.pheiffer.net/russia/images/f/f9/Child1.png"),
        /*  1 -Cosmonaut*/ CharacterChoice("Cosmonaut", "https://alex.pheiffer.net/russia/images/a/ad/Cosmonaut0.png", "https://alex.pheiffer.net/russia/images/9/9c/Cosmonaut1.png"),
        /*  2 -Dog*/ CharacterChoice("Dog", "https://alex.pheiffer.net/russia/images/6/6a/Dog0.png", "https://alex.pheiffer.net/russia/images/c/c5/Dog1.png"),
        /*  3 -Emigrant*/ CharacterChoice("Emigrant", "https://alex.pheiffer.net/russia/images/f/f5/Emigrant0.png", "https://alex.pheiffer.net/russia/images/e/e4/Emigrant1.png"),
        /*  4 -Worker*/ CharacterChoice("Worker", "https://alex.pheiffer.net/russia/images/5/56/IndustrialWorker0.png", "https://alex.pheiffer.net/russia/images/4/41/IndustrialWorker1.png"),
        /*  5 -Lenin*/ CharacterChoice("Lenin", "https://alex.pheiffer.net/russia/images/6/60/Lenin0.png", "https://alex.pheiffer.net/russia/images/e/ed/Lenin1.png"),
        /*  6 -Male*/ CharacterChoice("Male", "https://alex.pheiffer.net/russia/images/6/69/Man0.png", "https://alex.pheiffer.net/russia/images/d/d7/Man1.png"),
        /*  7 -Mother*/ CharacterChoice("Mother", "https://alex.pheiffer.net/russia/images/1/13/Mother0.png", "https://alex.pheiffer.net/russia/images/5/5e/Mother1.png"),
        /*  8 -Noble*/ CharacterChoice("Noble", "https://alex.pheiffer.net/russia/images/8/84/NobleWoman0.png", "https://alex.pheiffer.net/russia/images/8/82/NobleWoman1.png"),
        /*  9 -Beliver*/ CharacterChoice("Believer", "https://alex.pheiffer.net/russia/images/e/eb/Prayer0.png", "https://alex.pheiffer.net/russia/images/9/9f/Prayer1.png"),
        /* 10 -Scientist*/ CharacterChoice("Scientist", "https://alex.pheiffer.net/russia/images/b/b9/Scientist0.png", "https://alex.pheiffer.net/russia/images/e/ef/Scientist1.png"),
        /* 11 -Soldier*/ CharacterChoice("Soldier", "https://alex.pheiffer.net/russia/images/0/03/Soldier0.png", "https://alex.pheiffer.net/russia/images/a/a1/Soldier1.png"),
        /* 12 -Stalin*/ CharacterChoice("Stalin", "https://alex.pheiffer.net/russia/images/9/91/Stalin0.png", "https://alex.pheiffer.net/russia/images/7/76/Stalin1.png"),
        /* 13 -Female*/ CharacterChoice("Female", "https://alex.pheiffer.net/russia/images/b/b4/Woman0.png", "https://alex.pheiffer.net/russia/images/8/86/Woman1.png"),
        // america should always be character1 (left side)
        /* 14 -USSR*/ CharacterChoice("USSR", "https://alex.pheiffer.net/russia/images/7/73/USSR0.png", "https://alex.pheiffer.net/russia/images/1/14/USSR1.png"),
        /* 15 -USA*/ CharacterChoice("USA", "https://alex.pheiffer.net/russia/images/5/53/American0.png", "https://alex.pheiffer.net/russia/images/b/b4/American1.png"),
        /* 16 -Politician*/ CharacterChoice("Politician", "https://alex.pheiffer.net/russia/images/a/a0/Politician0.png","https://alex.pheiffer.net/russia/images/2/2d/Politician1.png"),
        /* 17 -Putin*/ CharacterChoice("Putin", "https://alex.pheiffer.net/russia/images/d/dd/Putin0.png","https://alex.pheiffer.net/russia/images/d/d4/Putin1.png"),
        /* 18 -Gorby*/ CharacterChoice("Gorbachev","https://alex.pheiffer.net/russia/images/7/7c/Gorbachev0.png","https://alex.pheiffer.net/russia/images/3/3f/Gorbachev1.png"),
        /* 19 -Yeltsin*/ CharacterChoice("Yeltsin","https://alex.pheiffer.net/russia/images/a/a9/Yeltsin0.png","https://alex.pheiffer.net/russia/images/7/7c/Yeltsin1.png")

    )
    private val civilian = Civilian()

    private val mArray: Array<Scene>

    init {
        /*
        Bloody Sunday - January 22, 1905
         */
        val sub0_0 = SceneEndOption(mCharacters[4],
                arrayOf("As one of the industrial workers in the crowd, you shouted in protest of the Tsar’s treatment.",
                        "However, the soldiers outside the palace became nervous and reacted to the crowd.",
                        "You were killed by the soldiers."),
                true,
                "https://static.themoscowtimes.com/image/1360/d0/6355e1e36505412291792eb6e7f68d09.jpg")
        val sub0_1 = SceneEndOption(mCharacters[8],
        arrayOf("As someone of the upper class, you are not especially unhappy, but the recent actions of the “serfs” and workers make you nervous.",
                "Although you did not legally have serfs anymore (because of the Compromise in 1861), you still kept them on your land through life-long debts, and legislation like this increased your uncertainty."),
        false,
                "https://static.themoscowtimes.com/image/1360/d0/6355e1e36505412291792eb6e7f68d09.jpg")
        val scene0 = Scene(
                "Bloody Sunday",
                1905,
                MonthEnum.JANUARY,
                22,
                Pair(sub0_0, sub0_1),
                "https://www.socialistalternative.org/wp-content/uploads/2020/01/Demonstration_Pietarsaari_1905.jpg",
                "In the country of serfs and a handful industrial cities, the workers of St. Petersburg grew angry with their poor treatment. The people were still under Tsar Nicholas II, and were especially resentful of the recent Russo-Japanese War, a failure. In the petition of St. Petersburg, a crowd formed outside the Winter Palace to demand for better treatment and reform.",
                arrayOf(),
                arrayOf(RefClass("https://www.socialistalternative.org/wp-content/uploads/2020/01/Demonstration_Pietarsaari_1905.jpg", true),
                        RefClass("https://static.themoscowtimes.com/image/1360/d0/6355e1e36505412291792eb6e7f68d09.jpg", true))
        )

        /*
        February Revolution - March 8, 1917
         */
        val sub1_0 = SceneEndOption(mCharacters[4],
                arrayOf("You joined other workers and citizens in the streets to protest the Tsar. As a result of all the people’s efforts, the Tsar stepped down voluntarily and was replaced with the Provisional Government."),
                false,
                "https://media.iwm.org.uk/ciim5/15/655/super_000000.jpg")
        val sub1_1 = SceneEndOption(mCharacters[8],
                arrayOf("Tsar Nicholas II voluntarily steps down from his position of power. However, few changes affect your noble life directly, even if recent changes in government have become worrisome."),
                false,
                "https://static.themoscowtimes.com/image/1360/d0/6355e1e36505412291792eb6e7f68d09.jpg")
        val scene1 = Scene(
                "Feburary Revolution",
                1917,
                MonthEnum.MARCH,
                8,
                Pair(sub1_0, sub1_1),
                "https://teachwar.files.wordpress.com/2013/05/octrev.jpg?w=584",
                "The people are unhappy with the Tsar. WWI is in progress, and the public is hungry, tired of war, and ready for change. Massive demonstrations by the masses: Strikes by industrial workers, mutiny by soldiers, riots by women.",
                arrayOf(),
                arrayOf(RefClass("https://media.iwm.org.uk/ciim5/15/655/super_000000.jpg", true),
                        RefClass("https://teachwar.files.wordpress.com/2013/05/octrev.jpg?w=584", true),
                        RefClass("https://i.ytimg.com/vi/QpkjJ3JzaJc/hqdefault.jpg", true))
        )

        /*
        October Revolution - November 7, 1917
         */
        val sub2_0 = SceneEndOption(mCharacters[11],
                arrayOf("The Bolsheviks pulled out of WWI with the Treaty of Brest-Litovsk. Although it gave up a lot of land, including rich agricultural and industrial land, because many were unhappy with the war this is mostly overlooked.",
                        "However, before the treaty, many soldiers including yourself died because of the lack of industrialization and preparation by the Russian Empire."),
                true,
                "https://i.pinimg.com/originals/76/10/04/76100485c0d079a713b1eda5b57c74e2.jpg")
        val sub2_1 = SceneEndOption(mCharacters[5],
                arrayOf("Once the Bolsheviks established power one of the first things done is the Treaty of Brest-Litovsk to pull out of World War I, and next is industrializing the state, with you as the main political figure. You (all) are heavily influenced by Marxist thinking and The Communist Manifesto.",
                        "However, because there is no precedent for this new type of government nor does the Manifesto mention how to set up such a system, you and the Bolsheviks must create all of the structures themselves."),
                false,
                "https://cdn.britannica.com/78/121178-050-95767572/crowd-Vladimir-Ilyich-Lenin-Russian-Revolution-1917.jpg")
        val scene2 = Scene(
                "October Revolution",
                1917,
                MonthEnum.NOVEMBER,
                7,
                Pair(sub2_0, sub2_1),
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_EQFfFVcn74BuqgNbllEwq9pqwQJ_Wi99mA&usqp=CAU",
                "The Bolsheviks, a section of the Russian Social Democratic Labor Party, and some Socialist Revolutionaries are upset by the progressions of the war, so they launch a revolution and overtake the Provisional Government. The revolution is led by influential figures including Vladimir Lenin and Leon Trotsky.",
                arrayOf(RefClass("Engels, Friedrich & Marx, Karl. (1848). The Communist Manifesto.", false)),
                arrayOf(RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_EQFfFVcn74BuqgNbllEwq9pqwQJ_Wi99mA&usqp=CAU", true),
                        RefClass("https://i.pinimg.com/originals/76/10/04/76100485c0d079a713b1eda5b57c74e2.jpg", true),
                        RefClass("https://cdn.britannica.com/78/121178-050-95767572/crowd-Vladimir-Ilyich-Lenin-Russian-Revolution-1917.jpg", true))
        )

        /*
        Civil War - 1917
         */
        val sub3_0 = SceneEndOption(mCharacters[11],
                arrayOf("If you were fighting for the anti-Bolsheviks (Whites) your fellow fighting forces were disunified and varied in what they were fighting for.",
                        "A number of foreign nations also intervened, which would cause future distrust from the Soviet Union towards those countries (particularly the United States).",
                        "If you fought for the Bolsheviks (Reds) you may have had a slightly more organized army thanks to Trotsky, but both sides suffered heavy casualties and committed atrocities to the civilians. Everyone suffered from epidemics and famine.",
                        "By the end of the war in 1922, the Bolsheviks had won."),
                true,
                "https://i1.wp.com/militaryhistorynow.com/wp-content/uploads/2013/12/Russian-Civil-War.jpg?fit=480%2C500&ssl=1")
        val sub3_1 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("Regardless of your political stance, if you had one, you suffered greatly from the Civil War. Epidemics and famine affected everyone, soldiers and civilians.",
                        "Due to the new government and laws, many peasants (including yourself) stopped selling their products (food), which caused the economy to collapse and worsened the famine. Lenin’s policy of War Communism eventually started to take your supplies by force.",
                        "The war was chaotic and soldiers were also unkind to you. Many civilians suffered at their hands.",
                        "The war ended around 1922 with the Bolsheviks on top."),
                true,
                "https://i2.wp.com/www.military-history.org/wp-content/uploads/2017/10/Russia-ragged-cold-starving-RCW.jpg?resize=1024%2C786&ssl=1")
        val scene3 = Scene(
                "Civil War",
                1917,
                null,
                null,
                Pair(sub3_0, sub3_1),
                "https://i.redd.it/me74c1aycjy41.jpg",
                "After the Bolsheviks successfully revolted, different factions wanted control over Russia. As a result, the Russian Civil War broke out consisting of the Bolsheviks (Reds) and the anti-Bolsheviks (Whites), although many different forces would appear throughout the war including foreign intervention. The war spanned across the entire former Russian Empire and touched the lives of soldiers and civilians alike.",
                arrayOf(),
                arrayOf(RefClass("https://i.redd.it/me74c1aycjy41.jpg", true),
                        RefClass("https://i1.wp.com/militaryhistorynow.com/wp-content/uploads/2013/12/Russian-Civil-War.jpg?fit=480%2C500&ssl=1", true),
                        RefClass("https://i2.wp.com/www.military-history.org/wp-content/uploads/2017/10/Russia-ragged-cold-starving-RCW.jpg?resize=1024%2C786&ssl=1", true))
        )

        /*
        Positions on Women - 1918
         */
        val sub5_0 = SceneEndOption(mCharacters[6],
                arrayOf("The Soviet Union legalized abortion and took steps to make the procedure easily accessible.",
                        "There were policies that granted paid maternity leave and protected new mothers in the workplace.",
                        "Divorce procedures were also made easier, and reasons for divorce were allowed to be more reasonable.",
                        "Children born out of wedlock were given the same rights as legitimate children.",
                        "Women also retained the right to vote (although candidate and party choices were limited in the elections).",
                        "This was a period of drastic change and although there were many new forms of legislation, it was likely your attitudes towards women did not change much. You did recognize that there were influential women such as Vera Figner and Lenin’s wife, Nadezhda Krupskaya."),
                false,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Stamp_Soviet_Union_1976_4601.jpg/220px-Stamp_Soviet_Union_1976_4601.jpg")
        val sub5_1 = SceneEndOption(mCharacters[13],
                arrayOf("The Soviet Union legalized abortion and took steps to make the procedure easily accessible.\n" +
                        "There were policies that granted paid maternity leave and protected new mothers in the workplace.",
                        "Divorce procedures were also made easier, and reasons for divorce were more reasonable.",
                        "Children born out of wedlock were given the same rights as legitimate children.",
                        "Women retained the right to vote (although candidate and party choices were limited in the elections).",
                        "Although many of these laws made it easier for women to work, the laws also improved women’s quality of life as a whole. Although pay was still unequal (wage gap) and other inequalities still existed, there were many new rights gained for women."),
                false,
                "https://miro.medium.com/max/1500/0*6qgbltJZhEV1fBNg")
        val scene5 = Scene(
                "Positions on Women",
                1918,
                null,
                null,
                Pair(sub5_0, sub5_1),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Stamp_Soviet_Union_1976_4601.jpg/220px-Stamp_Soviet_Union_1976_4601.jpg",
                "Lenin sought to utilize women in the labor force, and gave them more equality. In Russia (by extension, the Soviet Union) it was easier to have more favorable attitudes towards women because the (Russian) culture had a more feminist tradition. “The Woman Question” was a constant discussion point in the early 20th century. Important books brought about this conversation, including “What Is to Be Done” written by Nikolai Chernyshevsky in 1863 and “Origins of the Family” by Engels, 1884. (The title date is made vague to explain the state’s attitudes towards women around this time).",
                arrayOf(),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Stamp_Soviet_Union_1976_4601.jpg/220px-Stamp_Soviet_Union_1976_4601.jpg", true),
                        RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Stamp_Soviet_Union_1976_4601.jpg/220px-Stamp_Soviet_Union_1976_4601.jpg", true),
                        RefClass("https://miro.medium.com/max/1500/0*6qgbltJZhEV1fBNg", true))
        )

        /*
        Positions on Religion - 1918
         */
        val sub6_0 = SceneEndOption(mCharacters[9],
                arrayOf("After the revolution it became harder to practice your religion openly. The government had confiscated most personal religious objects.",
                        "Religion and religious practices have not been outlawed, however, just frowned upon and criticized."),
                false,
                "https://eyeondesign.aiga.org/wp-content/uploads/2019/09/p38.jpg")
        val sub6_1 = SceneEndOption(mCharacters[0],
                arrayOf("You were not necessarily a child, but a younger person of the Soviet Union whose views were easily swayed by the propaganda of the state. The state praised science and rejected religious ideas.",
                        "Anti-semitism wasn’t an uncommon prejudice to have either.",
                        "You understand it was for the greater good and for a better future country to remove religious articles and private property."),
                false,
                "https://eyeondesign.aiga.org/wp-content/uploads/2019/09/p38.jpg")
        val scene6 = Scene(
                "Positions on Religion",
                1918,
                null,
                null,
                Pair(sub6_0, sub6_1),
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Alexander_Nevsky_Cathedral%2C_Baku.jpg/220px-Alexander_Nevsky_Cathedral%2C_Baku.jpg",
                "The Russian Revolution and the new Soviet Union was secular in nature. Since sacrifices were needed to be made for the state, religion was suppressed. This shift was to further industrialize the nation (science > religion) and move away from traditional values of Russia, among other reasons. (The title date is made vague to explain the state’s attitudes towards religion around this time).",
                arrayOf(RefClass("Babel, Isaac. Gedali.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Alexander_Nevsky_Cathedral%2C_Baku.jpg/220px-Alexander_Nevsky_Cathedral%2C_Baku.jpg", true),
                        RefClass("https://eyeondesign.aiga.org/wp-content/uploads/2019/09/p38.jpg", true),
                        RefClass("https://eyeondesign.aiga.org/wp-content/uploads/2019/09/p38.jpg", true))
        )

        /*
        Positions on Bourgeois - 1918
         */
        val sub7_0 = SceneEndOption(mCharacters[8],
                arrayOf("You and others who were previously a part of the upper class were ridiculed by most of the population, especially those who adopted the marxist attitudes of the revolution.",
                        "Those that remained in the Soviet Union were required to show their proof of work. Many fled the country and some were executed.",
                        "In \"The Way of Bitterness,\" Volkonskaia receives a summons to work on a pointless excavation of snow that was a task designated specifically for previous nobility.",
                        "She recalled how humiliating and degrading the task was, and she did not go the next time she received the message even though it could have had mortal consequences by ignoring it."),
                false,
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Sofia_Volkonskaya_by_Borovikovsky.jpg")
        val sub7_1 = SceneEndOption(mCharacters[4],
                arrayOf("As a member of the Soviet Union you were required to work and toil. Since everyone was equal, you were somewhat mentally alleviated by the fact that you were now superior to the Bourgeois who were taken down by the Revolution and put down by Marxist thinking."),
                false,
                "https://qph.fs.quoracdn.net/main-qimg-7d9f4f5ef3b4182d9c8f3cc76053c2eb-c")
        val scene7 = Scene(
                "Positions on Bourgeois",
                1918,
                null,
                null,
                Pair(sub7_0, sub7_1),
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Sofia_Volkonskaya_by_Borovikovsky.jpg",
                "In the early revolution it was unknown what to do with the previous nobility of Russia. Marxist principles did not have positive attitudes towards the bourgeois and the previous upper class were not treated kindly. (The title date is made vague to explain the state’s attitudes towards past nobles and upper class citizens around this time).",
                arrayOf(RefClass("Engels, Friedrich & Marx, Karl. (1848). The Communist Manifesto.", false),
                        RefClass("Volkonskaia, Sofia. (1931). The Way of Bitterness.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/d/d3/Sofia_Volkonskaya_by_Borovikovsky.jpg", true),
                        RefClass("https://upload.wikimedia.org/wikipedia/commons/d/d3/Sofia_Volkonskaya_by_Borovikovsky.jpg", true),
                        RefClass("https://qph.fs.quoracdn.net/main-qimg-7d9f4f5ef3b4182d9c8f3cc76053c2eb-c", true))
        )


        /*
        NEP - 1921
        */
        val sub4_0 = SceneEndOption(mCharacters[16],
                arrayOf("The government was facing a lot of problems at the end of the civil war. Although the NEP does not exactly follow communist ideals, it was a necessary step to revitalize the economy and to feed and appease the people (especially after War Communism).",
                        "You are also faced with other problems. Some post-war problems included depopulation of cities, infrastructure collapse, childcare (large orphan population), and unification of the country.",
                        "Other existing problems from the revolution were also still unsolved, such as how to structure a communist state as it has never been done before."),
                false,
                "https://www.inquiriesjournal.com/imgs/1200x1200/crop/article-images/uid-222-1056442730-3519/0ac487.png")
        val sub4_1 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("The NEP did little to immediately alleviate your problems and concerns.",
                        "Famine was still widespread, many people had been displaced and killed because of the war, and the constant changes with the government caused confusion and disorder.",
                        "You tried your best to fit in with the new order of society and feed your family."),
                false,
                "https://i2.wp.com/www.military-history.org/wp-content/uploads/2017/10/Russia-ragged-cold-starving-RCW.jpg?resize=1024%2C786&ssl=1")
        val scene4 = Scene(
                "NEP",
                1921,
                null,
                null,
                Pair(sub4_0, sub4_1),
                "https://ssoltanhistory.weebly.com/uploads/8/8/1/0/8810349/6810504_orig.jpg",
                "Due to the unsuccessful War Communism policy, the Bolsheviks instituted the New Economic Policy (NEP), a partial free-market reforms in order to stabilize the economy. This particularly applied to food supplies and was meant to help with the massive food shortage.",
                arrayOf(),
                arrayOf(RefClass("https://ssoltanhistory.weebly.com/uploads/8/8/1/0/8810349/6810504_orig.jpg", true),
                        RefClass("https://www.inquiriesjournal.com/imgs/1200x1200/crop/article-images/uid-222-1056442730-3519/0ac487.png", true),
                        RefClass("https://i2.wp.com/www.military-history.org/wp-content/uploads/2017/10/Russia-ragged-cold-starving-RCW.jpg?resize=1024%2C786&ssl=1", true))
        )

        mArray = arrayOf(scene0, scene1, scene2, scene3, scene5, scene6, scene7, scene4)
    }

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
    fun getScene(scene: Scene): Int {
        return mArray.indexOf(scene)
    }

    fun size(): Int {
        return mArray.size
    }


}