fun main() {
    // Dealing with read-only list
    val colors: List<String> = listOf("green", "blue", "orange")
    println("Reversed list: ${colors.reversed()}")
    println("Colors: $colors")
    println("Sorted list: ${colors.sorted()}")

    val oddNumbers: List<Int> = listOf(4, 6, 1, 3, 2)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")

    val entrees: MutableList<String> = mutableListOf()
    println("Entrees: $entrees")

    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    //  Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove an item that does not exit: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    //  Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    //  Clear out the list

    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty using isEmpty()
    println("Empty? ${entrees.isEmpty()}")
}