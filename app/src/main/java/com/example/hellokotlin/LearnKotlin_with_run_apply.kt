package com.example.hellokotlin


fun main(){

    //learnWith()
    //learnRun()

}

fun learnWith(){
    val list = listOf("Apple","Banana", "Orange", "Pear", "Grape")
    val result = with(StringBuilder()){
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruit.")
        toString()
    }
    println(result)
}

fun learnRun(){
    val list = listOf("Apple","Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().run{
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruit.")
        toString()
    }
    println(result)
}

fun learnApply(){
    val list = listOf("Apple","Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().apply{
        append("Start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruit.")
    }
    println(result.toString())
}