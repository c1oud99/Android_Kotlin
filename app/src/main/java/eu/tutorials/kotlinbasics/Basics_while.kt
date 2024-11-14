package eu.tutorials.kotlinbasics

fun main(){

    var count = 0
    while(count < 3){
        println("Count is $count")
        count++
    }

    var userInput = readln()
    while(userInput == "1"){
        println("While loop executed")
        userInput = readln()
    }
    println("Loop is done!")

    /*
    while(true){
        // so long this content will be executed
    } */
}