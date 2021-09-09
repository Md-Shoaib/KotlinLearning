package myArray

/*
* Author: Md Shoaib
* Date: 06/09/2021
* Desc: Array list in Kotlin
*/

fun main() {
    var marvelOne = arrayOf("IronMan", "SpiderMan")

    var mixedArray = arrayOf("One", 1, 3.0)

    mixedArray[0] = "Two"

    println(mixedArray[0])

//    Specific integer type array
    var myNumArray = intArrayOf(1, 2, 3, 4, 5)

    println(myNumArray[0])

    var marvelTwo = arrayOf("Captain America")

//    Merging two arrays
    var marvelTeam = marvelOne + marvelTwo

    println(marvelTeam.size)

//    Checking empty array or not
    println(marvelTeam.isEmpty())

//    Checking something contains in our array or not using if-else
    if (marvelTeam.contains("SpiderMan")){
        println("We got spidy this time")
    } else {
        println("Got no spidy")
    }

}