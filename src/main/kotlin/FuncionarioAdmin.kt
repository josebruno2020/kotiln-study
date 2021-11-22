abstract class FuncionarioAdmin(
    name: String,
    cpf: String,
    salario: Double,
    val password: Int,
) : Funcionario(
    name = name,
    cpf = cpf,
    salario = salario
) {

    fun autentica(senha: Int): Boolean {
        if (senha == this.password) {
            return true
        }
        return false

    }

}