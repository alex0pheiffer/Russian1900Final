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
        /* 10 -Scientist*/ CharacterChoice("Intellectual", "https://alex.pheiffer.net/russia/images/b/b9/Scientist0.png", "https://alex.pheiffer.net/russia/images/e/ef/Scientist1.png"),
        /* 11 -Soldier*/ CharacterChoice("Soldier", "https://alex.pheiffer.net/russia/images/0/03/Soldier0.png", "https://alex.pheiffer.net/russia/images/a/a1/Soldier1.png"),
        /* 12 -Stalin*/ CharacterChoice("Stalin", "https://alex.pheiffer.net/russia/images/9/91/Stalin0.png", "https://alex.pheiffer.net/russia/images/7/76/Stalin1.png"),
        /* 13 -Female*/ CharacterChoice("Female", "https://alex.pheiffer.net/russia/images/b/b4/Woman0.png", "https://alex.pheiffer.net/russia/images/8/86/Woman1.png"),
        // america should always be character1 (left side)
        /* 14 -USSR*/ CharacterChoice("USSR", "https://alex.pheiffer.net/russia/images/7/73/USSR0.png", "https://alex.pheiffer.net/russia/images/1/14/USSR1.png"),
        /* 15 -USA*/ CharacterChoice("USA", "https://alex.pheiffer.net/russia/images/5/53/American0.png", "https://alex.pheiffer.net/russia/images/b/b4/American1.png"),
        /* 16 -Politician*/ CharacterChoice("Politician", "https://alex.pheiffer.net/russia/images/a/a0/Politician0.png","https://alex.pheiffer.net/russia/images/2/2d/Politician1.png"),
        /* 17 -Putin*/ CharacterChoice("Putin", "https://alex.pheiffer.net/russia/images/d/dd/Putin0.png","https://alex.pheiffer.net/russia/images/d/d4/Putin1.png"),
        /* 18 -Gorby*/ CharacterChoice("Gorbachev","https://alex.pheiffer.net/russia/images/7/7c/Gorbachev0.png","https://alex.pheiffer.net/russia/images/3/3f/Gorbachev1.png"),
        /* 19 -Yeltsin*/ CharacterChoice("Yeltsin","https://alex.pheiffer.net/russia/images/a/a9/Yeltsin0.png","https://alex.pheiffer.net/russia/images/7/7c/Yeltsin1.png"),
        /* 20 -Kulak*/ CharacterChoice("Kulak", "https://alex.pheiffer.net/russia/images/8/84/NobleWoman0.png", "https://alex.pheiffer.net/russia/images/8/82/NobleWoman1.png"),


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
                arrayOf("You joined other workers and citizens in the streets to protest the Tsar. As a result of all the people’s efforts, the Tsar stepped down voluntarily and was replaced with the Provisional Government.",
                "A large election was to be held which allowed lots of people to vote, including women!"),
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
                arrayOf(RefClass("Engels, F. & Marx, K. (1848). The Communist Manifesto.", false)),
                arrayOf(RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_EQFfFVcn74BuqgNbllEwq9pqwQJ_Wi99mA&usqp=CAU", true),
                        RefClass("https://i.pinimg.com/originals/76/10/04/76100485c0d079a713b1eda5b57c74e2.jpg", true),
                        RefClass("https://cdn.britannica.com/78/121178-050-95767572/crowd-Vladimir-Ilyich-Lenin-Russian-Revolution-1917.jpg", true),
                        RefClass("https://www.biography.com/.image/t_share/MTIwNjA4NjMzODgyNTEwODYw/vladimir-lenin-937", true))
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
                arrayOf(RefClass("Babel, I. Gedali.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Alexander_Nevsky_Cathedral%2C_Baku.jpg/220px-Alexander_Nevsky_Cathedral%2C_Baku.jpg", true),
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
                arrayOf(RefClass("Engels, F. & Marx, K. (1848). The Communist Manifesto.", false),
                        RefClass("Volkonskaia, S. (1931). The Way of Bitterness.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/d/d3/Sofia_Volkonskaya_by_Borovikovsky.jpg", true),
                        RefClass("https://qph.fs.quoracdn.net/main-qimg-7d9f4f5ef3b4182d9c8f3cc76053c2eb-c", true))
        )

        /*
        Ways of Life - 1918
        */
        val sub8_0 = SceneEndOption(mCharacters[4],
                arrayOf("There was now electricity that you could install in your communal apartment as the state became more industrialized.",
                        "You work long hours, you live in the cold, and you sometimes are very hungry, but you are able to use public services available. You can go to the bathhouse and use the provided services, though it too has its downsides, and can be an inconvenience.",
                        "Other provided services like transportation aren’t always timely either."),
                false,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4yGDdgCbKaISKVmhXdU7VCQ_4NWj5n45jbg&usqp=CAU")
        val sub8_1 = SceneEndOption(mCharacters[7],
                arrayOf("Women were being offered new positions in their lives. You no longer had to conform to the traditional family with the breadwinner husband as these customs “[had] no place in the family of the urban proletariat,” (Kollontai, 80).",
                        "In order to make your lives easier, common goods were made available so that women no longer had to perform many housekeeping tasks in addition to their daily paid labor.",
                        "Children in some places could be cared for outside of the home at state learning institutions, nurseries, homes, cafeterias, and various distribution centers for children goods."),
                false,
                "https://static.cambridge.org/binary/version/id/urn:cambridge.org:id:binary-alt:20181116032738-87880-smallThumb-00708fig3_4.jpg?pub-status=live")
        val scene8 = Scene(
                "Ways of Life",
                1918,
                null,
                null,
                Pair(sub8_0, sub8_1),
                "https://i.pinimg.com/originals/d4/38/f4/d438f4b30ace6fbb8aca46f2809be589.jpg",
                "The Soviet Union has changed how everyone must live. Many services were now available to you! (The title date is made vague to explain the state around this time).",
                arrayOf(RefClass("Zoshchenko, M. (1924). Electrification.", false),
                        RefClass("Zoshchenko, M. (1925). The Bathhouse.", false),
                        RefClass("Zoshchenko, M. (1927). The Galosh.", false),
                        RefClass("Zoshchenko, M. (1927). The Hat.", false),
                        RefClass("Kollontai, A. The Family and the Communist State.", false),
                        RefClass("Trotsky, L. From the Old Family to the New.", false)),
                arrayOf(RefClass("https://i.pinimg.com/originals/d4/38/f4/d438f4b30ace6fbb8aca46f2809be589.jpg", true),
                        RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4yGDdgCbKaISKVmhXdU7VCQ_4NWj5n45jbg&usqp=CAU", true),
                        RefClass("https://static.cambridge.org/binary/version/id/urn:cambridge.org:id:binary-alt:20181116032738-87880-smallThumb-00708fig3_4.jpg?pub-status=live", true))
        )

        /*
        NEP - 1921
        */
        val sub4_0 = SceneEndOption(mCharacters[16],
                arrayOf("The government was facing a lot of problems at the end of the civil war. Although the NEP does not exactly follow communist ideals, it was a necessary step to revitalize the economy and to feed and appease the people (especially after War Communism).",
                        "You are also faced with other problems. Some post-war problems included depopulation of cities, infrastructure collapse, childcare (large orphan population), and unification of the country.",
                        "Other existing problems from the revolution were also still unsolved, such as how to structure a communist state as it has never been done before."),
                false,
                "https://lh3.googleusercontent.com/proxy/JKG0bMZFGTlUMtD7ppW9ABSlYNILtuNxCaOgI5RJP32xbpDZk1nP7edc-hJFPko4BAft1QclgpBDXTJHZgoNeENKgfG10PmkSFiicObCjFxBmTArYGcRPlYvy0PG")
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
                        RefClass("https://lh3.googleusercontent.com/proxy/JKG0bMZFGTlUMtD7ppW9ABSlYNILtuNxCaOgI5RJP32xbpDZk1nP7edc-hJFPko4BAft1QclgpBDXTJHZgoNeENKgfG10PmkSFiicObCjFxBmTArYGcRPlYvy0PG", true),
                        RefClass("https://i2.wp.com/www.military-history.org/wp-content/uploads/2017/10/Russia-ragged-cold-starving-RCW.jpg?resize=1024%2C786&ssl=1", true))
        )

        /*
        Race and Ethnic Identity - 1925
        */
        val sub9_0 = SceneEndOption(mCharacters[15],
                arrayOf("Discrimination and prejudice heavily existed in America.",
                        "In the south Jim Crow Laws existed, making African American’s lives exceedingly difficult. The Soviet Union appealed to many African Americans due to their lack of segregation, discrimination, and their overall acceptance of various races.",
                        "The Soviet Union demonstrated (advertised) this in their movie “Circus” (1936)."),
                false,
                "https://jordanrussiacenter.org/wp-content/uploads/2013/08/280px-Orlova_Patterson_and_Stolyarov.jpg")
        val sub9_1 = SceneEndOption(mCharacters[14],
                arrayOf("The Soviet Union embraced the many different ethnic groups.",
                        "On their emblem around 1923 multiple languages were displayed equally.",
                        "In the next few decades, the Soviet Union would become increasingly Russian-centric in an effort to centralize the culture."),
                false,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Coat_of_arms_of_the_Soviet_Union_%281923%E2%80%931936%29.svg/240px-Coat_of_arms_of_the_Soviet_Union_%281923%E2%80%931936%29.svg.png")
        val scene9 = Scene(
                "Race and Ethnic Identity",
                1925,
                null,
                null,
                Pair(sub9_0, sub9_1),
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEzGBm66LdTJ3ewItHR1vI4qcOm5Pw9om-jg&usqp=CAU",
                "There were many different races and cultures within the large state called the Soviet Union. Initially the Soviet Union praised and embraced the many different languages and ethnic groups within its borders. (The title date is made vague to explain the state around this time).",
                arrayOf(RefClass("Aleksandrov, G. (Director). (1936). Circus [Film]. Mosfilm.", false)),
                arrayOf(RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEzGBm66LdTJ3ewItHR1vI4qcOm5Pw9om-jg&usqp=CAU", true),
                        RefClass("https://jordanrussiacenter.org/wp-content/uploads/2013/08/280px-Orlova_Patterson_and_Stolyarov.jpg", true),
                        RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Coat_of_arms_of_the_Soviet_Union_%281923%E2%80%931936%29.svg/240px-Coat_of_arms_of_the_Soviet_Union_%281923%E2%80%931936%29.svg.png", true))
        )

        /*
        Death of Lenin - January 21, 1924
        */
        val sub10_0 = SceneEndOption(mCharacters[4],
                arrayOf("Stalin became the next leader of the Soviet Union.",
                        "This period was filled with propaganda of optimism and a cheerful outlook on life. Socialist realism, a form of art which emphasises daily life, began to become popular and aligned with these joyful ideas.",
                        "There were new monumental building projects such as the Moscow Metro and the main building of Moscow State University in the stalinist gothic style.",
                        "You were working very hard to meet the quotas of Stalin’s Five Year Plan.",
                        "Women’s rights were reduced as the tone became more conservative.",
                        "You were likely not actively aware of it as an industrial worker, but your government was becoming totalitarianistic."),
                false,
                "https://upload.wikimedia.org/wikipedia/commons/d/da/Moscow_%E2%80%94_Main_building_of_Moscow_State_University.jpg")
        val sub10_1 = SceneEndOption(mCharacters[16],
                arrayOf("Stalin noticeably increased his political support after Lenin’s death, and soon became the head of the Soviet Union.",
                        "He began to rule in a totalitarianistic fashion, and spread propaganda with an optimistic and more conservative tone.",
                        "It was easy for you to be proud of the state now, thanks to Stalin.",
                        "Over the next decade and a half the Soviet press would “[boast] of new hydroelectric projects and blast furnaces (‘the biggest in the world!’), of modern technology in industry and agriculture, of aviators who broke long-distance records and polar explorers who survive the hazards of the Arctic North, of the setting up of kindergartens and the emancipation of women, of literacy schools and…--in short, of anything and everything that supported the claim that the Soviet Union was catching up and overtaking the West,” (Fitzpatrick, 70-71).",
                        "However, you also felt the pressures of consistent paranoia from the government.",
                        "Whatever position you held, you were probably fired or arrested within the next few years."),
                true,
                "https://static.independent.co.uk/s3fs-public/thumbnails/image/2008/05/14/12/27880.bin?w968h681")
        val scene10 = Scene(
                "Death of Lenin",
                1924,
                MonthEnum.JANUARY,
                21,
                Pair(sub10_0, sub10_1),
                "https://upload.wikimedia.org/wikipedia/commons/f/fb/Lenin%27s_funerals_by_I.Brodsky_%281925%29_detail_01.jpg",
                "Upon Lenin’s death the Soviet Union was unprepared for a transition of power. The state lacked an established procedure to elect or appoint a new leader. Lenin left a written letter to the First Congress of Soviets cautioning against Stalin and favoring Trotsky.",
                arrayOf(RefClass("Lenin, V. (1922). Letter to the First Congress of Soviets.", false),
                        RefClass("Fitzpatrick, S. (1999). Everyday Stalinism.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/f/fb/Lenin%27s_funerals_by_I.Brodsky_%281925%29_detail_01.jpg", true),
                        RefClass("https://upload.wikimedia.org/wikipedia/commons/d/da/Moscow_%E2%80%94_Main_building_of_Moscow_State_University.jpg", true),
                        RefClass("https://static.independent.co.uk/s3fs-public/thumbnails/image/2008/05/14/12/27880.bin?w968h681", true))
        )

        /*
        The Great Terror - 1936
        */
        val sub11_0 = SceneEndOption(mCharacters[10],
                arrayOf("You, too, were paranoid.",
                        "People around you were disappearing: some were fired and accused of being enemies of the state. Others were arrested, killed, forced into labor camps.",
                        "In “SecondHand Time,” the author explains how his father “..would recall how often, on returning to college after vacations, students wouldn’t find a single one of their old professors because they had all been arrested. They didn’t understand what was happening, but whatever it was, it was terrifying. Just as terrifying as war,” (Alexievich, 7)."),
                true,
                "https://media.newyorker.com/photos/5b4cba859316e42b3123fb1b/1:1/w_1118,h_1118,c_limit/Gessen-PB-PromoSocial2.jpg")
        val sub11_1 = SceneEndOption(mCharacters[20],
                arrayOf("Stalin began collectivization as a part of his first Five Year Plan. This displaced many peasants to farm on new lands throughout the Soviet Union.",
                        "Previous owners of many of these lands were you, Kulaks, wealthy peasants with land. You (all) were deported internally, and your possessions (most importantly land) were seized by the state.",
                        "This process was called dekulakization.",
                        "These mass movements of people, both normal peasants and kulaks, killed many.",
                        "There was also famine which plagued the citizens, which unlike the 1920s famine, could have been prevented."),
                true,
                "https://pbs.twimg.com/media/Dx7-G0RWwAcA36U.jpg")
        val scene11 = Scene(
                "Great Terror",
                1936,
                null,
                null,
                Pair(sub11_0, sub11_1),
                "https://media.newyorker.com/photos/5b4cba859316e42b3123fb1b/1:1/w_1118,h_1118,c_limit/Gessen-PB-PromoSocial2.jpg",
                "Stalin was the leader of the Soviet Union. Stalin and the government were filled with secrecy and conspiracies, causing them to be suspicious and paranoid. Secret police, an establishment which had been used during the civil war, were now known as the NKVD. Around this time, the government’s paranoia began to affect the entire state on a catastrophic level.",
                arrayOf(RefClass("Sources: Alexievich, S. (2013). Secondhand Time.", false)),
                arrayOf(RefClass("https://media.newyorker.com/photos/5b4cba859316e42b3123fb1b/1:1/w_1118,h_1118,c_limit/Gessen-PB-PromoSocial2.jpg", true),
                        RefClass("https://pbs.twimg.com/media/Dx7-G0RWwAcA36U.jpg", true))
        )

        /*
        Operation Barbarossa - June 22, 1941
        */
        val sub12_0 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("The army was not properly prepared for war. They lack proper supplies to fight, yet are sent out to confront the enemy despite this.",
                        "They are hardly able to protect themselves, and you suffer as a result of the German advances the army couldn’t prevent.",
                        "Germany began to colonize parts of Eastern Europe and forced displacement of the locals, killing millions. War crimes were also perpetrated on the civilians by the invaders."),
                true,
                "https://www.historycrunch.com/uploads/4/1/1/6/41169839/edited/hcwwii.jpeg")
        val sub12_1 = SceneEndOption(mCharacters[12],
                arrayOf("Although you had intelligence that the Germans were likely to attack, you did little to prepare for this.",
                        "In fact, your purges in the late 1930s had removed thousands of officers from the Red Army.",
                        "Useful vehicles, ammunition, and other necessary supplies for the army were not mobilized as quickly as it could have and with the lacking of higher ranking personnel, the army was not in good fighting condition.",
                        "You suffered tremendous losses in the first year of the war. However, you did not advertise this and instead presented yourself as a strategic leader in the fight against the Germans."),
                false,
                "https://www.ducksters.com/biography/joseph_stalin.jpg")
        val scene12 = Scene(
                "Operation Barbarossa",
                1941,
                MonthEnum.JUNE,
                22,
                Pair(sub12_0, sub12_1),
                "https://cdn.britannica.com/54/60154-050-B02509B6/Joseph-Stalin-1950.jpg",
                "Germany had attacked the USSR with Operation Barbarossa! WWII had been raging on to the left and the right of the Soviet Union, and now it had been pulled into it as well. Under Stalin’s “great” leadership, did you survive and what happened next?",
                arrayOf(RefClass("The Fallen of World War II (dir. Neil Halloran)", false)),
                arrayOf(RefClass("https://cdn.britannica.com/54/60154-050-B02509B6/Joseph-Stalin-1950.jpg", true),
                        RefClass("https://www.historycrunch.com/uploads/4/1/1/6/41169839/edited/hcwwii.jpeg", true),
                        RefClass("https://www.ducksters.com/biography/joseph_stalin.jpg", true))
        )

        /*
        Battle of Stalingrad - Aug 23, 1942
        */
        val sub13_0 = SceneEndOption(mCharacters[11],
                arrayOf("The battle of Stalingrad was grueling and bloody.",
                        "Being an industrial city, the Axis powers wanted to capture the city to cut off Soviet supplies.",
                        "No matter which side you fought for, you were likely to have died. Hundreds of thousands of soldiers died.",
                        "However, Soviet soldiers successfully stopped the Axis progression east, and “won” the battle."),
                true,
                "https://phototass4.cdnvideo.ru/width/1020_b9261fa1/tass/m2/en/uploads/i/20180202/1186565.jpg")
        val sub13_1 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("Unfortunately, in the war the citizens of the Soviet Union were not spared of the bloodshed that occurred from the battles.",
                        "You were likely to have been injured or killed in the Battle of Stalingrad.",
                        "In other places in the Soviet Union, Stalin was still persecuting, arresting, and killing people for being enemies of the state, so civilians were not necessarily killed only by the German attacks."),
                true,
                "https://historycouk.s3.eu-west-2.amazonaws.com/s3fs-public/styles/768x432/public/2020-07/statue_in_the_center_of_stalingrad_after_nazi_air_strikes_1942.jpg")
        val scene13 = Scene(
                "Battle of Stalingrad",
                1942,
                MonthEnum.AUGUST,
                23,
                Pair(sub13_0, sub13_1),
                "https://www.thoughtco.com/thmb/wss8qH3O2Xmh7pOgThE6OfYCb4g=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/c051107378bbbe284b75100dfc360088-5933c54c3df78c08aba52512.jpg",
                "Stalingrad was an industrial city in southwest Russia where a major battle of the Eastern Front took place. It lasted roughly 5 months.",
                arrayOf(RefClass("The Fallen of World War II (dir. Neil Halloran)", false)),
                arrayOf(RefClass("https://www.thoughtco.com/thmb/wss8qH3O2Xmh7pOgThE6OfYCb4g=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/c051107378bbbe284b75100dfc360088-5933c54c3df78c08aba52512.jpg", true),
                        RefClass("https://phototass4.cdnvideo.ru/width/1020_b9261fa1/tass/m2/en/uploads/i/20180202/1186565.jpg", true),
                        RefClass("https://historycouk.s3.eu-west-2.amazonaws.com/s3fs-public/styles/768x432/public/2020-07/statue_in_the_center_of_stalingrad_after_nazi_air_strikes_1942.jpg", true))
        )

        /*
        Life as an émigré - 1945
        */
        val sub14_0 = SceneEndOption(mCharacters[10],
                arrayOf("Under Stalin, emigration was nearly impossible.",
                        "In the first wave the people were ideologically diverse. The Soviet Union decided to strip emigres of their nationality in 1921, and this created a large population of stateless people.",
                        "The second wave included people who had been seized by the Axis powers and soldiers who fled, working people, civilians, and you.",
                        "You (all) left with the intention of never returning.",
                        "Nabokov explained in “Speak, Memory” how life was very difficult for émigrés, and not just because their entire lives changed. As an intellectual— a writer— making a living was difficult and would require a multitude of jobs.",
                        "“Writing a weekly column for an emigre paper was never quite sufficient to keep the body and pen together,” (Nabokov, 283) Nabokov wrote.",
                        "Dovlatov, another émigré writer, made a similar note: “Back home there was no freedom, but there were readers. Here there was freedom enough, but readers were missing,” (Dovlatov, 602).",
                        "With few fellow Russians outside of Russia, making a living with the skills you (all) knew was more difficult."),
                false,
                "https://d3525k1ryd2155.cloudfront.net/h/120/237/953237120.0.m.jpg")
        val sub14_1 = SceneEndOption(mCharacters[4],
                arrayOf("With few fellow Russians outside of Russia, making a living with the skills they knew was more difficult.",
                        "Dovlatov describes the neighborhood he lived in after he emigrated to the United States as “six brick buildings clustered around a supermarket, inhabited primarily by Russians...or, as the newspapers put it, émigrés of the third wave,” (Dovlatov, 600).",
                        "He expressed how those in the neighborhood stayed together, and if “[they heard] english spoken, [they grew] wary,” (Dovlatov, 600). Their lack of separation from their own people made it even harder for them to develop jobs using more advanced skills they may have known, for example writing.",
                        "Other skills were inapplicable in the new location, though. A former lawyer became a deli operator. A marxist scholar and former artist were both now cab drivers.",
                        "It wasn’t that their professions weren’t important, but there was no demand for them anymore.",
                        "You are likely the same, now performing a blue-collar job though you have the abilities to do more advanced work."),
                false,
                "https://media.newyorker.com/photos/590950eac14b3c606c1035d0/16:9/w_1280,c_limit/dovlatov-pushkin-hills.jpg")
        val scene14 = Scene(
                "Life as an émigré",
                1945,
                null,
                null,
                Pair(sub14_0, sub14_1),
                "https://encyclopedia.ushmm.org/images/large/db1f759d-8d5e-44e6-a81d-3a3b17869598.gif.pagespeed.ce.yZAHlLSGYv.gif",
                "People fled in waves from the Soviet Union. The first was from 1917 to around the 1920s, the second was post WWII, the third was from the 1980s to about 1991, and there is a fourth wave from 1991 to the present. (This section makes note of the first wave, but mostly speaks of the second and third. The date for this section is widely vague, as the emigration occurs across a long expansion of time.)",
                arrayOf(RefClass("Nabokov, V. Speak, Memory.", false),
                        RefClass("Dovlatov, S. (1986). 108th Street.", false)),
                arrayOf(RefClass("https://encyclopedia.ushmm.org/images/large/db1f759d-8d5e-44e6-a81d-3a3b17869598.gif.pagespeed.ce.yZAHlLSGYv.gif", true),
                        RefClass("https://d3525k1ryd2155.cloudfront.net/h/120/237/953237120.0.m.jpg", true),
                        RefClass("https://media.newyorker.com/photos/590950eac14b3c606c1035d0/16:9/w_1280,c_limit/dovlatov-pushkin-hills.jpg", true))
        )

        /*
        Post Great Patriotic War - 1945
        */
        val sub15_0 = SceneEndOption(mCharacters[13],
                arrayOf("As a woman, you would have been able to participate in the war. In the Soviet Union, women during the war could participate directly in the army or airforce.",
                        "They also served as medical personnel.",
                        "As most women in countries all over the world during WWII, you were given more freedom than previously.",
                        "Even if you weren’t working for the military, there were less men around you (due to drafting) and you were given more independent tasks that didn’t rely on a male counterpart.",
                        "In the movie “Wings,” a previous pilot, Nadezhda, finds her postwar life stifling in contrast to the freedom of wartime. She had a sound, successful career in the postwar Soviet Union, but was still unhappy with her current extent of life since she lacks the freedoms she had before.",
                        "For example, she can’t go out to a nice dinner without a male escort."),
                false,
                "https://www.remake-festival.de/fileadmin/bilder/Bilder_fuer_Filmseiten/2019/wings.jpg")
        val sub15_1 = SceneEndOption(mCharacters[6],
                arrayOf("Most men died during the Great Patriotic War. After the war in major cities there was an obvious difference between male and female populations.",
                        "However, unlike women, you did not experience much difference in your average life after the war other than possibly being given war medals or credit for your service (likely much later)."),
                false,
                "https://www.hpcbristol.net/sites/default/files/styles/original2/public/image-library/fu-n452.jpg?itok=GcS8o6j5")
        val scene15 = Scene(
                "Post Great Patriotic War",
                1945,
                null,
                null,
                Pair(sub15_0, sub15_1),
                "https://www.remake-festival.de/fileadmin/bilder/Bilder_fuer_Filmseiten/2019/wings.jpg",
                "The Great Patriotic War, or WWII, ended in 1945. The Soviet Union had lost hundreds of thousands of people: many more than any other nation that fought in the war. During the war people were able to experience things they couldn’t during times of peace. After the war, some of these freedoms became restricted once more.",
                arrayOf(RefClass("Shepitko, L. (Director). (2008). Wings [Film]. Mosfilm.", false)),
                arrayOf(RefClass("https://www.remake-festival.de/fileadmin/bilder/Bilder_fuer_Filmseiten/2019/wings.jpg", true),
                        RefClass("https://www.hpcbristol.net/sites/default/files/styles/original2/public/image-library/fu-n452.jpg?itok=GcS8o6j5", true))
        )

        /*
        Death of Stalin - March 5, 1953
        */
        val sub16_0 = SceneEndOption(mCharacters[12],
                arrayOf("You are now dead."),
                true,
                "https://englishrussia.com/wp-content/uploads/2019/03/213.jpg")
        val sub16_1 = SceneEndOption(mCharacters[16],
                arrayOf("On February 24-25, 1956, Nikita Khrushchev delivered his secret speech to the 20th party congress. In his speech, Khrushchev denounced Stalin and stated that what he did was wrong.",
                        "“Stalin originated the concept ‘enemy of the people.’ This term automatically made it unnecessary that the ideological errors of a man or men engaged in a controversy be proven,” (Khrushchev).",
                        "Khrushchev declared that the state now needed to fix the things Stalin did wrong.",
                        "Khrushchev began to remove the harsh laws and constructs formed under Stalin. He relaxed the censorship and released millions from the prison camps, since most were arrested under false pretenses.",
                        "This period was known as the Thaw.",
                        "However, Khrushchev said his speech to people who were given their positions of power because of Stalin, including yourself, and feeling threatened, those you and other politicians eventually led to Khrushchev’s downfall."),
                false,
                "https://i.pinimg.com/originals/fe/f6/06/fef60663788e73b90007d6f91a190333.jpg")
        val scene16 = Scene(
                "Death of Stalin",
                1953,
                MonthEnum.MARCH,
                5,
                Pair(sub16_0, sub16_1),
                "https://upload.wikimedia.org/wikipedia/commons/7/78/Stalin%27s_funeral_procession_leaving_Manezhnaya_Square.jpg",
                "Stalin died of natural causes on March 5th, 1953. People mourned him all over the Soviet Union. “People were lost and bewildered without [Stalin]. All of Russia wept,” (Evgenii, 1). A new struggle for power began.",
                arrayOf(RefClass("Evtushenko, E. Memoir.", false),
                        RefClass("Khrushchev, N. (1956). SPEECH TO THE 20TH PARTY CONGRESS.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/commons/7/78/Stalin%27s_funeral_procession_leaving_Manezhnaya_Square.jpg", true),
                        RefClass("https://i.pinimg.com/originals/fe/f6/06/fef60663788e73b90007d6f91a190333.jpg", true),
                        RefClass("https://englishrussia.com/wp-content/uploads/2019/03/213.jpg", true),
                        RefClass("https://cdn.britannica.com/54/60154-050-B02509B6/Joseph-Stalin-1950.jpg", true))
        )

        /*
        Space Race - 1955
        */
        val sub17_0 = SceneEndOption(mCharacters[15],
                arrayOf("The United States did not make as many advancements as the Soviet Union during the space race, and did not launch their first successful satellite into orbit until January 31, 1958 with Explorer 1.",
                        "However, the United States did reach the moon, a feat which, in the west, usually overshadows the other advancements the Soviet Union made."),
                false,
                "https://thumbs-prod.si-cdn.com/OTFrA6CdG4XrmCfEdyXLpK6RD0U=/fit-in/1600x0/https://public-media.si-cdn.com/filer/86/57/86572418-0658-4754-b335-5804f5b46ed2/10_02_2014_man_on_the_moon.jpg")
        val sub17_1 = SceneEndOption(mCharacters[14],
                arrayOf("The first item put into orbit was Sputnik on October 4, 1957. The Soviets were very successful throughout the entire space race, making countless advancements in the fields of engineering and science.",
                        "They had both men and women working hard to put animals, humans, and other things like space stations into orbit."),
                false,
                "https://i.pinimg.com/originals/53/5e/e7/535ee7686a3fbb90e2a290c8fdfb6aa7.jpg")
        val scene17 = Scene(
                "Space Race",
                1955,
                null,
                null,
                Pair(sub17_0, sub17_1),
                "https://www.paolacasoli.com/wp-content/uploads/2014/12/Sapce-Race-Propaganda_G-Pallotta_-poster-1.jpg",
                "The Space Race was a scientific battle between the Soviet Union and the United States. Both sides tried to display their technological (military) strength, and they fought to make new advancements in space technology.",
                arrayOf(),
                arrayOf(RefClass("https://thumbs-prod.si-cdn.com/OTFrA6CdG4XrmCfEdyXLpK6RD0U=/fit-in/1600x0/https://public-media.si-cdn.com/filer/86/57/86572418-0658-4754-b335-5804f5b46ed2/10_02_2014_man_on_the_moon.jpg", true),
                        RefClass("https://i.pinimg.com/originals/53/5e/e7/535ee7686a3fbb90e2a290c8fdfb6aa7.jpg", true),
                        RefClass("https://www.paolacasoli.com/wp-content/uploads/2014/12/Sapce-Race-Propaganda_G-Pallotta_-poster-1.jpg", true))
        )

        /*
        Cosmonauting - 1955
        */
        val sub18_0 = SceneEndOption(mCharacters[2],
                arrayOf("The Soviet Union used dogs (you) as test subjects for trying to put life support in space.",
                        "You were chosen for multiple reasons, including having “[your] physiology...very well-studied, [that] [you] adapt well to training, and [you] are very communicative and social…[Dogs] were also cheap and readily available,” (Nelson, 136).",
                        "Although many dogs died or were injured in the research, many others were able to orbit in space successfully.",
                        "The first and most notable dog put into space was Laika.",
                        "You (all) became symbolic heroes to the Soviet Union."),
                true,
                "https://images-na.ssl-images-amazon.com/images/I/61OxjiPPKoL._AC_SX425_.jpg")
        val sub18_1 = SceneEndOption(mCharacters[1],
                arrayOf("The first man to orbit the earth was Yuri Gagarin with Vostok 1 on April 12th, 1961.",
                        "He completed one orbit successfully. The Soviets also launched the first woman into space, Valentina Tereshkova, aboard Vostok 6 on June 16th, 1963.",
                        "You were very popular in the media as society was engrossed in the space race and Soviet space accomplishments."),
                false,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHXgpZB5NVFjqrU1vLcLuQkpZf7SA9Ey61yQ&usqp=CAU")
        val scene18 = Scene(
                "Cosmonauting",
                1955,
                null,
                null,
                Pair(sub18_0, sub18_1),
                "https://i.insider.com/4f982767ecad04257200003d?width=600&format=jpeg&auto=webp",
                "The Soviet Union was the first to put a living being in orbit (dog!) as well as a human being. Of the many scientific discoveries and advancements, these two stood out well in the media and public eye, making the cosmonauts and cosmo-dogs heroes.",
                arrayOf(RefClass("Griswold, R. (2012). Russian Blonde in Space.", false),
                        RefClass("Nelson, A. Cold War Celebrity and the Courageous Canine Scout.", false)),
                arrayOf(RefClass("https://i.insider.com/4f982767ecad04257200003d?width=600&format=jpeg&auto=webp", true),
                        RefClass("https://images-na.ssl-images-amazon.com/images/I/61OxjiPPKoL._AC_SX425_.jpg", true),
                        RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHXgpZB5NVFjqrU1vLcLuQkpZf7SA9Ey61yQ&usqp=CAU", true))
        )

        /*
        Death of Brezhnev- 10 November 1982
        */
        val sub19_0 = SceneEndOption(mCharacters[4],
                arrayOf("Most citizens, including yourself, weren’t well aware of the state of the current economy.",
                        "You just knew it wasn’t as good as it had been about ten years before.",
                        "After/during Gorbachev’s new reforms, experiences like the one Alexievich had when he was “...walking home from the movies and stumbled on a man lying in a pool of blood… [became] a familiar sight,” (Alexievich, 32).",
                        "You were overall not very happy with these new policies. Some see these last years of the Soviet Union as a period of cultural and intellectual richness, or material deprivation."),
                false,
                "https://pbs.twimg.com/media/Dnm8hqkWsAAsGEj.jpg")
        val sub19_1 = SceneEndOption(mCharacters[18],
                arrayOf("You became the last leader of the Soviet Union. You were the first and only president of the Soviet Union from 1990-1991.",
                        "You were aware of the problems in the Soviet Union and began “perestroika” to restructure the economic and political system.",
                        "By introducing more free-market policies and reforms, other unintended consequences arose, such as gangs.",
                        "You genuinely wanted reform. You wanted for people to have the opportunity to publicly, critically discuss their opinions, but instead it became an outpouring of resentment.",
                        "The public learned about the Soviet’s disastrous response to German invasion in the Great Patriotic War and about projects and actions back to 1917, especially since criticism of Stalin AND LENIN/OCTOBER REVOLUTION was now possible.",
                        "There was also a sudden inflow of western goods. This sudden confrontation with so many new things and negative opinions of the “once great” history seemed to make the public restless and unhappy."),
                false,
                "https://cdn.britannica.com/71/194471-050-06A60E75/Mikhail-Gorbachev-1991.jpg")
        val scene19 = Scene(
                "Death of Brezhnev",
                1982,
                MonthEnum.NOVEMBER,
                10,
                Pair(sub19_0, sub19_1),
                "https://pbs.twimg.com/media/Dnm8hqkWsAAsGEj.jpg",
                "A peak occurred under Brezhnev. During his time in office there was an emphasis on stability,  with lots of war awards being given. Public health and life expectancy improved (or didn’t decrease) and the quality living peaked. After his death, a series of leaders in poor health followed him, each which didn’t last long. Finally in 1985, Mikhail Gorbachev became the next leader of the Soviet Union.",
                arrayOf(RefClass("Alexievich, S. (2013). Secondhand Time.",false)),
                arrayOf(RefClass("https://pbs.twimg.com/media/Dnm8hqkWsAAsGEj.jpg", true),
                        RefClass("https://cdn.britannica.com/71/194471-050-06A60E75/Mikhail-Gorbachev-1991.jpg", true),
                        RefClass("https://karsh.org/wordpress/wp-content/uploads/2017/06/Yousuf-Karsh-Mikhail-Gorbachev.jpg", true))
        )

        /*
        Chernobyl disaster - April 26, 1986
        */
        val sub20_0 = SceneEndOption(mCharacters[11],
                arrayOf("Tens of thousands of people in nearby cities were evacuated, and the cities were quickly abandoned.",
                        "You, some of the first responders and military that had come to clean up the disaster area, had to remove the soil and other contaminated debris as quickly as possible.",
                        "Since officials were trying to desperately clean this, little safety measures were taken.",
                        "Thousands of square miles were contaminated and are still inaccessible today (2020) without proper permission and equipment.",
                        "Many died from radiation poisoning."),
                true,
                "https://i.pinimg.com/originals/8d/19/f1/8d19f1339eae2f657ce0fa6bf74fe041.jpg")
        val sub20_1 = SceneEndOption(mCharacters[18],
                arrayOf("Having been relatively new to power, already having caused some displeasure to the citizens, and now having the promise of a technological future being undermined by the Chernobyl disaster, you were not thought of highly by the people.",
                        "This event produced nuclear anxiety, distrust of the government with dangerous technology, and caused the public to question the government’s ability to protect its citizens.",
                        "In response, you lessened the restrictions on the press to allow for more transparency of what happened at the disaster."),
                false,
                "https://ars.els-cdn.com/content/image/1-s2.0-S1350448712001680-gr1.jpg")
        val scene20 = Scene(
                "Chernobyl Disaster",
                1986,
                MonthEnum.APRIL,
                26,
                Pair(sub20_0, sub20_1),
                "https://inapcache.boston.com/universal/site_graphics/blogs/bigpicture/chernobyl_25th_anniversary/bp2.jpg",
                "Soon after Gorbachev became head of the Soviet Union a nuclear power plant in Chernobyl had a steam explosion issue due to faulty cooling systems and a power failure, which resulted in radioactive meltdown and contamination. ",
                arrayOf(),
                arrayOf(RefClass("https://inapcache.boston.com/universal/site_graphics/blogs/bigpicture/chernobyl_25th_anniversary/bp2.jpg", true),
                        RefClass("https://i.pinimg.com/originals/8d/19/f1/8d19f1339eae2f657ce0fa6bf74fe041.jpg", true),
                        RefClass("https://ars.els-cdn.com/content/image/1-s2.0-S1350448712001680-gr1.jpg", true),
                        RefClass("https://karsh.org/wordpress/wp-content/uploads/2017/06/Yousuf-Karsh-Mikhail-Gorbachev.jpg", true))
        )

        /*
        Baltic States - March 1991
        */
        val sub21_0 = SceneEndOption(mCharacters[14],
                arrayOf("The break away of the Baltic states helped to precipitate the fall of the Soviet Union.",
                        "One of the remarkable things about the fall was that Gorbachev had the ability to oppose its disintegration, and chose not to. It was a peaceful disintegration."),
                false,
                "https://lh3.googleusercontent.com/proxy/LeXWXWN0jUL1gfdbvnB9cmIpGEPZyaMUC_LfUOfTVHDdjxZ7xsr0F4GVNAF8e2Vne0P9dFE0CrrZr_eRs-gFcOmS_aXdvVjeqjbZMXbrySyERInoggea4IkdftnzH5U535cq7dhZWXc")
        val sub21_1 = SceneEndOption(mCharacters[18],
                arrayOf("The independence of these states was some of the first signs of the collapse of the Soviet Union which would occur later in 1991.",
                        "It did not collapse because of military defeat, but because you had the ability to oppose its disintegration, and chose not to."),
                false,
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMd_fH4K31EXzaeI0fkpClGGVHOPorpTh0Pw&usqp=CAU")
        val scene21 = Scene(
                "Baltic States",
                1991,
                MonthEnum.MARCH,
                null,
                Pair(sub21_0, sub21_1),
                "https://lh3.googleusercontent.com/proxy/LeXWXWN0jUL1gfdbvnB9cmIpGEPZyaMUC_LfUOfTVHDdjxZ7xsr0F4GVNAF8e2Vne0P9dFE0CrrZr_eRs-gFcOmS_aXdvVjeqjbZMXbrySyERInoggea4IkdftnzH5U535cq7dhZWXc",
                "Massive public protests began to occur in Lithuania, Latvia, and Estonia. The Soviet State did nothing to prevent their declarations of sovereignty. Many people in the Baltic States felt they were forcibly annexed into the Soviet Union, and it was not surprising they were some of the first to break away.",
                arrayOf(),
                arrayOf(RefClass("https://lh3.googleusercontent.com/proxy/LeXWXWN0jUL1gfdbvnB9cmIpGEPZyaMUC_LfUOfTVHDdjxZ7xsr0F4GVNAF8e2Vne0P9dFE0CrrZr_eRs-gFcOmS_aXdvVjeqjbZMXbrySyERInoggea4IkdftnzH5U535cq7dhZWXc", true),
                        RefClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMd_fH4K31EXzaeI0fkpClGGVHOPorpTh0Pw&usqp=CAU", true),
                        RefClass("https://karsh.org/wordpress/wp-content/uploads/2017/06/Yousuf-Karsh-Mikhail-Gorbachev.jpg", true))
        )

        /*
        Coup - August 1991
        */
        val sub22_0 = SceneEndOption(mCharacters[19],
                arrayOf("You, the leader of Russia, emerged as the hero of the protests and your popularity increased.",
                        "In early December of 1991 you met with the leaders of Ukraine and Belarus in a forest without Gorbachev and created the Commonwealth of Independent States (CIS).",
                        "These three countries (Russia, Ukraine, and Belarus) essentially declared that they were no longer a part of the Soviet Union."),
                false,
                "https://c.files.bbci.co.uk/E9C3/production/_92934895_gorbyeltsin19aug91ap.jpg")
        val sub22_1 = SceneEndOption(mCharacters[18],
                arrayOf("With Yeltsin’s success with the protests against the coup, your popularity decreased significantly.",
                        "In fact, many didn’t see you as the leader anymore because of the various events that had been recently occurring.",
                        "The possibility of the disintegration of the Soviet Union was now more plausible and apparent to the public.",
                        "On new years eve of 1991, you announced your resignation and the Soviet Union was officially dissolved."),
                false,
                "https://i.ytimg.com/vi/028gd8Sn3m0/hqdefault.jpg")
        val scene22 = Scene(
                "Coup",
                1991,
                MonthEnum.AUGUST,
                null,
                Pair(sub22_0, sub22_1),
                "https://static.themoscowtimes.com/image/1360/22/6e3c435bc36147c78c98a127244debfa.jpg",
                "Unhappy with Gorbachev, some military hardliners tried to place him under house arrest and stage a coup. However, this coup wasn’t supported by the masses and there were massive public protests against the coup.",
                arrayOf(),
                arrayOf(RefClass("https://static.themoscowtimes.com/image/1360/22/6e3c435bc36147c78c98a127244debfa.jpg", true),
                        RefClass("https://i.ytimg.com/vi/028gd8Sn3m0/hqdefault.jpg", true),
                        RefClass("https://c.files.bbci.co.uk/E9C3/production/_92934895_gorbyeltsin19aug91ap.jpg", true),
                        RefClass("https://cdn-live.foreignaffairs.com/sites/default/files/styles/x_large_1x/public/public-assets/images/articles/2015/05/26/boris_yeltsin_21_february_1989-1.jpg?itok=R4yPL9Qd", true),
                        RefClass("https://karsh.org/wordpress/wp-content/uploads/2017/06/Yousuf-Karsh-Mikhail-Gorbachev.jpg", true))
        )

        /*
        Russian Federation - 1992
        */
        val sub23_0 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("You are not particularly happy with the circumstances around 1991-2000.",
                        "After the Soviet Union collapsed, a few people became the new administrators of previously state-owned businesses, and suddenly became incredibly wealthy.",
                        "The economy was doing incredibly poorly. With the election of Putin in 2000 and the sudden improvement in the quality of life, you began to support Putin."),
                false,
                "https://upload.wikimedia.org/wikipedia/en/4/4f/BrotherPoster.jpg")
        val sub23_1 = SceneEndOption(mCharacters[19],
                arrayOf("You begin to try to reform the Russian Federation, a now separate state from the Soviet Union, but these new reforms do not have the effects that you had hoped they would.",
                        "The quality of life and economy dip dramatically between 1991 and 2000. In 1999, you appointed Putin to be the acting Prime Minister.",
                        "In 2000, Putin became the President."),
                false,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Vladimir_Putin_taking_the_Presidential_Oath%2C_7_May_2000.jpg/240px-Vladimir_Putin_taking_the_Presidential_Oath%2C_7_May_2000.jpg")
        val scene23 = Scene(
                "Russian Federation",
                1992,
                null,
                null,
                Pair(sub23_0, sub23_1),
                "https://static01.nyt.com/images/2017/04/16/books/review/16Menon/16Menon-superJumbo.jpg",
                "In the following years after the collapse of the Soviet Union, the Russian economy collapsed. Russia's economy was fully opened to global competition, but this only shows that the Russian businesses were incapable of competing on the international market. Unemployment became widespread, the state was deprived of resources, and the public health system collapsed. This resulted in a significant drop in life expectancy.",
                arrayOf(RefClass("Balabanov, A. (Director). (1997). Brother [Film]. CTB Film Company.", false)),
                arrayOf(RefClass("https://upload.wikimedia.org/wikipedia/en/4/4f/BrotherPoster.jpg", true),
                        RefClass("https://static01.nyt.com/images/2017/04/16/books/review/16Menon/16Menon-superJumbo.jpg", true),
                        RefClass("https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Vladimir_Putin_taking_the_Presidential_Oath%2C_7_May_2000.jpg/240px-Vladimir_Putin_taking_the_Presidential_Oath%2C_7_May_2000.jpg", true),
                        RefClass("https://cdn-live.foreignaffairs.com/sites/default/files/styles/x_large_1x/public/public-assets/images/articles/2015/05/26/boris_yeltsin_21_february_1989-1.jpg?itok=R4yPL9Qd", true))
        )

        /*
        Putin Era - 2000
        */
        val sub24_0 = SceneEndOption(civilian.craftCivilian(),
                arrayOf("After the chaos in the 1990s, the restored order, economic growth, and rising standard of living appealed to you.",
                        "The success of the Second Chechen War was also attributed to him, and he dealt punishment to selective oligarchs like Mikhail Khodorkovsky.",
                        "Putin goes after corruption in a very public way to show he is on the side of the people.",
                        "He seems to be revitalizing Russia, so you continue to support him."),
                false,
                "https://cdn.theatlantic.com/thumbor/aTnssGaSjgCD8sFX6AaaDMMo_8E=/0x88:833x557/720x405/filters:format(png)/media/old_wire/img/upload/2012/11/01/Screen_shot_2012-11-01_at_8.29.12_AM/original.png")
        val sub24_1 = SceneEndOption(mCharacters[17],
                arrayOf("You rise to power relatively young and relatively quickly. You have the people’s support, and continue to rule Russia today (2020).",
                        "Although there were term limits to the presidency, these were removed/modified to allow for you to become president after a 4 year break, in 2012.",
                        "The russian GDP grew by about 70% largely due to high global oil prices and the quality of life improved dramatically in the years after your election."),
                false,
                "https://c.files.bbci.co.uk/149FD/production/_110077448_gettyimages-94984802.jpg")
        val scene24 = Scene(
                "Putin Era",
                2000,
                null,
                null,
                Pair(sub24_0, sub24_1),
                "https://cdn.defenseone.com/media/img/upload/2020/01/15/AP_20015552936433/860x394.jpg",
                "Putin's popularity increased with the Russian public due to a variety of factors.",
                arrayOf(),
                arrayOf(RefClass("https://cdn.theatlantic.com/thumbor/aTnssGaSjgCD8sFX6AaaDMMo_8E=/0x88:833x557/720x405/filters:format(png)/media/old_wire/img/upload/2012/11/01/Screen_shot_2012-11-01_at_8.29.12_AM/original.png", true),
                        RefClass("https://c.files.bbci.co.uk/149FD/production/_110077448_gettyimages-94984802.jpg", true),
                        RefClass("https://cdn.defenseone.com/media/img/upload/2020/01/15/AP_20015552936433/860x394.jpg", true),
                        RefClass("https://d1yhils6iwh5l5.cloudfront.net/charts/resized/25911/original/poot.jpg", true))
        )

        mArray = arrayOf(scene0, scene1, scene2, scene3, scene5, scene6, scene7, scene8, scene4, scene9, scene10, scene11, scene12,
        scene13, scene14, scene15, scene16, scene17, scene18, scene19, scene20, scene21, scene22, scene23, scene24, Filler())
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
        for (i in 0 until mArray.size) {
            if (mArray[i].name == scene.name)
                return i
        }
        return 0
    }

    fun size(): Int {
        return mArray.size
    }


}