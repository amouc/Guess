package com.amou.guess

import java.util.*

class SecretNumber {
    val secret = Random().nextInt(10)+1
    var count = 0

    fun validate(number :Int) : Int{
        count ++
        //println("$secret , $number")
        return number - secret
    }
}

fun main() {
    val secretNumber = SecretNumber()
    //println(SecretNumber().secret)
    println(secretNumber.secret)

    //println("${SecretNumber().validate(3)} , count: ${secretNumber.count}")
    println("${secretNumber.validate(3)} , count:${secretNumber.count}")
}
