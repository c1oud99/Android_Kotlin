package eu.tutorials.kotlinbasics

fun main(){

    var age = 0

    println("Please enter your age as a whole number")
    // read what the user has entered into the console
    var enteredValue = readln()
    // convert the string variable into an int variable
    age = enteredValue.toInt()

    // age = readln().toInt()

    if(age >= 40){
        println("You can not go into the club, please go home")
    }else if(age >= 18){
        println("You can enter")
    }else{
        println("You are too young to go into the club!")
    }

}