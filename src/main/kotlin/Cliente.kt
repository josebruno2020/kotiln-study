import interfaces.Autenticavel

class Cliente(
    val name: String,
    val cpf: String,
    val senha: Int
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
        return false

    }

}