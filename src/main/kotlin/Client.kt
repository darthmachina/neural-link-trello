import trello.TrelloPowerUp

fun main() {
    TrelloPowerUp.initialize(mapOf(
        Pair("card-buttons", ::cardButtons)
    ))
}

fun cardButtons(t: Any, options: Any) : Map<String,String> {
    return mapOf(Pair("text", "Test Button"))
}
