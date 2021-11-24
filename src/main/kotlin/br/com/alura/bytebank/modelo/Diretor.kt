package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.interfaces.Autenticavel

class Diretor(
    name: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    name = name,
    cpf = cpf,
    salario = salario,
    password = senha
), Autenticavel {



    override val bonificacao: Double
        get() {
            return this.salario + this.plr
        }
}