package mypackage

// Public function is the default visibility.
fun testVars() {
    var street: Int = 1 // 'var' is a mutable variable (can be reassigned).
    var num: String = "xx"
    var xx = "xxx" // Type inference: Kotlin knows this is a String.

    val xyz = 1 // 'val' is an immutable (read-only) variable. 
    // Tip for students: Use 'val' by default. Use 'var' only if the value must change.

    elvisTest(null)
    stringTemplates("Kotlin")
}

// String templates allow you to easily inject variables or expressions into strings.
fun stringTemplates(name: String) {
    println("Hello, $name!") // Using a variable
    println("The name has ${name.length} characters.") // Using an expression
}

// if-else is an expression in Kotlin, meaning it can return a value.
fun ifelseFunction(name: String?): String {
    return if (name == null)
        "abc"
    else name
}

// Elvis operator (?:)
// If the expression to the left is not null, it returns it; otherwise, it returns the right side.
private fun elvisTest(name : String?){
    val v1: String? = null
    val v2 = "v2"
    val v3: String? = null

    val r1 = v1 ?: v2
    println(r1) // Prints "v2"

    val r2 = v2.length // v2 is non-nullable, so we don't need ?.
    println(r2)

    val r3 = v3 ?: "Default Value"
    println(r3)
}

// 'Any' is the root of the Kotlin class hierarchy, similar to Object in Java.
fun testAnyReturn(input: Int): Any {
    if (input == 1)
        return "aa"
    return 0
}

// Class definition. 'name' is a property from the primary constructor.
class Customer(val name: String) {
    var address: String = "" 
    
    fun greet() {
        println("Hello $name")
    }
}

fun testWhen(numberOfFish: Int) {
    // 'when' is the Kotlin equivalent of 'switch', but more powerful.
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

// Null safety is a core feature of Kotlin.
fun testNull() {
    var abc: Int? = 7 // The '?' makes the Int nullable.

    // Safe call operator (?.)
    // If 'abc' is null, dec() isn't called, and the result is null.
    abc?.dec()

    // The 'let' function is used to execute code only if the value is not null.
    abc?.let {
        println("abc is not null. Its value is $it")
    }
}
