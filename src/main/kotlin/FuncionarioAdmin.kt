abstract class FuncionarioAdmin(
    name: String,
    cpf: String,
    salario: Double,
    val password: Int,
): Funcionario(name = name, ) {
    abstract val bonificacao: Double

    fun autentica(password: Int): Boolean {
        if (password == this.password) {
            return true
        }
        return false

    }

}