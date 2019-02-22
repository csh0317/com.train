package com.train

import java.util.*

fun main() {
    while(true) {
        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets: ")
        var tick = scanner.nextInt()
        if(tick == -1)
            break
        print("How many round-trip tickets: ")
        var trip = scanner.nextInt()
        val buy = Price(tick, trip)
        buy.print()
    }
}

class Price(var tick:Int, var trip:Int){
    fun print(){
        println("You should pay "+ ((tick-trip)*1000+trip*1800))
    }
}