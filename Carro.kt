data class Carro(
    val nome: String,
    val placa: String
) {

    var novo: Boolean = true

    constructor(
        nomeInserido: String,
        placaInserida: String,
        modeloNovo: Boolean
    ) : this(nomeInserido, placaInserida) {
        novo = modeloNovo
    }
}