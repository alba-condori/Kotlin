package edu.etec.ds.fundamentos

fun saludar(): String {
    return "Hola, bienvenido!"
}

fun saludarConNombre(nombre: String): String {
    return "Hola, $nombre!"
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, $nombre$apellido!"

}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, $nombre!"
}

fun crearSaludo(titulo: String, nombre: String): String {
    return "Hola, $titulo $nombre"
}

fun funcionSinRetorno(): Unit {
    return
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun contarCaracteres(texto: String): Int {
    return texto.length
}

fun String.cuentaCaracteres(): Int {
    return length
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    val resultado = 5
    if (otro<resultado){
        return true
    }else{
        return false
    }
}

fun sumarTodos(vararg numeros: Int): Int {
    var resultado = 0
    for (n in numeros){
        resultado += n
    }
    return resultado
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    val resultado = a * b
    return resultado
}