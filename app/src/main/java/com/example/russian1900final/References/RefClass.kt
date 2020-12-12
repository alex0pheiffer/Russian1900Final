package com.example.russian1900final.References

open class RefClass(
        val str: String,
        val isImg: Boolean,
        val isBound: Boolean = false
) {
}

class TEXTBOUND: RefClass("TEXT REFERENCES", false, true)
class IMGBOUND: RefClass("IMAGE REFERENCES", false, true)
class OTHERBOUND: RefClass("OTHER REFERENCES", false, true)

class RefLecture: RefClass(
        "Most content was summarized from Professor Shneyder's lectures throughout the 2020 Fall Quarter.",
        false)

class RefSilhouette: RefClass(
        "All silhouettes were drawn by me.",
        false
)