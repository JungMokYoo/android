package com.example.calculator

class Calculator2 {

    /*fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }*/
     //왜 위에 만든 펑션은 안먹히는지 모르겠네요 ㅠㅠ
    companion object {
        fun add(num1: Int, num2: Int): Int {
            return num1 + num2
        }
        fun minus(num1: Int, num2: Int): Int {
            return num1 - num2
        }
        fun multiply(num1: Int, num2: Int): Int {
            return num1 * num2
        }
        fun divide(num1: Int, num2: Int): Int {
            return num1 / num2
        }
         fun na(num1: Int, num2: Int): Int {
             return num1 % num2
         }
    }

}


fun main(){


    println("숫자를 입력하세요")
    var num1 = readLine()!!.toInt()

    while (true) {

    println("연산자를 입력하세요 입력하세요")
    var sic = readLine()!!.toString()

    println("숫자를 입력하세요")
    var num2 = readLine()!!.toInt()





    if (sic == "+") {
        num1 =Calculator2.add(num1, num2)
        println("결과는 :  ${num1}")

    } else if (sic == "-") {

        num1 =Calculator2.minus(num1, num2)
        println("결과는 :  ${num1}")

    } else if (sic == "*") {

        num1 =Calculator2.multiply(num1, num2)
        println("결과는 :  ${num1}")

    } else if (sic == "/") {

        num1 =Calculator2.divide(num1, num2)
        println("결과는 :  ${num1}")

    } else if(sic == "%") {
        num1 =Calculator2.na(num1, num2)
        println("결과는 :  ${num1}")
    }else {
        print("잘못 입력하셨습니다.")
        break
    }
 }


}