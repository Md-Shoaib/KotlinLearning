package myBreakCont

/*
* Author: Md Shoaib
* Date: 09/09/2021
* Desc: Basic example of break and continue keyword
*/

fun main() {

//    Skipping the o
    for (v in "mmhhttyyppaaoaanneeyy") {
        if (v == 'o') {
            continue
        }
        println(v)
    }
    println("I am outside the for loop")

//    Select valid users only
    var users = listOf("samz", "John", "Sarahz", "Kapil")

    for (u in users) {
        if (u.contains('z')){
            continue
        }
        println(u)
    }

}