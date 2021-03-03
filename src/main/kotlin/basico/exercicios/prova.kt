package basico.exercicios

import java.util.*
// se eh maior de 18, se sim, pode dirigir se nao nao pode
//verificar se eh habilitado, se houver mensagem = em liberacao, se for null habi nao autorizada

fun main(){
   // val mensagem:String? = "algo"
    //val mensagem? =

    println("Digite sua idade: ")
    val idade: Int = Scanner(System.`in`).nextInt()

    validacaoCarteira(idade)
}
fun validacaoCarteira(idade:Int, mensagem:String?="em Liberacao"){
    var libercacao = mensagem ?: null


    if (idade >= 18){
        println("Pode dirigir")
        libercacao = "X"
    }else{
        println("Nao pode dirigir")
    }

    val habil: Unit = if (libercacao == null) println("Habilitacao nao Autorizada") else println("em liberacao")
}
