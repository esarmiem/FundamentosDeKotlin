fun main(args: Array<String>) {
    val moviles = mutableListOf("iphone", "samsung", "huawei")
        .run {
            removeIf { movil -> movil.contains("samsung") }
            this
        }
    println(moviles)
}