package basico.funcoes

fun main(){
   var x: Int = 10
    var y : Int = 2
    soma(x,y)
    divide(x,y)
    println ("A multiplicação de A e B é: " +multi(x,y))

    println("====================")
    println("")

    //lista
    val compras = listOf("Arroz","Feijão","Carne","Cebola")
    println (compras[1])

    val comprasMut : MutableList<String> = mutableListOf("Arroz","Feijão","Carne","Cebola")
comprasMut[0] = "Alface"
    comprasMut.add ("Peixe")
    println(comprasMut[0])

}
//funcao sem retorno
fun soma (a: Int, b: Int){
    println("A soma de A e B é: " +(a+b))
}

fun divide (a: Int, b: Int){
    println("A divisião de A e B é:" +(a/b))
}

//funcao com retorno
fun multi (a: Int, b: Int) : Int {
    return(a*b)
}