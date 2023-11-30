package com.example.calculator

class Calculator(private val operation: Operation) {

    fun finalOperation(num1: Double, num2: Double): Any {
        return operation.perform(num1, num2)
    }
}