import com.example.edu.Person as User

fun main() {

    println("Hello Kotlin!")

    val person = User("Kildong", 20)
    val person2 = Person(1557, "Kildong", "Programmer")

    println(person)
    println(person.name)
    println(person.age)

    val init: Int
}

class Person(val no: Int, val name: String, val jobTitle: String)