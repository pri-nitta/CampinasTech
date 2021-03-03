package basico.exercicios

import java.util.*

fun main (){
/*02 - Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.*/

    val leitura = Scanner(System.`in`)
    print("Informe o salário fixo do vendedor: ")
    var salario: Double = leitura.nextDouble()

    print("Informe o total das vendas: ")
    var vendas: Double = leitura.nextDouble()

    if (vendas <= 1500.00){
        salario = salario + (vendas * 0.03)
    } else {
        salario = salario + (vendas * 0.03 + ((vendas - 1500) * 0.05))
    }

    println ("O salário total do vendedor foi: $salario")
}