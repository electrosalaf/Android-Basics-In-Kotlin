fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println("List: $numbers")
    println("Size: ${numbers.size}")

    // Access elements of the list
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Second: ${numbers.last()}")

    //  Use the contains method
    println("Contain 4? ${numbers.contains(4)}")
    println("Contain 7? ${numbers.contains(7)}")
}

