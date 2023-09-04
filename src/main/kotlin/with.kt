fun main(args: Array<String>) {
    val colores = listOf("rojo", "verde", "azul")
    with(colores){
        println("nuestros colores son $this")
        println("esta lista tiene una cantidad de colores de $size")
    }
}