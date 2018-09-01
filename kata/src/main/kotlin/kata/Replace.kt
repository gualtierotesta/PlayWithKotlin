package kata

fun replace(s: String): String = s.replace("[aeiouAEIOU]".toRegex(), """!""")
        //replace("[aeiouAEIOU]", "!")

fun main(args: Array<String>) {
    println(replace("Hi!"))
}