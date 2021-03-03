fun main() {
    val livro1 = Livro(
        titulo = "Capitães de Areia",
        numeroPaginas = 200,
        autor = "Jorge Amado",
        editora = "Abril",
        seEstaAlugado = true
    )

    val livro2 = Livro(
        titulo = "Harry Potter",
        numeroPaginas = 250,
        autor = "J K Rowling",
        editora = "Rocco",
        seEstaAlugado = false
    )

    println(livro1)
    println(livro2)

    val carro1 = Carro(nome = "Corola", placa = "XPT122")
    val carro2 = Carro(nomeInserido = "DEF", placaInserida = "ABCD", modeloNovo = true)

    println(carro1)



val casa = Imovel(valor = 1500.00, qtdQuartos = 2, vagaGaragem = 0, bairro = "Taquaral", qtdBanheiros = 2)
println (casa)
}