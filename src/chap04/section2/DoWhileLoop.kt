package chap04.section2

fun main() {

    do {
        print("Enter an Integer: ")
        val input = readLine()!!.toInt()

        for (i in 0 until input) {
            for (j in 0 until input) print((i + j) % input + 1)
            println()
        }
    } while(input != 0)
}