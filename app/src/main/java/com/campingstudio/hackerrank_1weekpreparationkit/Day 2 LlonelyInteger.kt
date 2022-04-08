package com.campingstudio.hackerrank_1weekpreparationkit


/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyInteger(a: Array<Int>): Int {
    // Write your code here

    val map = mutableMapOf<Int, Int>()
    for (x in a)
    {
        if (map.containsKey(x))
            map[x]= map[x]!!+1
        else
            map[x] = 1
    }
    return map.keys.elementAt(map.values.indexOf(1))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyInteger(a)

    println(result)
}
