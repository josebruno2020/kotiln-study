import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun numbers() {
    println("---------><--------")

    val contaBruno = ContaCorrente(
        Cliente(
            name = "Bruno",
            cpf = "123",
            senha = 123
        ), 2001)
    println(contaBruno.titular)


    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    println("-------><------")

    val contaJoao = ContaPoupanca(Cliente(
        name = "Cliente1",
        cpf = "123123",
        senha = 123123
    ), 2002)

}