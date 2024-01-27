package ru.hse.pattern.example.creational

fun main() {
    val runtime = Runtime.getRuntime()
    val runtime2 = Runtime.getRuntime()

    val any1 = Any()
    val any2 = Any()

    println("First runtime:\t$runtime")
    println("Second runtime:\t$runtime2")
    println("Equality == : ${runtime == runtime2}")
    println("Link equality === : ${runtime === runtime2}")
    println()
    println("First any:\t$any1")
    println("Second any:\t$any2")
    println("Equality == : ${any1 == any2}")
    println("Link equality === : ${any1 === any2}")
}