package br.com.alura.bytebank.modelo

//Variavel global (como o set esta privado, apenas o arquivo que ela foi instanciado que pode alterá-la);
var totalContas: Int = 0
    private set

abstract class Account(
    var titular: Cliente,
    val number: Int
) {
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

    fun transfer(value: Double, accountDestiny: Account): Boolean {
        if (this.saldo >= value) {
            this.saldo -= value
            accountDestiny.deposita(value)
            return true
        }
        return false
    }
}