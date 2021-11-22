import interfaces.Autenticavel

class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : FuncionarioAdmin(
    name = name,
    cpf = cpf,
    salario = salario,
    password = senha

), Autenticavel {
    override val bonificacao: Double
        get() {
            return this.salario
        }
}