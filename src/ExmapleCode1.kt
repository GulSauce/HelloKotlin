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

val globar: Int = 1
fun main(){
    val str: String? = "Hello Kotlin"

    str?.length

    str!!.length

    str?.length ?: -1

    val a: Int = 1
    val b: Double = a.toDouble()
//    val c: Int = 1.1

//    val result = 1L + 3 // Long + Int -> result는 Long형이 된다

    println(highFunc({x, y -> x + y}, 10, 20))

//    val add: (Int, Int) -> Int = fun(x, y) = x + y
    val add = fun(x: Int, y: Int) = x + y

    val result = add(10, 2)

    localReturnFunc{
        println("Hello $it")
        return
    }
}

inline fun localReturnFunc(out:(Int)-> Unit){
    out(3)
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

fun sumFunction(a: Int, b: Int): Int{
    return a + b
}

//fun check() {
//    val test = User.grade()
//    if(test != null) process(test)
//}

const val global =  10

fun noPureFunction(a: Int, b: Int): Int{
    return a + b + global
}

var toChangeVar = 10

fun changeVar() {
    toChangeVar = 1557
}

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)

val greet  = { println("Hello Word!") }

val square: (Int)->Int = {x -> x * x}

val nestedLambda: ()->()->Unit = {{ println("nested") }}

val globarVar: Int = 10
fun varScope(){
    {
        val L1: Int = 1
        {
            val L2: Int = 2
        }
    }
}
