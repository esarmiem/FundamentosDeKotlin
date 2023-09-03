fun main(args: Array<String>) {
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegría")
        "Rojo", "Carmesi" -> println("El rojo simboliza el calor")
        else -> println("Sin información de color (error)")
    }

    val code = 501
    when(code){
        in 200..299 -> println("todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("codigo desconocido, algo ha fallado")
    }

    val tallaDeZapato = 46

    val mensaje =  when(tallaDeZapato){
        41,43 -> "Tenemos disponible"
        43,44 -> "Casi no nos quedan!"
        45 -> "Lo siento no tenemos esa talla"
        else -> "Estos zapatos solo vienen en tallas de 41 a 44"
    }
    println(mensaje)


}