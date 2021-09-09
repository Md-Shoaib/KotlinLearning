package myArrayList

/*
* Author: Md Shoaib
* Date: 09/09/2021
* Desc: Array list in Kotlin
*/

fun main() {
    var myArrayListCar = arrayListOf("BMW", "Audi", "City", "Civic", "Nano")
    var myArrayListBike = arrayListOf("Harley")
    println(myArrayListCar[2])

//    Printing with merging values of arrays
    println(myArrayListBike + myArrayListCar)

//    Printing size of an array
    println(myArrayListCar.size)

//    Checking its empty or not
    println(myArrayListCar.isEmpty())

//    Checking specific containing value
    println(myArrayListCar.contains("City"))

//    Adding some value in ArrayList
    myArrayListBike.add("BMW")
    println(myArrayListBike)

//    Removing some value in ArrayList
    myArrayListBike.remove("Harley")
    println(myArrayListBike)

//    Showing some specific desired value
    val myNewCars = myArrayListCar.subList(1, 3) // in sublist first parameter will be include 2nd one will not
    println(myNewCars)


}