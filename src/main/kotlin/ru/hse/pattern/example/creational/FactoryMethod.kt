package ru.hse.pattern.example.creational

import java.nio.charset.Charset

fun main() {
    val utf8Charset = Charset.forName("UTF-8")

    val utf16Charset = Charset.forName("UTF-16")

    println("charset: $utf8Charset type ${utf8Charset.javaClass}")
    println("charset: $utf16Charset type ${utf16Charset.javaClass}")
}