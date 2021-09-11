package getterssSetters

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Getters and setters
*/

class Bank {
    var updateBalance: Int = 20
        get() = field
        set(value) {
            if (value >= 0){
                field = value
            } else {
                this.warning = "Balance should be in positive number"
            }
        }
    var warning: String = ""
}

fun main() {
    val adam = Bank()
    adam.updateBalance = -200
    println(adam.warning)
    println(adam.updateBalance)

        println(adam.updateBalance)
}