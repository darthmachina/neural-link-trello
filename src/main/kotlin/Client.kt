import trello.CardButton

fun main() {

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
