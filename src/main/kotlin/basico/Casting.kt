package basico

fun main(){
    val a: String = "1"
    val b: String = "2"

    val c: Int = a.toInt() + b.toInt()
    println (c)

    val valor = "abc"
    if (valor is String) {
        println(valor)
    }else{
        println ("não é uma String")
    }

    //Smart Cast
podeMostrarStringOuSoma("pri")


}

fun podeMostrarStringOuSoma (x: Any){
    when (x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println ("Isso é diferente de string ou inteiro")
    }

}