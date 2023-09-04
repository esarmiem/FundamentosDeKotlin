fun main(args: Array<String>) {
    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada: Int = myLambda("Hola mundo")
    println(lambdaEjecutada)

    val saludos = listOf("hello", "hola", "Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}