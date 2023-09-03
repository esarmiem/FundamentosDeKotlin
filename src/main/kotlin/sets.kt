fun main(args: Array<String>) {
    val vocales = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocales)

    val numerosFav = mutableSetOf(1,2,3,4,2)
    println(numerosFav)
    numerosFav.add(5)
    numerosFav.add(5) //no agrega repetidos
    println(numerosFav)

    numerosFav.remove(1)
    println(numerosFav)
    
    val valorDelSet: Int? = numerosFav.firstOrNull { numero -> numero > 2 }
    println(valorDelSet)
}