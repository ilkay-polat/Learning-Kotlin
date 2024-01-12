package classes.data

data class PersonDestructuring(val name: String, val age: Int)
fun main() {
    val sam = PersonDestructuring("Sam", 32)
    val samuel = sam.copy(age = 32)


    // Destructuring object
    val (n, a) = samuel
    println("Samuel has the $n and the age $a")
}