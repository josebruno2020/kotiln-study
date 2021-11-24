package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class Cliente(
    val name: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    val senha: Int
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
        return false

    }

}