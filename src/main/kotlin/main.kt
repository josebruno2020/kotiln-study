//IDENTAR: ctrl alt l
//INSERIR NOVO ARQUIVO: alt insert
fun main() {
//    testaComportamentosConta()

    val alex = Gerente(
        name = "Alex",
        cpf = "11824133901",
        salario = 5000.0,
        password = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(alex, 1234)


    val calculadoraBonificacao = CalculadoraBonificacao()
//    calculadoraBonificacao.registra(alex)

    println("Total de bonificacao: ${calculadoraBonificacao.total}")
}

