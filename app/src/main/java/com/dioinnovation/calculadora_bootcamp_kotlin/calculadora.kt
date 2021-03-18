package com.dioinnovation.calculadora_bootcamp_kotlin

import kotlin.math.pow
import kotlin.system.exitProcess

fun main ( ) {

    println("SELECIONE A OPERAÇÃO DESEJADA PELO NÚMERO (1-6) OU (0) PARA SAIR.")
    println("1 = SOMA")
    println("2 = SUBTRAÇÃO")
    println("3 = DIVISÃO")
    println("4 = MULTIPLICAÇÃO")
    println("5 = PORCENTAGEM")
    println("6 = POTENCIA")
    println("0 = SAÍDA")

    println("OPERAÇÃO: ")
    val calc: Int = readLine()!!.toInt()
    if (calc == 0){
        exitProcess(1)
    }

    println("VALOR 1: ")
    val n1: Float = readLine()!!.toFloat()

    println("VALOR 2: ")
    val n2: Float = readLine()!!.toFloat()

    when (calc) {
        1-> { println("SOMA = " + som(n1, n2)) }
        2-> { println("SUBTRAÇÃO = " + sub(n1, n2)) }
        3-> { println("DIVISÃO = " + div(n1, n2)) }
        4-> { println("MULTIPLICAÇÃO = " + mul(n1, n2)) }
        5-> { println("PORCENTAGEM = " + por(n1, n2)) }
        6-> { println("POTENCIA = " + pot(n1, n2)) }
    }

}

fun som(n1: Float, n2: Float) = n1.plus(n2)
fun sub(n1: Float, n2: Float) = n1.minus(n2)
fun div(n1: Float, n2: Float) = n1.div(n2)
fun mul(n1: Float, n2: Float) = n1.times(n2)
fun por(n1: Float, n2: Float) = n1.times(n2) / 100
fun pot(n1: Float, n2: Float) = n1.pow(n2)