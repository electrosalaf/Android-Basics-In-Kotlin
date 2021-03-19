fun main() {

    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    peopleAges.forEach { println("${it.key} is ${it.value}")  }
    println(peopleAges.map { "${it.key} is ${it.value} "}.joinToString { ", " })

    val filteredNames = peopleAges.filter { it.key.length < 3}
    println(filteredNames)

    val words = listOf("about", "acute", "awesome", "ballon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)

    val newFilteredWords = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(1)
        .sorted()
    println(newFilteredWords)

    val cities = listOf("Jeddah", "Bengaluru", "Shenzhen", "Abu Dhabi", "Mountain View", "Tripoli", "Bengaluru", "Lima", "Mandalay", "Tripoli")
    val oneWordCities = cities.toSet().toList().filter { !it.contains(" ") }.sorted()
    println(oneWordCities[1])
}