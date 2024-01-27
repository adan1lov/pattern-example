package ru.hse.pattern.example.behavioral


class FakeComparator : Comparator<Int> {
    override fun compare(o1: Int?, o2: Int?): Int {
        return -99
    }
}

class RealComparator : Comparator<Int> {
    override fun compare(o1: Int?, o2: Int?): Int {
        return o1!!.compareTo(o2!!)
    }
}

fun main() {

    val var1 = 1
    val var2 = 1

    val fake = true

    val comparator = if (fake) FakeComparator() else RealComparator()

    println(comparator.compare(var1, var2))

}