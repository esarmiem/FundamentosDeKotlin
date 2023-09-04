fun main(args: Array<String>) {
    val largoDelValorInicial = superFuncion(valorIncial = "hola", block = { valor ->
        valor.length
    })
    println(largoDelValorInicial)

    val lambda: () -> String = funcionInception("pepe")
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFuncion(valorIncial: String, block : (String) -> Int): Int {
    return block(valorIncial)
}

fun funcionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}