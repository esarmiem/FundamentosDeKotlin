fun main(args: Array<String>){
    val listaDeFrutas = listOf("manzana","pera","durazno","banano")
    for (fruta in listaDeFrutas) println("hoy voy a comerme una fruta llamada $fruta")
    listaDeFrutas.forEach { fruta -> println("hoy voy a comerme una fruta nueva llamada $fruta")}

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}