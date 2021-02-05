package basico.funcoes

import java.util.*

// exercicio 1
fun mostre (a: Int, b: Int){
 println ("A soma/ multiplicação e divisão do resultado é: " +(((a+b)*a)/b))
}

// exercicio 2
fun palavra (a: String): Int{
    var b = a.length
  return b
}

// exercicio 3
fun calculo (a: Int = 3){
  var b = a*a
    println(b)
}

fun main(){

    // exercicio 1
    var x : Int = 10
    var y : Int = 2
    mostre (x,y)
    println ("")

    // exercicio 2
    println("Digite o valor da palavra: ")
    val leitura = Scanner(System.`in`)
    val z: String = leitura.nextLine()
   println ( palavra(z))
    println ("")

// exercicio 3
    var p = 8
    calculo()
    println ("")



}