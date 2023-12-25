package exceptions.Exception

fun main() {
    val nums = arrayOf(5)

    try {
        val num = nums[1]
    } catch (exception: Throwable) {
        println(exception.message)
    }

    throwException()
}

fun throwException() {
    throw Exception("Exception thrown")
}