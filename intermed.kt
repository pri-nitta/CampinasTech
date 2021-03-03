package basico

fun main (){

    val listaFuncionarios : MutableList<Int, String> = mutableMapOf(1 to "Ana", 2 to "Priscilla")
 val funcionarios : Map<Int, String> = listaFuncionarios

do{

    println ("Insira sua credencial: ")
    val credencial = readLine()?.toIntOrNull()

    println ("Insira seu nome: ")
    val nome = readLine().toString()

} while (credencial == null && nome.isEmpty())




}