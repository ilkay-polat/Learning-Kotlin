package expressions.tryexpression

fun main() {
    val numbers = arrayOf(1)

    val number = try{
        numbers[1]
    } catch (exception: Throwable) {
        0
    }

    println("Number is $number")
}