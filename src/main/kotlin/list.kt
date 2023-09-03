fun main(args: Array<String>) {
    val listaNombres = listOf(
        "pepe",
        "juan",
        "ana"
    )
    println(listaNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("el bicho")
    println(listaVacia)

    val valorGet = listaVacia.get(0)
    println(listaVacia)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValorLista: String? = listaNombres.firstOrNull()
    println(primerValorLista)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3}

    val myArray = arrayOf(1,2,3,4)
    println("nuestro array es $myArray")
    println("array como lista ${myArray.toList()}")
}