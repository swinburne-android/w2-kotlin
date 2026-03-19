package mypackage

fun advancedBasics() {
    // 1. Named and Default Arguments
    // You can call functions and skip arguments with defaults, or name them for clarity.
    createUser(name = "Alice") // skips 'role'
    createUser(role = "Admin", name = "Bob") // order doesn't matter if named
    
    // 2. Extension Functions
    // We are "adding" a function to the String class!
    val message = "Hello World"
    println(message.removeSpaces())
    
    // 3. Multi-line Strings
    val longText = """
        This is a multi-line string.
        It preserves formatting.
        Great for SQL or JSON!
    """.trimIndent()
    println(longText)
}

fun createUser(name: String, role: String = "User") {
    println("Created $role: $name")
}

// Extension function syntax: ClassName.functionName()
fun String.removeSpaces(): String {
    return this.replace(" ", "")
}

// 4. Object Expressions (Singleton pattern)
// In Kotlin, you can create a singleton easily.
object DatabaseConfig {
    val url = "jdbc:mysql://localhost:3306/mydb"
}
