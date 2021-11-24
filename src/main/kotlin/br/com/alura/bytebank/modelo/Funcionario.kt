package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val name: String,
    val cpf: String,
    val salario: Double,
) {
    abstract val bonificacao: Double

}