package br.com.alura.bytebank.testes

fun testaDataClass() {
    val pessoa = Pessoa(nome = "Jose", idade = 12)
    println("NOme: ${pessoa.nome}")
    println(pessoa.toString())

    val (nome, idade) = pessoa

    val pessoa2 = pessoa.copy()
    println(pessoa == pessoa2)
    println(pessoa2.toString())

    println("$nome, $idade da pessoa")
}


data class Pessoa(
    val nome: String,
    val idade: Int


) {

}

class Documento(
    val cpf: String,
    val pessoa: Pessoa
) {
    operator fun component1() = this.cpf
}