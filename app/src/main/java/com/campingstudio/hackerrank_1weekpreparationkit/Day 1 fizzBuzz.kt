package com.campingstudio.hackerrank_1weekpreparationkit
  
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
