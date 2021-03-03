package basico.exercicios

fun estoque(): String {

    /*04 - Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2).
Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra',
senão escrever a mensagem 'Efetuar compra', use função */

    print("Informe a quantidade atual em estoque: ")
    val qAtual = readLine()!!.toInt()

    print("Informe a quantidade máxima em estoque: ")
    val qMax = readLine()!!.toInt()

    print("Informe a quantidade máxima em estoque: ")
    val qMin = readLine()!!.toInt()

    var media = (qMax + qMin) / 2

    if (qMax >= media) {
        return ("Não efetuar compra")
    } else {
        return ("Não efetuar compra")
    }
}
fun main() {
        println (estoque())

    }
