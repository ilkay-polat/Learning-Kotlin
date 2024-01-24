package functions

fun adddingPlayer(name: String, highScore: Int, lowScore: Int, totalScore: Int = 1000) {
    println("adding player function called!")
}

// Function Overloading

fun adddingPlayer(firstName: String, lastName: String, highScore: Int, lowScore: Int, totalScore: Int = 1000) {
    println("adding player function called!")
    adddingPlayer("$firstName $lastName", highScore, lowScore, totalScore)
}
fun main() {
    val name = "Kevin"

    // named arguments
    addPlayer(name, highScore = 100, lowScore = 0)
}