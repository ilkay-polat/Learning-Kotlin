package functions

data class Point(val x: Int, val y: Int) {
    infix fun add(point: Point) = Point(this.x + point.x, this.y + point.y)

    operator fun plus(point: Point) = Point(this.x + point.x, this.y + point.y)
}

fun main() {
    val point1 = Point(1, 1)
    val point2 = Point(2, 2)

    val result1 = point1 add point2
    println("add = $result1")


    val result2 = point1 + point2
    println("+ = $result2")
}