package chap05.section02.bird2

// 주 생성자 선언
class Bird(var name: String, val wing:Int  = 2, var beak: String, var color: String) {
    // 프로퍼티 - 위에 var 혹은 val로 선언함느로서 프로퍼티가 이미 포함됨

    // 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird(name = "my Bird", beak ="small", color = "red")
    println(coco.wing)
}
