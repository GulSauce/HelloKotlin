package chap05.section2

class Bird {
    // 1. 프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    // 부 생성자 1 - 전부 입력 값으로 초기화
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name // 3. this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        wing = _wing
        beak = _beak
        color = _color
    }
    // 부 생성자 2 - 일부만 입력 값으로 초기화
    constructor(_name: String, _color: String) {
        name = _name
        color = _color
        wing = 2
        beak = "short"
    }
    // 메서드들
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val coco = Bird("mybird", 2, "short", "blue") // 4. 생성자의 인자로 객체 생성과 동시에 초기화
    val coco2 = Bird("myBird2", "Red")

    println("coco.name ${coco.name}")
    println("coco.color ${coco.color}")
    println("coco2.name ${coco2.name}")
    println("coco2.color ${coco2.color}")
    coco.fly()
    coco.sing(3)
}