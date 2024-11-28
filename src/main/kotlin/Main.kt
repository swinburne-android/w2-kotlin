
//main function is the entry point
fun main() {
    print("hello world")

    //calling a function
    printSomething()
}

//println("hello world") -- can i put this here? no, it has to be inside a function or class.

//defining a function. with a default parameter
fun printSomething(name: String = "some name"){
    print(name)
}

//one line version of above
fun printSomething2(name: String = "some name") = print(name)


