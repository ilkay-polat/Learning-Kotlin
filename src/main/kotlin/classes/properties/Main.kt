package classes.properties

fun main(){
    println("Started ...")

    val earth = Planet("Earth", 12742)
    println("Planet created: Name: ${earth.name}, Radius: ${earth.radius}, Population: ${earth.population}")

    earth.population = 7_000_000_000
    println("Planet created: Name: ${earth.name}, Radius: ${earth.radius}, Population: ${earth.population}")
}