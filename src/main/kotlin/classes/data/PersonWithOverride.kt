package classes.data

data class PersonWithOverride(val name: String) {
    var age: Int = 0 // Now this is not considered for toString, hashCode and equals methods

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}
fun main() {
    val sam = PersonWithOverride("Sam")
    sam.age = 34
    val jack = PersonWithOverride("Sam")
    jack.age = 35

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