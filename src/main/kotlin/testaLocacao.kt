fun testaLaco() {
    val nome: String = "JB"
    val numberAccount: Int = 1000
    var saldo: Double = 0.toDouble()
    println("Nome: $nome")
    println("Numero da conta: $numberAccount")
//    println("Saldo da conta: $saldo")
    saldo += 100

    verificaSaldo(saldo)

    //Estrutura for:
    for (i: Int in 6 downTo 0 step 2) {
        println(i)
    }
}
