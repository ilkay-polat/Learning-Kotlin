package exceptions.Exception

fun main() {
    val nums = arrayOf(5)

    try {
        val num = nums[1]
    } catch (exception: Throwable) {
        println(exception.message)
    } finally {
        println("Inside finally")
    }

    throwException()
}

fun throwException() {
    throw Exception("Exception thrown")
}