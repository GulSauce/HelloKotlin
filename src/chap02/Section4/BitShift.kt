package chap02.Section4

fun main() {

    val num = 4 // 0100
    println(num.shl(2)) // 0100
    println(num shl 2) // 0001

    println(num.shr(2)) // 0100
    println(num shr 2) // 0001
    println(num ushr 2) // 0001

    val negativeNum = -2147483647 // 1000_0000_0000_0000_0000_0000_0000_0001
    println(negativeNum.shr(2)) // 0010_0000_0000_0000_0000_0000_0000_0000
    println(negativeNum ushr 2) // 1110_0000_0000_0000 0000_0000_0000_0000

    var x = 4
    var y = 0b0000_1010
    var z = 0x0F

    println("x shl 2 -> ${x shl 2}") // 16
    println("x.inv 2 -> ${x.inv()}") // 0100 -> 1011 = -5

    println("y shr 2 -> ${y/4}, ${y shr 2}")
    println("x shl 4 -> ${x*16}, ${x shl 4}")
    println("z shl 4 -> ${x*16}, ${z shl 4}")

    x = 64
    println("x shr 4 -> ${x/4}, ${x shr 2}")

}