package fundamentals.function

fun main() {
    println("sum of 10 and 25 ${sum(10, 25)}")

    println("sum of 10 and 35 ${sumSimplified(10, 35)}")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumSimplified(a: Int, b: Int) = a + b