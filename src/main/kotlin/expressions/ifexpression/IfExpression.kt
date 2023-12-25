package expressions.ifexpression

fun main() {
    val firstNumber = 23
    val secondNumber = 10

    val minimumNumber = if (firstNumber < secondNumber) firstNumber else secondNumber

    println("Minimum number is $minimumNumber")
}