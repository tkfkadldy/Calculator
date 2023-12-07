package com.example.m

class Calculator {
    fun addOperation(num1: Int, num2: Int): Double =AddOperation().operate(num1, num2)

    fun subtractOperation(num1: Int, num2: Int): Double =SubtractOperation().operate(num1, num2)

    fun multiplyOperation(num1: Int, num2: Int): Double =MultiplyOperation().operate(num1, num2)

    fun divideOperation(num1: Int, num2: Int): Double =DivideOperation().operate(num1, num2)
}

