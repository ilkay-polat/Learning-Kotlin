package classes.sealed

import classes.data.Person


sealed class PersonEvents(val id: Int) {
    class Awake(id: Int): PersonEvents(id)
    class Asleep(id: Int): PersonEvents(id)
    class Eating(id: Int, val food: String) : PersonEvents(id)
}

open class Cooking(id: Int): PersonEvents(id)
fun main() {
    val event = PersonEvents.Awake(1)

    handlePersonEvent(event)

    val anotherEvent = PersonEvents.Eating(23, "Nuts")
    handlePersonEvent(anotherEvent)
}

fun handlePersonEvent(event: PersonEvents) {
    when(event){
        is PersonEvents.Awake -> {
            println("Awake: ${event.id}")
        }
        is PersonEvents.Eating -> {
            println("Eating: ${event.id}, ${event.food}")
        }
        is PersonEvents.Asleep -> {}
        is Cooking -> {}
    }
}