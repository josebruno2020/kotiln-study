package br.com.alura.bytebank.interfaces

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}