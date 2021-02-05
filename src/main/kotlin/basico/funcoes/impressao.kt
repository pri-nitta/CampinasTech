package basico.funcoes

import java.util.*

fun main() {
    val leitura = Scanner(System.`in`)
    println("Digite o valor de a: ")
    val a: Int = leitura.nextInt()
    println("Digite o valor de b: ")
    val b: Int = leitura.nextInt()

    val c: Any = a + b

    println("Digite o valor de c: "+c)


}
