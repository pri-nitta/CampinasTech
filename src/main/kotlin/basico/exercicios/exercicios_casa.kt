package basico.exercicios

fun main (){

    // exercicio 1
    var y : Int = 5
    var soma : Int = y + 4
    var x : Any = soma

    println (soma)
    println ("====================================")

    // exercicio 2 - Crie a expressao aritmetica (((32/4) * (8*5)) - 30) troque os numeros por variaveis

    var (a,b,c,d,e) = listOf(32,4,8,5,30)
    println ("o resultado da expressão é: " +(((a/b)*(c*d))-e))

    println ("====================================")

    //ex 03 – Criar 3 variaveis , chuva, molha, venta, caracteristicas de uma tempestade,
    //faca uma validação para que em XOR o valor do print verdadeiro
    //faca uma validação para que em && seja falso para tempestade
    //faca uma validação para que em || seja verdadeiro

    var chuva: Boolean = false
    var molha: Boolean = true
    var venta: Boolean = true
    var res = chuva xor molha
    var res2 = chuva && venta
    var res3 = venta || molha

    println (res)
    println (res2)
    println (res3)

    println ("====================================")

    //04 – Crie uma varivel que faça a validação: a = 3, b= 5, c= 1 a deve ser maior que b e c , mas b deve ser menor que c
    //Mostre a expressão e o resultado na tela

    println ("====================================")

    //ex 05 - utilize somente o tipo Char para criar seu primeiro Nome.
    //val (v1,v2,v3) = mutableListOf('p','r','i')
    //println (v1+v2+v3)


}