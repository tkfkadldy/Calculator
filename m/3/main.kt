package com.example.m

fun main() {
    var calc :Double= 0.0
    println("첫번째 값을 입력해주세요")
    var num1: Int = readLine()!!.toInt()
    println("부호를 입력해주세요")
    var operator: String = readLine()!!.toString()
    println("두번째 값을 입력해주세요")
    var num2: Int = readLine()!!.toInt()


    when (operator) {
        "+" -> {
            calc = Calculator().addOperation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }

        "-" -> {
            calc = Calculator().subtractOperation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }

        "*" -> {
            calc = Calculator().multiplyOperation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }

        "/" -> {
            calc = Calculator().divideOperation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }
        else -> {
            println("올바른 부호가 아닙니다")
        }
    }
}
