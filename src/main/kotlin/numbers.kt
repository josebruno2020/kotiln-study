fun numbers() {
    println("---------><--------")
    val contaBruno = Account("Bruno", 2001)
    println(contaBruno.titular)


    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

    println("-------><------")

    val contaJoao = Account("João", 2002)

    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("TITULAR CONTA JOAO: ${contaJoao.titular}")
    println("TITULAR CONTA MARIA: ${contaMaria.titular}")
    println(contaMaria)
}