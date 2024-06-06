package chap05.section5.private

private class PrivateClass {
    private var i = 1
    private fun privateFunc() { // private
        i += 1 // 접근 허용
        println(i)
    }
    fun access() { // public
        privateFunc()
    }
}
class OtherClass {
    private val opc = PrivateClass() // 생성 가능
    fun test() {
        val pc = PrivateClass() // 생성 가능
        pc.access()
    }
}
fun main() {

    val pc = PrivateClass() // 생성 가능
//    pc.i // 접근 불가
//    pc.privateFunc() // 접근 불가
    pc.access()

}
fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}
