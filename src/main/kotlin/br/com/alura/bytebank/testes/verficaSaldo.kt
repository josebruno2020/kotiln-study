//Parâmetros SEMPRE tipados na linguagem;
fun verificaSaldo(saldo: Double) {
    when {
        saldo > 0 -> println("Conta é positiva: $saldo")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("Conta negativa")
    }
}