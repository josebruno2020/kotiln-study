class SistemaInterno {
    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.autentica(password = senha)) {
            return println("Bem-vindo ao Bytebank!")
        }
        return println("Falha na autenticação")
    }
}