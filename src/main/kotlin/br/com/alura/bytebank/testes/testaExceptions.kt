package br.com.alura.bytebank.testes

fun testaExceptions() {
    try {
        println("Inicio main")
        funcao1()
        println("Fim main")
    } catch (e: Exception) {
        println(e.message)
        println(e.cause)
    } finally {
        println("Programa executado!")
    }


    val entrada: String = "1"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val valorComTaxa: Double? = if (valor != null) {
        valor * .1
    } else {
        null
    }
    println(valorComTaxa)
}

fun funcao1() {
    println("Inicio funcao 1")
    funcao2()
    println("Fim funcao 2")
}

fun funcao2() {
    println("Inicio funcao 2")
    val message: String = "Falha"
    if(!message.isEmpty()) throw Exception(message)
    println("Fim funcao 2")
}