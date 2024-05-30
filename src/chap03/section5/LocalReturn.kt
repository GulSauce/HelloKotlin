package chap03.section5.localreturn

import chap03.section5.shortFunc

fun main() {
    shortFunc(3){
        println("First call: $it")
        return // 1. 의도하지 않은 반환
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit){
    println("Before calling out()")
    out(a)
    println("After calling out()") // 2. 이 문장은 실행되지 않음
}

