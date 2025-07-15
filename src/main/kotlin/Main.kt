import mypackage.*


//main function is the entry point into the Kotlin application. folder sorc/main/kotlin should be set as source root (right click on it in the project view and select "Mark Directory as" -> "Sources Root")
fun main(args : Array<String>) {
    print("hi ")
    println("hello world") //println is a function that prints to the console and adds a new line at the end
    //calling a function
    printSomething()

    //calling a public function from another package
    testVars()

}

//println("hello world") -- can i put this here? no, it has to be inside a function or class.

//defining a function. with a default parameter
fun printSomething(name: String = "some name"){
    print(name)
}

//one line version of above
fun printSomething2(name: String = "some name") = print(name)


