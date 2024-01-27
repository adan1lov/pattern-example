package ru.hse.pattern.example.structural

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy


class DefaultInvocationHandler: InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        return args!![0]
    }
}

fun main() {
    val proxy =  (Proxy.newProxyInstance(
        ClassLoader.getSystemClassLoader(),
        arrayOf( Map::class.java),
        DefaultInvocationHandler()
    ) as Map<*, *> )

    println(proxy["asda"])
}