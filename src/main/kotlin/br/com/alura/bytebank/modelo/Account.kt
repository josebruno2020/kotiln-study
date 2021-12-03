package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.interfaces.Autenticavel

//Variavel global (como o set esta privado, apenas o arquivo que ela foi instanciado que pode alterá-la);
var totalContas: Int = 0
    private set

abstract class Account(
    val titular: Cliente,
    val number: Int
): Autenticavel by titular {
    var saldo: Double = 0.toDouble()
        protected set

    // Object declaration. Com o companion ele compartilha os membros com o Account e mantem o 'estado', no caso do contador
    companion object {
        var total: Int = 0
            private set


    }

    init {
        total++
    }

    fun deposita(value: Double) {
        this.saldo += value
    }

    open fun sacar(value: Double) {
        if (this.saldo >= value) {
            this.saldo -= value
        }
    }

    fun transfer(value: Double, accountDestiny: Account, password: Int) {
        if(this.saldo < value) {
            throw SaldoInsuficienteException("Saldo atual: ${this.saldo}. Saldo solicitado: $value")
        }

        if(!autentica(password)) {
            throw FalhaAutenticacaoException()
        }

        this.saldo -= value
        accountDestiny.deposita(value)
    }

    //Delegation
//    override fun autentica(senha: Int): Boolean {
//        return this.titular.autentica(senha)
//    }
}

