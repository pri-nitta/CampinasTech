package basico

fun main(){
    var a: Int? = 100
    println(a?.dec())

    var opcional: String? = null
    opcional = "lala"
    var obrigatorio : String = opcional ?: "Valor Padrão"
    println (obrigatorio)
}