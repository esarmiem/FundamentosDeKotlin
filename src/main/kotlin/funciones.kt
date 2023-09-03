fun main(args: Array<String>) {
    val fraseAleatoria = "en casa nunca dejamos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
}

fun imprimirFrase(frase: String) : Unit {
    println("tu frase es: $frase")
}
fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if(resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}