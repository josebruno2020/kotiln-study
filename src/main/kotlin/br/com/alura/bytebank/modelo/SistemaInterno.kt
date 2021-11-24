package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class SistemaInterno {
    fun entra(auth: Autenticavel, senha: Int, nome: String) {
        if(auth.autentica(senha = senha)) {
            return println("Bem-vindo ao Bytebank! $nome")
        }
        return println("Falha na autenticação")
    }
}