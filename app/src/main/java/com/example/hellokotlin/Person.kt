package com.example.hellokotlin

open class Person(val name: String,val age: Int) {
    fun eat(){
        println(name + " is eating. He is " + age + " years old.")
    }
}

//class Student(val sno: String,val grade: Int,name: String,age: Int): Person(name,age){
//
//}
class Student(name: String, age: Int):Person(name, age), Study{
    override fun readBooks(){
        println(name + " is reading.")
    }

    override fun doHomework() {
        println(name + " is doing homework.")
    }
}

fun doStudy(study: Study){
    study.readBooks()
    study.doHomework()
}

fun main(){
//    val p = Person()
//    p.name = "Jack"
//    p.age = 19
//    p.eat()
//    val student = Student("a123",5,"Jack",19)
    val student = Student("Jack", 19)
    doStudy(student)
}