fun main(args: Array<String>) {
    val nombre = "pepe"

    if (nombre.isNotEmpty()) print("el largo de nuestra variables nombre es ${nombre.length}") else
        print("error, la variable esta vacia")

    val mensaje : String = if(nombre.length > 4) {
        "tu nombre es largo!"
    } else if (nombre.isEmpty()){
        "nombre esta vacio"
    }
    else {
        "tienes un nombre corto "
    }
    println(mensaje)






}
