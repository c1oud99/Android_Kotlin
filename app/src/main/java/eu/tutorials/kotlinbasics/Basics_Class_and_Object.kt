package eu.tutorials.kotlinbasics

fun main(){

    // Creating an object/instance of the class Dog
    var daisy = Dog("Daisy", "Dwarf poodle", 3) // 기본값을 사용하여 인스턴스 생성

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year has passed!")
    daisy.age = 5
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
}