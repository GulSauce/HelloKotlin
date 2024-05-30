package chap03.section3

fun main() {

    var result: Int

    // 일반 변수식에 람다식 할당
    val multi: (Int, Int) -> Int = {x, y -> x * y}
    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)

    val multi2: (Int, Int) -> Int = {x:Int, y:Int ->
        println("x * y")
        x * y
    }
    println(multi2(10, 20))
}
