package loops

fun main(){
    var count = 5

    println("While Loop")
    while(count > 1) {
        println(count)
        count--
    }

    println("\nDo While Loop")
    count = 5
    do{
        println(count)
        count--
    } while(count > 1)
}