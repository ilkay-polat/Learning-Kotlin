package expressions.whenexpression

enum class Colors {
    RED,
    GREEN,
    BLUE
}

fun main() {
    val number = 6

    val isNumberEqualToSelectedValue = when (number) {
        6, 7 -> true
        in 8..10 -> true
        !in 12..14 -> true
        else -> false
    }

    println("Number is $number and is equal to selected value is $isNumberEqualToSelectedValue")

    val isEligible = false

    when (isEligible) {
        true -> println("isEligible is true")
        false -> println("isEligible is false")
    }


    val color = Colors.RED
    when (color) {
        Colors.RED -> println("Color is red")
        Colors.GREEN -> println("Color is green")
        else -> println("Color is blue")
    }
}