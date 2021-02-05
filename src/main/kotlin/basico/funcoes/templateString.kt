package basico.funcoes

fun main(){

    val nome = "Priscila"
    val aprovado = listOf("Jose", "Claudia", "Pedro")
    var a: Int = 356.dec()
    var b: String = a.toString()
    println("Int: $a")
    println("Primeiro caractere da String é: ${b.first()}")

    println ("Olá ${nome}, usando Template string")
    println ("O primeiro colocado é: ${aprovado[0]}")
}