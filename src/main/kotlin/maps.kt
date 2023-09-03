fun main(args: Array<String>) {
    val edadSuperHeroes = mapOf(
        "superman" to 35,
        "ironman" to 38,
        "spiderman" to 20
    )

    println(edadSuperHeroes)

    val edadSuperMutable = mutableMapOf(
        "superman" to 40,
        "ironman" to 50,
        "spiderman" to 25
    )

    println(edadSuperMutable)

    edadSuperMutable.put("wason",45)
    println(edadSuperMutable)

    edadSuperMutable["tormenta"] = 30
    println(edadSuperMutable)

    val edadIronman = edadSuperMutable["ironman"]
    println(edadIronman)

    edadSuperMutable.remove("spiderman")
    println(edadSuperMutable)

    println(edadSuperMutable.keys)
    println(edadSuperMutable.values)
}