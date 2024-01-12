package classes.data

data class Person(val name: String, val age: Int)
fun main() {
    val sam = Person("Sam", 32)
    val jack = Person("Sam", 32)

    println("$sam hasCode: ${sam.hashCode()}")
    println("$jack hasCode: ${jack.hashCode()}")

    if(sam.equals(jack)) {
        println("These people are same")
    }

    // Structural Equality
    if(sam == jack) {
        println("These people are same")
    }

    // Reference Equality
    if(sam === jack) {
        println("References are same")
    }
}