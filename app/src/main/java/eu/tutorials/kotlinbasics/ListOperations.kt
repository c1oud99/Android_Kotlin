package eu.tutorials.kotlinbasics

fun main(){
    val fruitsList = mutableListOf("watermelon", "peach", "strawberry", "tomato", "apple")
    fruitsList.add("kiwi")
    println(fruitsList)
    fruitsList.remove("apple")

    val hasKiwi = fruitsList.contains("kiwi")
    if(hasKiwi){
        println("Has kiwi in the list")
    }else{
        println("No kiwi in the list")
    }
}

