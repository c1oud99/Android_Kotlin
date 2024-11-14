package eu.tutorials.kotlinbasics

fun main(){

    // Immutable list - you cannot add items after the initlization
    //val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable list - you cna add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    shoppingList.removeAt(2)
    shoppingList.removeAt(1)
    shoppingList.add(2, "RAM")
    println(shoppingList[3])

    shoppingList[3] = "Graphics Card RX 7800XT"
    shoppingList.set(1, "Water Cooling")

    val hasRam = shoppingList.contains("RAM")
    if(hasRam){
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }

    for(index in 0..3){

    }

    for(index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at $index")
    }

    // [0][1][2][3][4]
}