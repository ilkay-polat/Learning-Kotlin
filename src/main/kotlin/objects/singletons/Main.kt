package objects.singletons

object Logger {
    fun debug(message: String) {
        println("** debug: $message")
    }

    fun info(message: String) {
        println("** info: $message")
    }
}

class Person {
    fun doWork() {
        Logger.debug("some message")
    }
}

fun main() {
    val kevin = Person()

    kevin.doWork()
}