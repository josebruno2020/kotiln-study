import br.com.alura.bytebank.modelo.Endereco

//IDENTAR: ctrl alt l
//INSERIR NOVO ARQUIVO: alt insert
//IMPORTS ctrl alt o

fun main() {
    val endereco = Endereco(logradouro = "Logradouro", cep = "000")
    val enderecoNovo = Endereco(cep = "000")
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
}

fun imprime(valor: Any) {

}




