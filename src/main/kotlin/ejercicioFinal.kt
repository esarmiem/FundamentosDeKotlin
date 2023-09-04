// Constantes de respuestas
const val AFFIRMATIVE_RESPONSE: String = "✅"
const val NEGATIVE_RESPONSE: String = "❌"
const val DOUBT_RESPONSE: String = "\uD83E\uDD14"

val ANSWERS = mapOf<String, String>(
    "Sí" to AFFIRMATIVE_RESPONSE,
    "Es cierto" to AFFIRMATIVE_RESPONSE,
    "Totalmente" to AFFIRMATIVE_RESPONSE,
    "Sin duda" to AFFIRMATIVE_RESPONSE,
    "Pregunta en otro momento" to DOUBT_RESPONSE,
    "No puedo decirte en este momento" to DOUBT_RESPONSE,
    "Puede que sí o puede que no" to DOUBT_RESPONSE,
    "No va a suceder" to NEGATIVE_RESPONSE,
    "No cuentes con ello" to NEGATIVE_RESPONSE,
    "Definitivamente no" to NEGATIVE_RESPONSE,
    "No lo creo" to NEGATIVE_RESPONSE
)

fun generateAnswer(): String {
    return ANSWERS.keys.random()
}

fun showAllAnswers() {
    println("Selecciona una opción")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudodas")
    println("4. Revisar solo las respuestas negativas")
    println("5. Volver atras.")


    val userInput: String? = readlnOrNull()
    when (userInput) {
        "1" -> showAnswersByType()
        "2" -> showAnswersByType(type = AFFIRMATIVE_RESPONSE)
        "3" -> showAnswersByType(type = DOUBT_RESPONSE)
        "4" -> showAnswersByType(type = NEGATIVE_RESPONSE)
        "5" -> init()
        else -> println("Respuesta no valida, adios.")
    }
}

fun generateQuestion() {
    println("Que quieres saber?")

    val userInput: String? = readlnOrNull() // El usuario ingresa su pregunta

    println("Entonces quieres saber si '$userInput'... la respuesta es:") // Le mostramos un texto para que lea

    println(generateAnswer()) // Generamos una respuesta

    init()
}

fun showAnswersByType(type: String? = null) {
    when (type) {
        null -> ANSWERS.keys.forEach { answer -> println("   - $answer") }

        AFFIRMATIVE_RESPONSE -> ANSWERS.filterValues { value -> value == AFFIRMATIVE_RESPONSE }
            .also { response -> response.keys.forEach { answer -> println("   - $answer") } }

        DOUBT_RESPONSE -> ANSWERS.filterValues { value -> value == DOUBT_RESPONSE }
            .also { response -> response.keys.forEach { answer -> println("   - $answer") } }

        NEGATIVE_RESPONSE -> ANSWERS.filterValues { value -> value == NEGATIVE_RESPONSE }
            .also { response -> response.keys.forEach { answer -> println("   - $answer") } }

    }

    showAllAnswers()

}

fun out() {
    println("Recuerda visitar www.esarmiem-links.com, nos vemos luego 🥺")
}

fun showError() {
    println("Vaya parece que has elegido una opción no valida, empezemos de nuevo:")
    init()
}

fun init() {
    println("1. Preguntame algo.")
    println("2. Revisar todas las respuestas.")
    println("3. Salir")

    val userInput: String? = readlnOrNull()

    when (userInput) {
        "1" -> generateQuestion()
        "2" -> showAllAnswers()
        "3" -> out()
        else -> showError()
    }
}

fun main(args: Array<String>) {
    println("¡Bienvenido a la Bola Mágica! Haz una pregunta:")
    init()
}