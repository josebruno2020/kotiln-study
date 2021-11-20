abstract class Account(
    var titular: String,
    val number: Int
) {
    var saldo: Double = 0.toDouble()
        protected set


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