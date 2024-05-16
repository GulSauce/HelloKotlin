val num05 = 127 // Int형으로 추론
val num06 = -32768 // Int형으로 추론
val num07 = 2147483647 // Int형으로 추론
val num08 = 9223372036854775807 // Long형으로 추론

val number = 1_000_000
val cardNum = 1234_1234_1234_1234L
val hexVal = 0xAB_CD_EF_12
val bytes = 0b1101_0010

val num09 = 3.14E+16
val num10 = 3.14E+8F

val a: Int = 30
val b: String = "Hello"

val aNull : Int? = null
val bNull : String? = null

fun main(){
    val str: String? = "Hello Kotlin"

    str?.length

    str!!.length

    str?.length ?: -1

    val a: Int = 1
    val b: Double = a.toDouble()
//    val c: Int = 1.1

    val result = 1L + 3 // Long + Int -> result는 Long형이 된다
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sumShort(a: Int, b: Int): Int = a+b

fun sumShortAndReturnShort(a: Int, b: Int): Int = a+b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
    return Unit
}

fun printSumNoReturnState(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}

fun printSumShort(a: Int, b: Int) {
    println("sum of $a and $b is ${a+b}")
}