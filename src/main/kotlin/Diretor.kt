class Diretor(
    name: String,
    cpf: String,
    salario: Double,
    password: Int,
    val plr: Double
) : FuncionarioAdmin(
    name = name,
    cpf = cpf,
    salario = salario,
    password = password
) {



    override val bonificacao: Double
        get() {
            return this.salario + this.plr
        }
}