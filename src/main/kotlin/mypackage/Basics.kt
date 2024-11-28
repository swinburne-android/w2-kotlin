
package mypackage


fun main() {
    var street: Int = 1 //create a var. this is NOT a dynamic type. its a mutable var
    var num: String = "xx"
    var xx = "xxx" //infers the type

    val xyz = 1 //immuatable variable.

    //var is mutable val is immutable


    elivsTest(null)
}

//if-else doesn't need return. it has it inbuilt
//? makes it nullable
//implicit return type
fun ifelseFunction (name:String?): String {
    return if (name == null)
        "abc"
    else name
}

//elvis symbol
//If the expression to the left of ?: is not null, the Elvis operator returns it, otherwise it returns the expression to the right
fun elivsTest(name : String?){
    val v1 = null
    val v2 = "v2"
    val v3 = null

    val r1 = v1 ?: v2
    println(r1) // what does this print?

    val r2 = v2?.length ?: -1
    println(r2) // what does this print?


    val r3 = v3 ?: -1
    println(r3) // what does this print?

}

//any return type. Any is the root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass. It is equivalent to Object in Java.  When a function is declared to return Any, it means that the function can return a value of any type
fun testAnyReturn(input: Integer): Any{
    if (input.equals(1))
        return "aa"
    return 0
}


//class definition. variable name is the property of the class and is immutable but address is mutable property
class Customer(val name : String){
    var address = ""
    fun xx(){}
}

fun testWhen(numberOfFish: Int ){
    //when is like switch
    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}


//test null with ?
//You can test for null with the ? operator, saving you the pain of writing many if/else statements.
fun testNull(){
    var abc = 7

    if (abc != null){
        abc.dec()
    }

    //another way of checking for null
    abc?.dec()
}




