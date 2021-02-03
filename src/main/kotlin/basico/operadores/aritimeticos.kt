package basico.operadores

fun main(){
    val(v1,v2,v3,v4) = listOf(3,5,7,9)
    val soma = v1 + v2 + v3 + v4
    val subtracao = soma - v4
    val divisao = soma / v1
    val multi = soma * v1
    val modulo = soma % v2
    println(soma)
    println ("a soma dos números menos o v4 é:" +subtracao)
println ("A divisão de soma com v1 é:" +divisao)
    println ("A multiplicação de soma com v1 é:" +multi)
    println ("o resultado da divisão de soma por v2 é:" +modulo)
}
