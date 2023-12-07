package com.example.m

fun main() {
    println("첫번째 값을 입력해주세요")
    var num1: Int = readLine()!!.toInt()
    println("부호를 입력해주세요")
    var operator: String = readLine()!!.toString()
    println("두번째 값을 입력해주세요")
    var num2: Int = readLine()!!.toInt()
    var calc: Double = 0.0

        when (operator) {
            "+" -> {
                calc = Calculator().AddOperation(num1, num2)
            }

            "-" -> {
                calc = Calculator().SubtractOperation(num1, num2)
            }

            "*" -> {
                calc = Calculator().MultiplyOperation(num1, num2)
            }

            "/" -> {
                calc = Calculator().DivideOperation(num1, num2)
            }

            "%" -> {
                calc = Calculator().rest(num1, num2)
            }
        }
        println("${num1} ${operator} ${num2} =  ${calc}")


}

class Calculator {
    var num1: Int = 0
    var num2: Int = 0
    var operate: String = ""  //기호

    fun AddOperation(num1: Int, num2: Int) :Double= num1+num2.toDouble()
    fun SubtractOperation(num1: Int, num2: Int) :Double= num1-num2.toDouble()
    fun MultiplyOperation(num1: Int, num2: Int) :Double= num1*num2.toDouble()
    fun DivideOperation(num1: Int, num2: Int):Double = num1/num2.toDouble()
    fun rest(num1: Int, num2: Int) :Double = num1%num2.toDouble()
}
