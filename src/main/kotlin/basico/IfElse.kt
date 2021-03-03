package basico

import java.util.*

fun posi (n1: Int): String{
    if (n1>= 0){
        return ("Valor positivo")
    } else {
        return ("Valor negativo")
    }
}
fun main (){
    val nota: Double = 4.5

   val resultado = if (nota >= 6.0) "Passou!"  else if (nota >3 && nota <6) "Recuperação" else "Não Passou"

    println (resultado)
    val sentimento = true
    //template string com if/else
   // println ("Hoje estou ${if (sentimento) "Alegre" else "triste"}")

    if(nota in 9.0..10.0) {
        println("muito bom!")
    }else if (nota in 7.0..8.99){
            println ("Boa nota")
        } else if (nota in 5.0..6.99) {
        println("boa")
    } else if (nota in 3.0..4.99){
        println ("rec")
    } else if (nota in 0.0..2.99){
        println ("Não passou")
    } else {
        println ("Nota inválida")
    }

when (nota){
    10.0, 9.0 -> println ("Otima nota")
    8.99, 7.0 -> println ("boa nota")
    6.99, 5.0 -> println ("bom")
    4.99, 3.0 -> println ("recuperação")
    2.99, 0.0 -> println ("reprovado")
}
    val leitura = Scanner(System.`in`)
    print("Digite o valor de A: ")
    val a: Int = leitura.nextInt()
    println (posi(a))

}
