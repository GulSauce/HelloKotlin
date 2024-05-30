package chap03.section3

fun main() {
    val result: Int

    // 일반 변수에 람다식 할당
    val multi = {x:Int, y:Int ->
        println("x * y")
        x
        x*y
    }
    val multi2: (Int, Int) -> Int = {x:Int, y:Int -> x*y}
    // val multi3 = {x:Int, y:Int -> x*y}

    // 람다식이 할된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
    val greet: () -> Unit = { println("Hello") }
    val nestedLamda: () -> () -> Int = { { 20 } }

    println(greet)
    greet()
    val test = nestedLamda()()
    println(test)
}