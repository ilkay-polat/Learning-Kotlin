package classes.secondaryconstructors

class PlanetWithPrimaryConstructorWithDefaultValue(val name: String, val diameter: Int, gaseous: Boolean = false) {
    init {
        println("Instance is created with name: $name")
    }
}