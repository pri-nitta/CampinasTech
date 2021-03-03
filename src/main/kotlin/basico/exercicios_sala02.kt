package basico

import java.util.*

fun valores (n1: Int) : String {
    if (n1 >= 10) {
        return ("Maior que 10!")
    }else if (n1 == null) {
      return ("valor nulo!")
    }else{
        return ("Não é maior que 10!")
    }
    }

fun main (){
    var leitura = Scanner(System.`in`)
    println("Digite o valor de A: ")
    var a: Int = leitura.nextInt()
    println (valores(a))
}