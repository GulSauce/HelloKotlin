package chap03.section5

fun main() {
    // 인라인 함수 shortFunc의 내용이 복사되어 들어감
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("First call: $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()")
}