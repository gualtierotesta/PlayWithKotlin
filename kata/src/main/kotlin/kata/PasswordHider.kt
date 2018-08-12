package kata

object PasswordHider {
    fun hidePasswordFromConnection(urlString: String): String {
        val regex = """password=([^&$]+)""".toRegex()
        val passwordLength = regex.find(urlString)!!.value.length - "password=".length
        return regex.replace(urlString, "password=" + "*".repeat(passwordLength))
    }
}
