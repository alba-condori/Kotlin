package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    if (numero > 0) {
        return "Positivo"
    } else {
        return "No positivo"
    }
}

fun clasificarNumero(numero: Int): String {
    if (numero > 10) {
        return "Mayor a 10"
    } else if (numero < 10) {
        return "Menor a 10"
    } else {
        return "Igual a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    if (edad < 18) {
        return "Menor de edad"
    }
    if (edad <= 65) {
        return "Adulto"
    } else {
        return "Adulto mayor"
    }
}

fun obtenerDescuento(monto: Double): Double {
    return when {
        monto >= 200 -> 30.0
        monto >= 150 -> 20.0
        monto >= 100 -> 10.0
        else -> 0.0
    }
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    return when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> if (b == 0) 0.0 else (a / b.toDouble())
        else -> 0.0
    }
}