package eu.tutorials.kotlinbasics

import java.time.LocalDate

class Book(
    var title: String = "Unknown",
    var author: String = "Anonymous",
    var yearPublished: Int = LocalDate.now().year
)

fun main(){
    val myBook = Book() // 기본값을 사용하여 인스턴스 생성
    println("Title: ${myBook.title}, Author: ${myBook.author}, Year: ${myBook.yearPublished}")

    val customBook = Book("She so lovely!", "Danielle", 2005)   // 사용자 정의 값 인스턴스
    println("Title: ${customBook.title}, Author: ${customBook.author}, Year: ${customBook.yearPublished}")
}