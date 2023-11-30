package com.example.calculator

class Calculator4(private val operation4: AbstractOperation) {

    fun finalOperation(num1: Double, num2: Double): Any {
        return operation4.perform(num1, num2)
    }
}