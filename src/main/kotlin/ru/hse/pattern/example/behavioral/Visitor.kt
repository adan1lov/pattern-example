package ru.hse.pattern.example.behavioral

import java.io.File
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes


class PrinterFileVisitor : SimpleFileVisitor<Path>() {

    override fun visitFile(file: Path?, attrs: BasicFileAttributes?): FileVisitResult {
        println(file?.fileName)
        return super.visitFile(file, attrs)
    }
}

fun main() {
    Files.walkFileTree(File("src").toPath(), PrinterFileVisitor())
}
