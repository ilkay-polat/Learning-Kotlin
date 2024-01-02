package exceptions

fun main() {
    val numbers = arrayOf(5)

    try {
        val number = numbers[1]
        println("number is $number")
    } catch (exception: Throwable) {
        println(exception.message)
    } finally {
        println("finally block")
    }

    throwException()
}

fun throwException() {
    throw Exception("Exception thrown")
}