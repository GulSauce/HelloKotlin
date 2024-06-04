package chap04.section2

fun main() {

    println("Enter the number: ")
    var number = readLine()!!.toInt()
    var factorial: Long = 1

    while(number > 0) { // n x ... 4 x 3 x 2 x 1 x
        factorial *= number
        --number
    }

    println("Factorial: $factorial")
}