package myFunc

/*
* Author: Md Shoaib
* Date: 09/09/2021
* Desc: Basics of Function
*/

fun sayHello(name: String) {
    println("I am $name")
    println("Hello there, $name")
}

//  Function to insert dashes
fun crazyStringy(sample: String){
    for (s in sample){
        print(s + "-")
    }
}

fun main() {

    sayHello("John")
    sayHello("Sarah")

    crazyStringy("KOTLIN")

}