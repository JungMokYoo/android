package com.example.calculator


fun main(){


    println("숫자를 입력하세요")
    val num1 = readLine()!!.toInt()
    println("연산자를 입력하세요 입력하세요")
    val sic = readLine()
    println("숫자를 입력하세요")
    val num2 = readLine()!!.toInt()



    if(sic == "+") {

       println("결과는 : ${num1 + num2}")

    } else if(sic == "-") {

        println("결과는 : ${num1 - num2}")

    } else if(sic == "*") {

        println("결과는 : ${num1 * num2}")

    } else if(sic == "/") {

        println("결과는 : ${num1 / num2}")

    } else {
        print("잘못 입력하셨습니다.")
    }

}