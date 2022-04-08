fun median(arr: Array<Int>): Int {
     arr.sort()
    println(arr)
    return arr[arr.size/2]
}

fun main(args: Array<String>) {
    val result = median(arrayOf(2,6,7,8,9,1,2))
    println(result)
}
