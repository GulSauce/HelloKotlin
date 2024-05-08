package chap02.section3

fun main(){
    val a: Int = 127
    val b = a

    println(a === b)

    val c: Int? = a
    val d: Int? = a
    println(c === d)

    val e: Int? = c
    println(c === e)
}

