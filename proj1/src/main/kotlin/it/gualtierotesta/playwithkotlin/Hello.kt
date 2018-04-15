package it.gualtierotesta.playwithkotlin

fun main(args: Array<String>) {

    val msg1 = CustomMessage("Ciao")
    val msg2 = msg1.copy()
    val msg3 = msg1.copy(error = false)

    println(msg1)
    println(msg2)
    println(msg3)

    println(msg1 == msg2)
    println(msg1 == msg3)

    var msg4 = CustomMessage("ciao 4")

    println(msg4)

//    println(CustomMessage("Ciao"))
//    println(CustomMessage("Ciao", true))
//    println(CustomMessage(message = "Ciao", error = true))
//    println(CustomMessage(error = true, message = "Ciao"))
//    println(CustomMessage("Ciao", true).copy(error = false))
}

