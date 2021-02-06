package basico.exercicios

fun banco (): Int{
    print("Digite o numero da conta: ")
    val conta = readLine() !!.toInt()
    print ("Digite o saldo: ")
    val saldo = readLine() !! .toInt()
    print("Digite o valor total dos débitos: ")
    val debito = readLine() !! .toInt()
    print("Digite o valot total de créditos: ")
    val credito = readLine() !! .toInt()

    var saldoAtual = (saldo - debito + credito)
    println ("O saldo atual é: $saldoAtual")

return saldoAtual
}

fun main (){
   /* 03 - Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
    escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
    ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
    Use função */
 banco()
    if (banco() >= 0) {
        println ("Saldo positivo")
    } else {
        println ("Saldo negativo!")
    }
}