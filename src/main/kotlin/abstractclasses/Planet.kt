package abstractclasses

abstract class SpaceBody(val name: String) {
    abstract fun calculateMotion()
}

class BlackHole(name: String) : SpaceBody(name) {
    override fun calculateMotion() {
        TODO("Not yet implemented")
    }
}

open class Planet(name: String, diameter: Int) : SpaceBody(name) {
    val radius = diameter / 2
    var population: Long

    init {
        println("Instance is created with name: $name")
        population = 0
    }

    constructor(name: String, diameter: Int, gaseous: Boolean) : this(name, diameter)
    constructor(name: String, diameter: Int, gaseous: Boolean, hasLife: Boolean) : this(name, diameter)

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
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

class HabitablePlanet(name: String, diameter: Int) : Planet(name, diameter) {
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int): Long {
        super.runPopulationModel(startPopulation, endDate, startPopulation)
        return 0
    }
}