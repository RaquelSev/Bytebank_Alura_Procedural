fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5) {
        val titular = "Joana $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0


        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1) {
//
//        /* if(i==4) {
//            continue
//        } */
//
//        val titular = "Joana $i"
//        val numeroConta = 1000 + i
//        var saldo = i + 10.0
//
//
//        println("Titular $titular")
//        println("Número da conta $numeroConta")
//        println("Saldo da conta $saldo")
//        println()
//
//    }

    //testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta negativa")
    }

    /* when {
           saldo > 0.0 -> println("Conta é positiva")
           saldo == 0.0 -> println("Conta é neutra")
           else -> println("Conta negativa")
     } */
}

