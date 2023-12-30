package classes.secondaryconstructors

fun main(){
    println("Started ...")

    val earth = Planet("Earth", 12742, false)

    println("Planet created: Name: ${earth.name}, Diameter: ${earth.diameter}")
}