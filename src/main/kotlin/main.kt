fun main(args: Array<String>) {

    // Map
    // = Dictionary
    val films = mutableMapOf<String, MutableList<String>>()
    println(films)

    films.put("SF", mutableListOf("Alien", "Star-wars"))
    films.put("Action", mutableListOf("Indiana Jones", "James bond"))
    println(films)

    val sfFilms = films.get("SF")
    val actionFilms = films["Action"]
    val loveFilms = films.get("Love")
    println(sfFilms)
    println(actionFilms)
    println(loveFilms)

    val authenticationHeaders = mapOf(
        "API_KEY" to "AZEAAZCQ1221#D23",
        "Token" to "auth_token",
        "content/type" to "application/pdf"
    )
    println(authenticationHeaders)

    // ADD
    films["Love"] = mutableListOf("Gone with the wind", "Love story")
    println(films)

    films["SF"]?.add("The 5th Element")
    println(films)

    // REMOVE
    films.remove("Action")
    val removedLoveFilms = films.remove("Love")
    println(removedLoveFilms)
    println(films)

    // Iterate
    films.put("SF", mutableListOf("Alien", "Star-wars"))
    films.put("Action", mutableListOf("Indiana Jones", "James bond"))
    println(films)

    for (key in films.keys) {
        println(key)
    }

    for (value in films.values) {
        println(value)
    }

    for ((key, value ) in authenticationHeaders) {
        println("$key : $value")
    }

    println()
    println("--Films collection START --")
    for ((key, value ) in films) {
        println("$key :")
        for (film in value) {
            print(film)
        }
        println()
    }
    println("--Films collection END --")
}