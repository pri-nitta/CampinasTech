package basico.exercicios

import java.util.*

fun main (){

/*01 - As maçãs custam R$ 4,30 cada se forem compradas menos de uma dúzia, e R$ 4,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.*/

    val leitura = Scanner(System.`in`)
    print("Informe a quantidade de maçãs desejada: ")
    val quantidade: Double = leitura.nextDouble()

    var preco: Double = 0.0

    if (quantidade < 12){
        preco = quantidade * 4.30
    } else {
        preco = quantidade * 4.00
    }

    println ("A o valor total pela compra de $quantidade maçãs foi: $preco")
}