package chap04.section1

fun main() {

    println("Enter the score: ")
    val score = readLine()!!.toDouble()

    var grade = when(score){
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'B'
        in 70.0..79.9 -> 'C'
        else -> 'F'
    }

    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Scroe: $score, Grade: $grade")
}