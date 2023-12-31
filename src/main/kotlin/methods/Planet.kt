package methods

class Planet(val name: String, diameter: Int) {
    val radius: Int = diameter / 2
    var population: Long

    init {
        println("Instance is created with name: $name")
        population = 0
    }

    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean) : this(name, diameter)

    fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        println("initPopulationRun called!")
    }
}