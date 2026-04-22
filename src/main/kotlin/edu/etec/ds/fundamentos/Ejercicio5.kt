package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0
    for (n in 1..n) {
        suma += n
    }
    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var pares = 0
    for (i in inicio..fin) {
        if (i % 2 == 0) {
            pares = pares + 1
        } else {
        }
    }
    return pares
}

fun fibonacci(n: Int): Int {
    TODO("Retornar el n-esimo numero de Fibonacci")
}

fun factorial(n: Int): Int {
    TODO("Calcular el factorial de n")
}

fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (numero in numeros) {
        if (numero > maximo)
            maximo = numero
    }
    return maximo
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (numero in numeros) {
        if (numero < minimo) {
            minimo = numero
        }
    }
    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

fun inverter(texto: String): String {
    var cadena: String = ""
    for (letra in texto) {
        cadena = letra + cadena
    }
    return cadena
}

fun contarVocales(texto: String): Int {
    var suma = 0
    for (letra in texto) {
        if ((letra == 'a') || (letra == 'A') || (letra == 'e') || (letra == 'E') || (letra == 'i') || (letra == 'I') || (letra == 'o') || (letra == 'O') || (letra == 'u') || (letra == 'U')) {
            suma += 1
        }
    }
    return suma
}

fun esPalindromo(texto: String): Boolean {
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    TODO("Retornar lista con la tabla de multiplicar del 1 al 10")
}
