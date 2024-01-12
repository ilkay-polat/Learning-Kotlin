package classes.data

data class PersonCopy(val name: String, val age: Int)
fun main() {
    val sam = PersonCopy("Sam", 32)
    val samuel = sam.copy(age = 32)


    println("$sam hasCode: ${sam.hashCode()}")
    println("$samuel hasCode: ${samuel.hashCode()}")
}