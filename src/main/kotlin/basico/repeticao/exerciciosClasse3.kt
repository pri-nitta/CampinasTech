package basico.repeticao

fun main (){

    val numeros: MutableList<String> = mutableListOf()
for (i in 1..5){
    print("Digite o $i º valor desejado por extenso: ")
    val numero = readLine()
    numeros.add(numero.toString())
}
for ((indice, numero) in numeros.withIndex()){
    println("${indice+1} - $numero")
}

}