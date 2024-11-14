package eu.tutorials.kotlinbasics

fun main(){

    println("숫자를 입력해주세요.")
    var inputString = readln()
    var inputNumber = inputString.toInt()
    val multiplier = 5

    println("연산 결과는 " + (inputNumber * multiplier))
}