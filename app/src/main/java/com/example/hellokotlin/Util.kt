package com.example.hellokotlin

class Util {

    fun doAction1(){
        println("do action1")
    }

    companion object{ //伴生类对象，因为Kotlin没有static的设计，只有单例类
        //在类的内部会创建一个伴生类，但是kotlin会保证Util类始终只会存在一个伴生类对象
        //单例类和companion object只是在语法的形式上模仿了静态方法的调=用方式，
        //但并不是真正的静态方法
        //通过增加@JvmStatic注解，kotlin编译器就可以将方法编译成真正的静态方法了
        fun doAction2(){
            println("do action2")
        }

        //通过增加@JvmStatic注解，kotlin编译器就可以将方法编译成真正的静态方法了
        //此时doAction3就是静态方法
        //注意，@JvmStatic只能加在单例类或companion object中的方法上
        //加在普通方法上会提示语法错误
        @JvmStatic
        fun doAction3(){
            println("do action2")
        }
    }
}