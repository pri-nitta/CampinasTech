package basico.operadores

fun main (){

   // println(d1 === d2)

    println (3 != 2)
    println (3 <2)
    println (3>2)
    println (3<=2)
    println (3>=2)

    val x : Boolean = true
    val y : Boolean = false
    val z : Boolean = x || y
    val w : Boolean = x && y
    val a : Boolean = x xor y //dupla validação

    println ("boolean Z "+z)
    println ("boolean W " +w)
    println ("boolean A " +a)
}