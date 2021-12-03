package br.com.alura.bytebank.exceptions

class FalhaAutenticacaoException(override val message: String = "Falaha na autenticacao") : Exception(message) {
}