fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 9, 4, 2)
    println("list: $numbers")
    println("sorted: ${numbers.sorted()}")
    val setOfNumbers = numbers.toSet();
    println("set: $setOfNumbers")
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")
    println("Contains 7: ${setOfNumbers.contains(7)}")
    println("Contains 2: ${setOfNumbers.contains(2)}")
}