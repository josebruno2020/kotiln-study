import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {
    println("Welcome to Bytebank!")
    val clienteAlex = Cliente(name = "Alex", cpf = "", senha = 123, endereco = Endereco(
        logradouro = "Rua Tome de Souza"
    ))
    val contaJose = ContaCorrente(titular = clienteAlex, number = 1909)
    println("TITULAR: ${contaJose.titular}. NUMERO: ${contaJose.number}")
    println("TITULAR ${contaJose.titular}")
    contaJose.deposita(150.0)
    println("SALDO: ${contaJose.saldo}")

    println("-------------<>---------------")
    val clienteMaria = Cliente(name = "Maria", cpf = "", senha = 123123)
    val contaMaria = ContaPoupanca(titular = clienteMaria, number = 1000)
    if (contaJose.transfer(value = 100.0, accountDestiny = contaMaria)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("CONTA JOSE ${contaJose.saldo}")
    println("CONTA MARIA ${contaMaria.saldo}")
}