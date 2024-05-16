package chap02.Section4

fun  main() {
    val number1 = 5 // 0000...0101
    val number2 = -5 // 1111...1011

    println(number1 shr 1)
    println(number1 ushr 1)
    println(number2 shr 1)
    println(number2 ushr 1)
}