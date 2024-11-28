package mypackage

fun main() {
}

/*
 lists  have mutable and immutable versions,
 arrays are always mutable
 */
fun playWithLists() {
    var imList = listOf<String>("a", "b") // immutable
    var mList = mutableListOf("a", "b") //mutable


    arrayOf("") //mutable always
    var mylist = intArrayOf(1, 2) //mutable

    for (i in mylist) {
        println(i)
    }

    for (i in 1..2) {
        println(i)
    }

}

/*
a data class is a class that is primarily used to hold data. similiar to java dto
They automatically generate several useful methods such as equals(), hashCode(), and toString()
 */
data class User(val name: String, val age: Int)

val user = User("Alex", 1)

fun playWithDataClasses() {
    println(user.age)
}



