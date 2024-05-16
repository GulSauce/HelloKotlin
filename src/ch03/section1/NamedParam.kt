package ch03.section1

fun main(args: Array<String>){

    namedParam(z=1557, x = 200, y = 100)
    namedParam(z = 150)

}

fun namedParam(x: Int = 100, y: Int = 200, z: Int){
    println(x+y+z)
}