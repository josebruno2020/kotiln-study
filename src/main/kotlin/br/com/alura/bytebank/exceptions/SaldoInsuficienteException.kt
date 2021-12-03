package br.com.alura.bytebank.exceptions

class SaldoInsuficienteException(override val message: String = "O saldo é insuficiente") : Exception(message)