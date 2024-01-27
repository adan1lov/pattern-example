package ru.hse.pattern.example.behavioral

import java.util.logging.Level
import java.util.logging.LogRecord
import java.util.logging.Logger

fun main() {
    val logger = Logger.getLogger("logger")

    logger.log(LogRecord(Level.INFO, "hello"))
}