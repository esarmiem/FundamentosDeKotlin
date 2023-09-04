fun main(args: Array<String>) {
    var nombre: String? = null
    nombre?.let { valor ->
        println("el nombre no es nulo es $valor")
    }
    nombre = "pepe"
    nombre.let { valor ->
        println("el nombre no es nulo es $valor")
    }
}