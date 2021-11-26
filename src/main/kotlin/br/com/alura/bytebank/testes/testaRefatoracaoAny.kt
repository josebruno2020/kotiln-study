package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelo.Endereco

fun testaRefatoracaoAny() {
    val endereco = Endereco(logradouro = "Logradouro", cep = "000")
    val enderecoNovo = Endereco(cep = "000")
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
}
