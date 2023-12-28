package loops

fun main() {
    val numbers = 1..10

    for (number in numbers) {
        println("number is $number")
    }

    for (numberWithStep in numbers step 2) {
        println("number with step is $numberWithStep")
    }

    for (numberDownTo in 10 downTo 1) {
        println("number down to $numberDownTo")
    }

    for (numberWithUntil in 1 until 10) {
        println("number with until $numberWithUntil")
    }


    val intArray = intArrayOf(1, 5, 7, 8, 19, 34)
    for (number in intArray) {
        println("number is $number")
    }

    for ((index, number) in intArray.withIndex()) {
        println("numbers[$index] = $number")
    }

    val people = HashMap<String, Int>()
    people["Sam"] = 32
    people["Alex"] = 34
    people["Harry"] = 36
    for ((name, age) in people) {
        println("$name is $age years old")
    }
}