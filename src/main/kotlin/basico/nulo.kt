package basico

fun main () {

//    val listaFuncionarios: MutableList <Int,String> = mutableMapOf(1 to "Ana", 6 to "Priscilla")
//    val funcionarios: Map<Int, String> = listaFuncionarios
//
//var credencial: Int = 0
//var nome: String
//
//    do {
//
//        println("Insira sua credencial: ")
//        credencial = readLine()?.toIntOrNull()
//
//        println("Insira seu nome: ")
//        nome = readLine().toString()
//
//    } while (credencial == null && nome.isNullOrEmpty())
//
//    listaFuncionarios[credencial] = nome
//    println(funcionarios)

    var a : Int? = 0
    var b : Int? = 0

    print ("Digite o 1º valor: ")
    a = readLine()?.toInt()

    print ("Digite o 2º valor: ")
    b = readLine()?.toInt()

    var x : Int? = (a + b)
    print ("X = $x")

}

