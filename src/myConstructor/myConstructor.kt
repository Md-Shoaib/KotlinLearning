package myConstructor

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Constructor
*/

class Man(name: String, age: Int) {
    //    Properties
    var name: String
    var age: Int

//    Initializing Constructor
    init {
        this.name = name
        this.age = age
    }

    //    Methods
    fun walk(){
        println("I can Walk")
    }

    //    Methods
    fun greet(name: String){
        println("Hello there, $name")
    }
}

fun main() {

//    Creating class and its constructer
    var ross = Man("Ross", 28)

    println(ross.name)
    println(ross.age)

    println(ross.name)

//    New Object
    var adam = Man("Adam", 29)

    println(adam.name)

//    Applying different functionality
    adam.walk()
    adam.greet("Eve")

}