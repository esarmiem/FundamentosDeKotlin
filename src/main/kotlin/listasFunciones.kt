fun main(args: Array<String>){
    val numerosLoteria = listOf(11,22,43,56,78,66)

    val numeroSorted = numerosLoteria.sorted()
    println(numeroSorted)

    val numerosLoteriaDescendientes = numerosLoteria.sortedDescending()
    println(numerosLoteriaDescendientes)

    val ordenarPorMultiplos = numerosLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosLoteria.shuffled()
    println(numerosAleatorios)

    val numerosReversa = numerosLoteria.reversed()
    println(numerosReversa)

    val mensajesDeNumeros = numerosLoteria.map { numero ->
        "tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)
}