import trello.CardButton
import trello.TrelloPowerUp

fun main() {
    TrelloPowerUp.initialize(mapOf(
        Pair("card-buttons", ::cardButtons)
    ))
}

fun cardButtons(t: Any, options: Any) : CardButton {
    return CardButton("", "Test Button") {}
}

fun Map<String, Any>.toJs(): dynamic {
    val result: dynamic = object {}

    for ((key, value) in this) {
        when (value) {
            is String -> result[key] = value
            is Function<*> -> result[key] = value
            else -> throw RuntimeException("value has invalid type")
        }
    }

    return result
}
