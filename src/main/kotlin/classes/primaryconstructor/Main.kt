package classes.primaryconstructor

fun main(){
    println("Started ...")

    val earth = Planet("Earth", 12742)

    println("Planet created: Name: ${earth.name}, Diameter: ${earth.diameter}")
}