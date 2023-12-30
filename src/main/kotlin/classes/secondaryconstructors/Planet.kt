package classes.secondaryconstructors

class Planet(val name: String, val diameter: Int) {
    init {
        println("Instance is created with name: $name")
    }

    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
}