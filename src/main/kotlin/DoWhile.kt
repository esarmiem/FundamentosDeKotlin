fun main(args: Array<String>) {
    var contador = 10
    while(contador > 0){
        println("el valor del contador es $contador")
        contador--
    }

    do {
        println("generando numero aleatorio..")
        var numeroAletorio = (0..100).random()
        println("el numero generado es $numeroAletorio")
    } while (numeroAletorio > 50)
}