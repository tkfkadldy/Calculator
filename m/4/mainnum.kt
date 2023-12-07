package com.example.m

fun main() {
    //결과값 선언
    var calc : Double = 0.0

    //출력
    println("첫번째 값을 입력해주세요")
    var num1 : Double= readLine()!!.toDouble()
    println("부호를 입력해주세요")
    var operator  : String= readLine()!!.toString()
    println("두번째 값을 입력해주세요")
    var num2 : Double = readLine()!!.toDouble()

    //클래스를 변수로
    val add = AddOperation()
    val sub = SubstractOperation()
    val mul = MultiplyOperation()
    val div = DivideOperation()

    //변수를 Calculator에 대입하고 다른 변수에 담
    val addOperator = Calculator(add)
    val subtractOperator = Calculator(sub)
    val multiplyOperator = Calculator(mul)
    val divideOperator = Calculator(div)

    //계산식
    when(operator){
        "+" -> {
            calc = addOperator.operation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }
        "-" -> {
            calc = subtractOperator.operation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }
        "*" -> {
            calc = multiplyOperator.operation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }
        "/" -> {
            calc = divideOperator.operation(num1, num2)
            println("${num1} ${operator} ${num2} =  ${calc}")
        }

        else -> {
            println("올바른 부호가 아닙니다")
        }
    }



}


