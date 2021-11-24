package br.com.alura.bytebank.modelo

class ContaCorrente(titular: Cliente, number: Int): Account(
    titular,
    number
) {
    override fun sacar(value: Double) {
        val valorComTaxa = value + 0.1
        super.sacar(value)
    }
}