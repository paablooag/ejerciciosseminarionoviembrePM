package com.example.ejercicioshoy

fun main(){
    val lista = mutableListOf(
        Planeta("Mercurio", "Rocoso", 0.055),
        Planeta("Venus", "Rocoso", 0.815),
        Planeta("Tierra", "Rocoso", 1.0),
        Planeta("Marte", "Rocoso", 0.107),
        Planeta("Júpiter", "Gaseoso", 317.8),
        Planeta("Saturno", "Gaseoso", 95.2),
        Planeta("Urano", "Gaseoso", 14.5),
        Planeta("Neptuno", "Gaseoso", 17.1)
    )
    var sistema=SistemaSolar(lista)

    println(sistema.mayorPeso())


    println(sistema.menorPeso())
}
