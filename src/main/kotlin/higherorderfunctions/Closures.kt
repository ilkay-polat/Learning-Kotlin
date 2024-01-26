package higherorderfunctions

fun main() {
    var total = 0

    fibonacci1(8) { total += it }

    println(total)
}


fun fibonacci1(limit: Int, action: (Int) -> Unit) {
    var prev = 0
    var current = 1

    for (i in 1..limit) {
        action(current)

        val temp = current
        val prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}