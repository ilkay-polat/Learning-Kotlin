package functions

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun maxAsSingleExpression(a: Int, b: Int) = if(a > b) a else b


fun main() {
    println(maxAsSingleExpression(23, 42))
}