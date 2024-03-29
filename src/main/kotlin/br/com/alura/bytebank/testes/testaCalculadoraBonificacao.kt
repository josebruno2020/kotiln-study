package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaCalculadoraBonificacao() {
    val alex = Gerente(
        name = "Alex",
        cpf = "11824133901",
        salario = 5000.0,
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(alex, 1234, alex.name)

    val cliente = Cliente(name = "Bruno", cpf = "112.555.555-85", senha = 1234)
    sistema.entra(cliente, 1234, cliente.name)


    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(alex)

    println("Total de bonificacao: ${calculadoraBonificacao.total}")
}