open class Funcionario(
    val name: String,
    val cpf: String,
    val salario: Double,
) {
    fun bonificacao(): Double {
        return this.salario * .1
    }
}