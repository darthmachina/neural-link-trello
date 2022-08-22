import kotlinx.html.div
import kotlinx.html.dom.append
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window
import trello.TrelloPowerUp

fun main() {
    TrelloPowerUp.initialize(mapOf(
        Pair("card-buttons", ::cardButtons)
    ))
}

fun cardButtons(t: Any, options: Any) : Map<String,String> {
    return mapOf(Pair("text", "Test Button"))
}
