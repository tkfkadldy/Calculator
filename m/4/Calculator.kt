package com.example.m

//상위모듈인 AbstractOperation을 의존하는 Calculator클래스
    class Calculator(private val operation: AbstractOperation)  {
        //생성자 설정과 반환타입 설정
        fun operation(num1 : Double,num2 : Double) : Double {
            return operation.operation(num1, num2)
        }

    }

