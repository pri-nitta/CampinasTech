package basico.exercicios

import java.util.*

fun notas (n1: Int, n2: Int, n3: Int, n4: Int): Int{
val media : Int = (n1 + n2 + n3 + n4)/4
    return media
}

fun soma(x1 : Int, x2: Int): Int{
val result1 : Int = (x1 + x2)
    return result1
    }

fun sub(x1 : Int, x2: Int): Int{
    val result2 : Int = (x1 - x2)
    return result2
}

fun mult(x1 : Int, x2: Int): Int{
    val result3 : Int = (x1 * x2)
    return result3
}

fun div(x1 : Int, x2: Int): Int{
    val result4 : Int = (x1 / x2)
    return result4
}

fun rest(x1 : Int, x2: Int): Int{
    val result5 : Int = (x1 % x2)
    return result5
}

fun main (){
//01 – Crie uma lista e faça com que ela mostre os valores ao contrario
    var (v1,v2,v3,v4) = listOf("Priscila", "Amanda", "Andressa","Alessandra")
    println ("lista de nomes ao contrário: $v4, $v3, $v2, $v1")
    println ("=============================================")

 //02 - Faça uma função que recebe 4 notas e mostre a media do Aluno na tela
    val leitura = Scanner(System.`in`)
    print("Digite o valor da 1º nota: ")
    val nota1: Int = leitura.nextInt()
    print("Digite o valor da 2º nota: ")
    val nota2: Int = leitura.nextInt()
    print("Digite o valor da 3º nota: ")
    val nota3: Int = leitura.nextInt()
    print("Digite o valor da 4º nota: ")
    val nota4: Int = leitura.nextInt()
    println ("A média do aluno é: " +notas (nota1,nota2,nota3,nota4))
    println ("=============================================")

    //03 – Crie um arquivo que contenha funçoes com as operações matematicas: soma, subtração, multiplicação e modulo
    //O Usuário deve informar 2 numeros e fazer os calculo de cada operação, use Template String e crie funções para isso, Mostre resultado na tela
    val numeros = Scanner(System.`in`)
    print("Digite o 1º número: ")
    val numeros1: Int = numeros.nextInt()
    print("Digite o 2º número: ")
    val numeros2: Int = numeros.nextInt()
    println ("A soma dos números resulta: " +soma(numeros1, numeros2))
    println ("A subtração dos números resulta: " +sub(numeros1, numeros2))
    println ("A multiplicação dos números resulta: " +mult(numeros1, numeros2))
    println ("A divisão dos números resulta: " +div(numeros1, numeros2))
    println ("O resto da divisão dos números resulta: " +rest(numeros1, numeros2))
    println ("=============================================")



}