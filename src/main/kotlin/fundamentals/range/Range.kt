package fundamentals.range

fun main() {
    var numbers = 1..10

    var characters = 'a'..'z'

    for(number in numbers) {
        println("number is $number")
    }
}