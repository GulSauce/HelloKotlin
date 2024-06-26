package chap04.section3

fun main() {

    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit){
    out(a, b)
    return
}

fun retFunc() {
    println("start of retFunc") // 1.
    inlineLambda(10, 3, fun (a, b) { // 2.
        val result =  a + b
        if(result > 10) return// 3. 10보다 크면 이함수를 빠져 나감
        println("result: $result") // 4. 10보다 크면 이 문장에 도달하지 못함
    })
    println("end of retFunc") // 5.
}