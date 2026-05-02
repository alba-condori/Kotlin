package edu.etec.ds.fundamentos

fun suma(a: Int, b: Int): Int {
    return a + b;
}

fun resta(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b
}


fun division(a: Int, b: Int): Int {
    return a / b
}

fun modulo(a: Int, b: Int): Int {
    return a % b
}

fun esMayorQue(a: Int, b: Int): Boolean {
    return a > b
}

fun esMenorQue(a: Int, b: Int): Boolean {
    return a < b
}

fun sonIguales(a: Int, b: Int): Boolean {
    return a == b
}

fun esPar(numero: Int): Boolean {
    if (numero % 2 == 0){
        return true
    } else {
        return false
    }
}

fun esImpar(numero: Int): Boolean {
    if (numero % 2 != 0){
        return true
    } else {
        return false
    }
}

fun valorAbsoluto(numero: Int): Int {
    if (numero < 0){
        val valAbs = -numero
        return valAbs
    } else{
        return numero
    }
}

fun maximo(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun minimo(a: Int, b: Int): Int {
    if (a < b) {
        return a
    } else {
        return b
    }
}