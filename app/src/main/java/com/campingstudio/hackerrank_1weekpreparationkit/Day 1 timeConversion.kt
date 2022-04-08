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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val hour = s.subSequence(0,2).toString().toInt()

    if( s.subSequence(8,10).toString() == "PM")
    {
        if(hour==12){
            return s.subSequence(0,8).toString()
        }else{
            return (hour +  12).toString() + s.subSequence(2,8)
        }
    }
    else
    {
        if(hour != 12)
        {
            return s.subSequence(0,8).toString()
        }else
        {
            return "00"+ s.subSequence(2,8)
        }
    }
}


fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
