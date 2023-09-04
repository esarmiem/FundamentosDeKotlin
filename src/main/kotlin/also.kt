fun main(args: Array<String>) {
    val moviles = mutableListOf("iphone", "samsung", "huawei")
        .also {
            lista -> println("el valor de la lista es $lista")
        }.asReversed()
    println(moviles)
}