package basico.exercicios

fun main (){

    /*05 - Escreva um Programa que permita a leitura dos nomes de 10 pessoas e
    armazene os os nomes lidos em uma lista.
    Após isto, o programa deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI,
    se o nome estiver entre os 10 nomes lidos anteriormente (guardados na lista), ou NÃO ACHEI caso contrário. */

val listaNomes : MutableList<String> = mutableListOf()
    var i : Int = 1
    do {
        print ("Digite o $i º nome: ")
        val nome = readLine()!! .toString()
        listaNomes.add(nome)
        i = i+1
    } while (i <= 10)
println("-------------------------------------")
    print ("Digite o nome que queira buscar: ")
    val nome1 = readLine()!! .toString()

    if (nome1 in listaNomes){
        print("ACHEI")
    } else{
        print ("NÃO ACHEI")
    }

}