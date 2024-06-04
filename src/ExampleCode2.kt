fun main() {

    fun secondFunc(a: Int){

    }

    userFunc(4)
    secondFunc(2)

    var a = 1
    var b = 3

    val max: Int = if(a > b) a else b
}

fun add(a: Int, b: Int): Int {
    return a + b
    println("이 코드는 실행되지 않습니다.") // 여기에 도달하지 않음
}

// 1. Unit을 명시적으로 반환
fun hello1(name: String): Unit {
    println(name)
    return Unit
}

// 2. Unit 이름을 생략한 반환
fun hello2(name: String): Unit {
    println(name)
    return
}

// 3. return문 자체를 생략
fun hello3(name: String) {
    println(name)
}

fun userFunc(counts: Int) {

}
