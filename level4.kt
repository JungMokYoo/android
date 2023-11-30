package com.example.calculator

fun main() {
    println("번호를 입력하세요")
    val num1 = readLine()!!.toDouble()
    println("연산자를 입력하세요 입력하세요")
    val sic = readLine()

    println("번호를 입력하세요")
    val num2 = readLine()!!.toDouble()

    val operation = when (sic) {
        "+" -> AddOperation4()
        "-" -> SubtractOperation4()
        "*" -> MultiplyOperation4()
        "/" -> DivideOperation4()
        else -> {
            println("잘못 입력하셨습니다.")
            return
        }
    }

    val calculator = Calculator4(operation)
    val result = calculator.finalOperation(num1, num2)

    println("결과는 : $result")
}