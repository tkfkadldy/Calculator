package com.example.m

fun main() {

    var calc = Calculator()
    var num1 = readLine()!!.toInt()
    var operator = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

    if (operator == "+"){
        var calc = calc.AddOperation(num1,num2)
        println("${num1} ${operator} ${num2} =  ${calc}")
    } else if (operator == "-"){
        var calc = calc.SubtractOperation(num1,num2)
        println("${num1} ${operator} ${num2} =  ${calc}")
    } else if (operator == "*"){
        var calc = calc.MultiplyOperation(num1,num2)
        println("${num1} ${operator} ${num2} =  ${calc}")
    } else if (operator == "/"){
        var calc = calc.DivideOperation(num1,num2)
        println("${num1} ${operator} ${num2} =  ${calc}")
    } else{
        println("올바른 부호가 아닙니다")
    }
}

class Calculator{
    var num1: Int = 0
    var operator: String = ""  //기호
    var num2: Int = 0
    var calc: Int = 0

    fun AddOperation(num1: Int, num2: Int): Int {
        calc =num1+num2
        return calc
    }

    fun SubtractOperation(num1: Int, num2: Int): Int {
        calc =num1-num2
        return calc
    }

    fun MultiplyOperation(num1: Int, num2: Int): Int {
        calc =num1*num2
        return calc
    }
    fun DivideOperation(num1: Int, num2: Int): Int {
        calc =num1/num2
        return calc
    }

    fun rest(num1: Int, num2: Int): Int {
        calc =num1%num2
        return calc
    }

}
