package functions

fun padding(text: String, paddingRepeat: Int, paddingCharacter: Char = ' ') : String {
    return text.padEnd(paddingRepeat, paddingCharacter)
}

fun main() {
    val name = "Kevin"
    val nameWithPadding = padding(name, 10)

    println("name is $name")
    println("nameWithPadding is $nameWithPadding")
}