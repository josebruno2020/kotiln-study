package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class SistemaInterno {
    fun entra(auth: Autenticavel, senha: Int, nome: String, autenticado: () -> Unit = {}) {
        if(auth.autentica(senha = senha)) {
            println("Bem-vindo ao Bytebank! $nome")
            autenticado()
        }
        return println("Falha na autenticação")
    }

    fun entraReciver(auth: Autenticavel, senha: Int, nome: String, autenticado: SistemaInterno.() -> Unit = {}): Boolean {
        if(auth.autentica(senha = senha)) {
            println("Bem-vindo ao Bytebank! $nome")
            autenticado()
            return true
        }
        println("Falha na autenticação")
        return false
    }

    fun pagamento() {
        println("realizando pagamento")
    }
}