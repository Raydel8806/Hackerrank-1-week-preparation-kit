package com.campingstudio.hackerrank_1weekpreparationkit
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



/*
 * Complete the 'fizzBuzz' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun fizzBuzz(n: Int): Unit {
    // Write your code here
    if(n%5==0 && n%3==0){
        println("FizzBuzz")
    }else {
        if (n % 5 != 0 && n % 3 == 0) {
            println("Fizz")
        } else {
            if (n % 5 == 0 && n % 3 != 0) {
                println("Buzz")
            } else {
                if (n % 5 != 0 && n % 3 != 0) {
                    println(n)
                }
            }
        }
    }
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    fizzBuzz(n)
}
