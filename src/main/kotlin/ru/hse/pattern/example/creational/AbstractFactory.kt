package ru.hse.pattern.example.creational

import javax.xml.parsers.DocumentBuilderFactory

fun main() {
    val documentBuilderFactory = DocumentBuilderFactory.newInstance()

    val documentBuilder = documentBuilderFactory.newDocumentBuilder()

    val parsedXml = documentBuilder.parse("example.xml")

    print(parsedXml.documentElement.firstChild)

}