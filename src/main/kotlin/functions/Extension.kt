package functions

fun pad(text: String, paddingRepeat: Int, paddingCharacter: Char = ' ') : String {
    return text.padEnd(paddingRepeat, paddingCharacter)
}


// Extension Function
fun String.pad(paddingRepeat: Int, paddingCharacter: Char = ' ') : String {
    return this.padEnd(paddingRepeat, paddingCharacter)
}

fun main() {
    val name = "Kevin"

    val nameWithPadding = name.pad(10)

    println("name is $name")
    println("nameWithPadding is $nameWithPadding")
}