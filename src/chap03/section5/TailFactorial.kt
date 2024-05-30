package chap03.section5.tailrec

import java.math.BigInteger

fun main() {
    val number = BigInteger("40000")
    val result: BigInteger

    result = factorial(number)
    println("Factorial: $number -> $result")
}

tailrec fun factorial(n: BigInteger, run: BigInteger = BigInteger("1")): BigInteger {
    return if(n == BigInteger("1")) run else factorial(n-BigInteger("1"), run*n)
}
