fun main(args: Array<String>) {
    val moviles = mutableListOf("iphone", "samsung", "huawei")
        .apply {
            removeIf { movil -> movil.contains("samsung") }
        }
    println(moviles)

    val colores : MutableList<String>? = mutableListOf("rojo", "verde", "azul")
    colores?.apply {
        println("nuestros colores son $this")
        println("cantidad de colores es $size")
    }
}