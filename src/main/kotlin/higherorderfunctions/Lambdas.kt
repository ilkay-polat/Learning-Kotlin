package higherorderfunctions

interface Process {
    fun execute(value: Int)
}

fun main() {
    fibonacci(8, ::println)
}


fun fibonacci(limit: Int, action: (Int) -> Unit) {
    var prev = 0
    var prevprev = 0
    var current = 1

    for (i in 1..limit) {
        action(current)

        var temp = current
        prevprev = prev
        prev = temp
        current = prev + prevprev
    }
}