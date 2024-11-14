package eu.tutorials.kotlinbasics

fun main(){
    var playerChoice = ""
    var computerChoice = ""
    while(playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors"){
        println("rock, paper or scissors? Enter your choice!")
        playerChoice = readln().lowercase()
        if(playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors"){
            println("Please enter it correctly.")
        }
    }

    var randomNumber = (1..3).random()
    when(randomNumber){
        1 -> {
            computerChoice = "rock"
        }
        2 -> {
            computerChoice = "paper"
        }
        3 -> {
            computerChoice = "scissors"
        }
    }
    println(computerChoice)

    var winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a Tie!")
    }else{
        println("$winner won!")
    }
}