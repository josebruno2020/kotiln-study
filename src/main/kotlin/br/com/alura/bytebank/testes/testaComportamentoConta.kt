import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*

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
    try {
        contaJose.transfer(value = 5000.0, accountDestiny = contaMaria, 1)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
        println("Falha na transferência")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println(e.message)
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido: ${e.message}")
        e.printStackTrace()
    }

    println("CONTA JOSE ${contaJose.saldo}")
    println("CONTA MARIA ${contaMaria.saldo}")
}