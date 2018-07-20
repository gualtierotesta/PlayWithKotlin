package it.gualtierotesta.playwithkotlin

data class CustomMessage(
        val message:String,
        val error: Boolean = false) {

    override fun toString(): String {
        return if (error) {
            "Error: $message"
        } else {
            message
        }
    }
}