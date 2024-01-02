package interfaces

abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}
open class Planet(name: String, diameter: Int, val logger: Logger) : SpaceBody(name) {
    val radius = diameter / 2
    var population: Long

    init {
        println("Instance is created with name: $name")
        population = 0
    }

    constructor(name: String, diameter: Int, gaseous: Boolean, logger: Logger) : this(name, diameter, logger)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean, logger: Logger) : this(name, diameter, logger)

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        println("initPopulationRun called!")
    }

     override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

class HabitablePlanet(name: String, diameter: Int, logger: Logger) : Planet(name, diameter, logger) {
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        super.runPopulationModel(startPopulation, endDate, startPopulation)
        return 0
    }
}