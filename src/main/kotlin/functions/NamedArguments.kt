package functions

// Default Argument
fun addPlayer(name: String, highScore: Int, lowScore: Int, totalScore: Int = 1000) {
    println("addplayer function called!")
}

fun main() {
    val name = "Kevin"

    // named arguments
    addPlayer(name, highScore = 100, lowScore = 0)
}