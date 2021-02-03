package basico.operadores

fun main() {
 val (v1, v2, v3, v4, v5) = listOf(2, 3, 5, 8, 10)
 val (v6, v7, v8, v9) = listOf(20, 25, 30, 50)
val a = (v1*v4+v6-v1)-((v8-v7)+v6)
val b = (v2*(v2*v2*v2))/(v9-(v5/v1*v4))
val c = (((v1*v4)/v2)+(v2*v4)/(v3%v2))


 println ("O resultado da expressão A é: "+a)
 println ("O resultado da expressão B é: "+b)
 println ("O resultado da expressão C é: "+c)
 println ("================================")

 //exercicio 2 - usar XOR para que o resultado seja true
 val d = true
 val e = false
 val f = d xor e
 println ("Boolean de f é "+f)
 println ("================================")

 //exercicio 3 - usar && para que o resultado seja true
 val g : Boolean = true
 val h : Boolean = true
 val i = g && h
 val j = (3>2)
 val k = (10<15)
 println ("Boolean de i é "+i)
 println (j && k)
 println ("================================")

}