package chap05.section03.override

import org.intellij.lang.annotations.Language

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    // 메서드들
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHighTone() = println("Happy Song!")
}
// 부 생성자를 사용하는 상속
class Parrot(name: String, wing: Int, beak: String, color: String,
    var language: String) : Bird (name, wing, beak, color){

    fun speak() = println("Speak! $language")
    final override fun sing(vol: Int) {
        super.sing(vol)
        println("I'm a parrot $vol")
        speak()
    }
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
    parrot.sing(3)
    lark.sing(3)
    lark.fly()
}

