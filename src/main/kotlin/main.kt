//IDENTAR: ctrl alt l
//INSERIR NOVO ARQUIVO: alt insert
fun main() {
    testaComportamentosConta()

    val alex = Funcionario(name = "Alex", salario = 1000.0, cpf = "118.241.339-01")
    println("NOME: ${alex.name}")
    println("SALARIO: ${alex.salario}")
    println("BONIFICACAO: ${alex.bonificacao()}")
}

