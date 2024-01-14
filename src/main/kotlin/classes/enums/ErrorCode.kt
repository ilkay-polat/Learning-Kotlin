package classes.enums

enum class ErrorCode (val error: Int) {
    None(0),
    Unknown(1),
    ConnectionLost(300)
}

fun main() {
    val errorCode = ErrorCode.None

    when(errorCode) {
        ErrorCode.None -> {
            println("No error")
        }
        ErrorCode.Unknown -> {}
        ErrorCode.ConnectionLost -> {}
    }

    println("errorCode's name ${errorCode.name} and its ordinal ${errorCode.ordinal} and has value ${errorCode.error}")

    val error = ErrorCode.valueOf("Unknown")
    println("error has name ${error.name} and it has ordinal ${error.ordinal} and has value ${error.error}")
}