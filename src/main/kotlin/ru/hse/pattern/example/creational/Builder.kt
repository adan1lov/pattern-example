package ru.hse.pattern.example.creational

fun main() {
    val stringBuilder = StringBuilder()

    println(stringBuilder.toString())

    stringBuilder.append("Hello")
    stringBuilder.append(" ")
    stringBuilder.append("world")

    println(stringBuilder.toString())
}
