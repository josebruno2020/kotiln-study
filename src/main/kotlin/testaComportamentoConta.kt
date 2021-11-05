fun testaComportamentosConta() {
    println("Welcome to Bytebank!")
    val contaJose = Account(titular = "José", number = 1909)
    println("TITULAR: ${contaJose.titular}. NUMERO: ${contaJose.number}")

    contaJose.deposita(150.0)
    println("SALDO: ${contaJose.saldo}")

    println("-------------<>---------------")
    val contaMaria = Account(titular = "Maria", number = 1000)
    if (contaJose.transfer(value = 100.0, accountDestiny = contaMaria)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("CONTA JOSE ${contaJose.saldo}")
    println("CONTA MARIA ${contaMaria.saldo}")
}