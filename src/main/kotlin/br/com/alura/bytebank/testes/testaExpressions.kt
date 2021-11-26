package br.com.alura.bytebank.testes

import br.com.alura.bytebank.interfaces.Autenticavel
import br.com.alura.bytebank.modelo.Account
import testaComportamentosConta

fun testaExpressions() {
    //Objeto anonimo pode implementar uma interface;
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "123123123"
        var senha: Int = 123

        override fun autentica(senha: Int): Boolean {
            return this.senha == senha
        }
    }




    testaComportamentosConta()

    println("Total de contas: ${Account.total}")
}
