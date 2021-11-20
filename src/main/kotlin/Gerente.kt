class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    password: Int
) : FuncionarioAdmin(
    name = name,
    cpf = cpf,
    salario = salario,
    password = password

) {
    override val bonificacao: Double
        get() {
            return this.salario
        }
}