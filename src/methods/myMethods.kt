package methods

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Methods in Classes
*/

class Man {
//    Properties
    var name: String = "Joey"
    var age: Int = 27

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
    var ross = Man()

    println(ross.name)
    println(ross.age)

//    Overwriting Property
    ross.name = "Ross"
    println(ross.name)

//    New Object
    var adam = Man()
    adam.name = "Adam"

    println(adam.name)

//    Applying different functionality
    adam.walk()
    adam.greet("Eve")

}