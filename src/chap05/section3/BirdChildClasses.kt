package chap05.section3.openClass

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    // 메서드들
    fun fly() = println()
    fun sing() = println()
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHighTone() = println("Happy Song!")
}
// 부 생성자를 사용하는 상속
class Parrot : Bird {

    val language: String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name, wing, beak, color) {
        this.language = language
    }

    fun speak() = println("Speark! $language")
}

fun main() {

    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylark", 2, "long", "brown")
    val parrot = Parrot("my", 2, "long", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Larak: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Coco: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    lark.singHighTone()
    parrot.speak()
    lark.fly()
}

