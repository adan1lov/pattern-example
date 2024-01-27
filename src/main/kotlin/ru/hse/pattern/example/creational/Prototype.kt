package ru.hse.pattern.example.creational

class Foo(
    var var1: Int,
    var var2: Int
) : Cloneable {
    fun getClone(): Foo = clone() as Foo
}


fun main() {
    val foo = Foo(1, 2)

    val fooCopy = foo.getClone()

    println("Foo: $foo")
    println("Foo copy: $fooCopy")
    println("var1 eq ${foo.var1 == fooCopy.var1}")
    println("var2 eq ${foo.var2 == fooCopy.var2}")
}
