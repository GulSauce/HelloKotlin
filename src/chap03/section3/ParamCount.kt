package chap03.section3

fun main() {
    //매개변수가 없는 람다식 함수
    noParam({"Hello World"})
    noParam {"Hello World"} // 위의 동일 결과, 소괄호 생략 가능

    val noParamLambda1: () -> String = {"Hello World"}
    val noParamLambda2 = {"Hello World"}

    // 매개변수가 하나 있는 람다식 함수
    oneParam ({a -> "Hello World! $a"})
    oneParam {a -> "Hello World! $a"}
    oneParam {"Hello World! $it"}

    val oneParamLambda1: (String) -> String = {a -> "Hello World! $a"}
    val oneParamLambda2 : (String) -> String = {"Hello World! $it"}

    val twoParamLambda : (String, String) -> String = { a, b -> "Hello World! $a $b"}

    val skipLambda: (String, String) -> String = {_, b -> "Hello World! $b"}
    skipParam(skipLambda)
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String){
    println(out("OneParam"))
}

fun skipParam(out: (String, String) -> String){
    println(out("Skip", "Param"))
}

