package ru.hse.pattern.example.behavioral

fun main(){
    val  a = Runnable { println("hello") }

    val thread = Thread(a)

    thread.start()

    thread.join()
}