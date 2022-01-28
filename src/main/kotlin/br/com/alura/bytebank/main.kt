import br.com.alura.bytebank.interfaces.Autenticavel
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

//IDENTAR: ctrl alt l
//INSERIR NOVO ARQUIVO: alt insert
//IMPORTS ctrl alt o

fun main() {
    somaReciver(1, 5, resultado = {
        println(this)
    })

    testHOF()

//    println(novaConta)
}

fun testRun() {
    val taxa = 0.05
    val taxaMensal = taxa / 12

    println(taxaMensal)

    val novaContaPoupanca = ContaPoupanca(Cliente(name = "JOSE BRUNO", cpf = "01234567890", senha = 123), 1000)
    novaContaPoupanca
        .run {
            deposita(1000.0)
            println(saldo)
            saldo * taxaMensal
        }
        .let { rendimentoMensal ->
            println("rendimento mensal $rendimentoMensal")
        }


    val rendientoanual = run {
        var saldo = novaContaPoupanca.saldo
        repeat(times = 12, action = {
            saldo += saldo * taxaMensal
        })
        saldo
    }


    println("rendimento anual $rendientoanual")
}

fun testWith() {
    val enderecoCompleto = with(Endereco(), block = {
        logradouro = "rua tome"
        numero = 293
        bairro = "zona 2"
        cidade = "Maringá"
        estado = "PR"
        cep = "87010-380"
        completo()
    }).let(::println)
}

fun testScopeFunctions() {
    val endereco = Endereco(logradouro = "RUA TOME", numero = 293)
    val enderecoMaiuscula = "${endereco.logradouro} - ${endereco.numero}".uppercase()
    println(enderecoMaiuscula)


    Endereco(logradouro = "rua tome", numero = 293).run {
        "${endereco.logradouro} - ${endereco.numero}".uppercase()
    }.let(::println)
    println("-------------")
    listOf<Endereco>(Endereco(complemento = "FUNDO"), Endereco(complemento = "APT"), Endereco())
        .filter { endereco ->
            endereco.complemento.isNotEmpty()
        }.let(::println)
    println("-------------")
}

fun testHOF() {
    soma(10, 2, resultado = { valor ->
        println(valor)
    })
    println("------")
    val autentical = object : Autenticavel {
        val senha = 123
        override fun autentica(senha: Int): Boolean = this.senha == senha

    }

    SistemaInterno().entra(auth = autentical, senha = 123, nome = "JOSE", autenticado = {
        println("ELE AUTENTICOU!")
    })

    val sistema = SistemaInterno()
    sistema.entraReciver(autentical, senha = 123, nome = "Jose", autenticado = {
        pagamento()
    })
}

fun soma(a:Int, b: Int, resultado: (Int) -> Unit = {}): Unit {
    println("antes")
    resultado(a + b)
    println("depois")
}

fun somaReciver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes")
    resultado(a + b)
    println("depois")
}

fun testNull() {
    val endereco: Endereco? = null
    println(endereco?.logradouro)


    val integer: String? = null
    println(integer?.length ?: "asdasd")
}










