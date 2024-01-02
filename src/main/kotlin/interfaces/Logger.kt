package interfaces

interface Logger {
    fun debug(message: String)
    fun info(message: String)
}

class StandartOutLogger : Logger {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }
}

class NullLogger : Logger {
    override fun debug(message: String) {
    }

    override fun info(message: String) {
    }
}