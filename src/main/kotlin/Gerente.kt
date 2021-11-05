class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    val password: Int): Funcionario(
    name = name,
    cpf = cpf,
    salario = salario,
    ) {

    fun autentica(password: Int): Boolean {
        if (password == this.password) {
            return true
        }
        return false

    }
}