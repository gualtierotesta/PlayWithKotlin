package it.gualtierotesta.playwithkotlin

data class CustomMessage(
        val message: String,
        val error: Boolean = false
) {
    fun print(): String {
        return if (error) {
            "Error: $message"
        } else {
            message
        }
    }
}