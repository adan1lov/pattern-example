package ru.hse.pattern.example.behavioral

fun main() {
    val list = listOf(1,2,3,4,5)

    val iterator = list.iterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }
}