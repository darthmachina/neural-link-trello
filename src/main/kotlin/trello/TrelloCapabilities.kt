package trello

data class TrelloCapabilities(val capabilities: List<Capability>) {
    fun toDynamic(): dynamic {
        return "{}"
    }
}

data class Capability(val type: String, val function: (t: Any, option: Any) -> dynamic)

data class CardButton(val icon: String, val text: String, val callback: (t: Any) -> dynamic)
