package ru.hse.pattern.example.behavioral

import java.util.Observer
import java.util.Observable

class ObserverImpl(val name: String): Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("$name update")
    }
}

class ObservableExt: Observable(){

    fun switchChange(){
        setChanged()
    }
}

fun main() {

    val observable = ObservableExt()

    listOf(ObserverImpl("first"), ObserverImpl("second")).forEach { observable.addObserver(it) }

    observable.switchChange()

    observable.notifyObservers(Any())
}