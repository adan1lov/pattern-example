package ru.hse.pattern.example.structural

fun main() {
    val arr = arrayOf(1,2,3,4)

    val list = listOf(arr)

    println(arr::class.java)
    println(list::class.java)
}