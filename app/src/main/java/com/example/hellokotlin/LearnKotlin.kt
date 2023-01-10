package com.example.hellokotlin

fun main(){
    println("Hello Kotlin!")
}

fun getScore(name:String) = if (name == "Tom"){
    86
}else if (name == "Jim"){
    77
}else if (name == "Jack"){
    95
}else if (name == "Lily"){
    100
}else {
    0
}

fun getScore2(name: String) = when (name){
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}