fun main(args: Array<String>) {
    imprimirNombre(nombre= "pepe", apellido= "perez")
}
fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String) {
    println("mi nombre completo es $nombre $segundoNombre $apellido")
}