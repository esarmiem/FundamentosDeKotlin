fun main(args: Array<String>) {
    var nombre : String? = null
    try {
        throw NullPointerException("errorrrr")
    } catch (excepcion : NullPointerException){
        println("error")
    } finally {
        println("finalmente ha ocurrido un error...")
    }

    val primerValor = 0
    val segundoValor = 0
    val resultado : Int = try {
        primerValor / segundoValor
    } catch (exception: Exception) { 0 }
    println(resultado)
}