package eu.tutorials.kotlinbasics

fun main(){

    val str = "string"
    println(str)

    var myAge : Short = 35
    println(myAge)
    myAge = 36
    println(myAge)

    var piFloat = 3.14f
    println(piFloat)
    piFloat = 3.1415926535f
    println(piFloat)

    var piDouble = 3.14
    println(piDouble)
    piDouble = 3.1415926535
    println(piDouble)

    var age: UShort = 35u
    println(age)

    var myTrue: Boolean = true
    var myFalse: Boolean = false
    println(myTrue || myFalse)  // true
    println(myTrue && myFalse)  // false
    println(!myTrue)    // false

    var myChar = '\u00AE'
    println(myChar)

    var firstName = "Alice"
    // firstName = "Very LONG paragraphs can be stored inside of strings"
    println(firstName)
    println(firstName.lowercase())
    println(firstName.uppercase())
    println(firstName + "Rosie")
    var lastName = "Rosie"
    println(firstName + " " + lastName)
}