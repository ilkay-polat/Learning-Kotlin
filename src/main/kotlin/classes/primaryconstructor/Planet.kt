package classes.primaryconstructor

class Planet (val name: String, val diameter: Int) {
    init {
        println("Instance is created with name: $name")
    }
}