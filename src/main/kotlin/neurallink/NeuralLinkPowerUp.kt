package neurallink

/**
 * Entry point for all Neural Link functionality. This will be the only real class as every else will be based on
 * Functional Programming.
 */
@OptIn(ExperimentalJsExport::class)
@JsExport
@JsName("NeuralLink")
class NeuralLinkPowerUp {
    companion object {
        fun cardButtons(t: Any) {
            console.log("cardButton(), t: $t")
        }
    }
}
