package chap03.section3

fun main() {
    //인자와 함께 사용하는 경우
    withArgs("Arg1", "Arg2", {a, b -> "Hello World! $a $b"})
    // withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1", "Arg2"){a, b-> "Hello World! $a $b"}
    // 그 외에는 분리 불가능
//    withArgsCantOutParen {a, b-> "Hello World! $a $b"}("Arg1", "Arg2")
}

fun withArgs(a: String, b: String, out: (String, String)-> String){
    println(out(a, b))
}

fun withArgsCantOutParen(out: (String, String)-> String, a: String, b: String){
    println(out(a, b))
}