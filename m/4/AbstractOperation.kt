package com.example.m
    //추상클래스
    abstract class AbstractOperation {
        abstract fun operation(num1 : Double, num2 :Double) :Double
    }

    // 더하기
    class AddOperation : AbstractOperation() {
        override fun operation(num1: Double, num2: Double): Double {
            return num1 + num2
        }
    }
    //빼기
    class SubstractOperation : AbstractOperation() {
        override fun operation(num1: Double, num2: Double): Double {

            return num1 - num2
        }
    }

    //곱하기
    class MultiplyOperation : AbstractOperation() {
        override fun operation(num1: Double, num2: Double): Double {
            return num1 * num2
        }
    }

    //나누기
    class DivideOperation : AbstractOperation() {
        override fun operation(num1: Double, num2: Double): Double {
            return num1 / num2
        }
    }
