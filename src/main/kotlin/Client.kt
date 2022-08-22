import trello.TrelloPowerup

fun main() {
    TrelloPowerup.initialize(mapOf(
        Pair("card-buttons", ::cardButtons)
    ))
}

fun cardButtons(t: Any, options: Any) : Map<String,String> {
    return mapOf(Pair("text", "Test Button"))
}
