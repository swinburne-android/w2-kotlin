package mypackage

fun main() {
    playWithLists()
    playWithDataClasses()
    playWithFunctionalOperations()
}

/*
 Lists have mutable and immutable versions.
 Arrays are always mutable (their size is fixed, but elements can be changed).
 */
fun playWithLists() {
    val imList = listOf("a", "b") // immutable (read-only)
    val mList = mutableListOf("a", "b") // mutable
    mList.add("c")

    val mylist = intArrayOf(1, 2) // specialized array for primitives

    // Iterating with 'for'
    for (item in imList) {
        println(item)
    }

    // Ranges are very useful in loops
    for (i in 1..5) {
        print("$i ")
    }
    println()
}

/*
 Functional operations like filter and map are very common in Kotlin.
 They allow you to process collections in a declarative way.
 */
fun playWithFunctionalOperations() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    
    // Filter: keep only even numbers
    val evens = numbers.filter { it % 2 == 0 }
    
    // Map: double each number
    val doubled = numbers.map { it * 2 }
    
    println("Evens: $evens")
    println("Doubled: $doubled")
}

/*
 A data class is a class primarily used to hold data. 
 It automatically generates: equals(), hashCode(), toString(), and copy().
 */
data class User(val name: String, val age: Int)

fun playWithDataClasses() {
    val user = User("Alex", 25)
    println(user) // Automatically uses the generated toString()
    
    // Copying a data class while changing one property
    val olderUser = user.copy(age = 26)
    println(olderUser)
}
