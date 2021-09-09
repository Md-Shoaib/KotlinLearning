package myForLoop

/*
* Author: Md Shoaib
* Date: 09/09/2021
* Desc: Basics of For Loop
*/

fun main() {
//    Printing 1-100 using loop
    for (i in 1..100){
        println(i)
    }

//    Looping list
    val listOfSuper = listOf("Superman", "Spiderman", "batman", "Hulk")
    for (man in listOfSuper){
        println(man)
    }

//    Pass two parameters and using some functions using loop
    for ((index, man) in listOfSuper.withIndex()){
        println("At position $index, come $man")
    }

//    sum using loop
    var sum = 0
    for (i in 1..120){
        sum = sum + i
    }
    println(sum)
}