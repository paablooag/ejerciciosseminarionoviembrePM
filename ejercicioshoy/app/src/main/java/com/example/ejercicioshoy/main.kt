package com.example.ejercicioshoy

fun main(){
    /*
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

     */
    /*
    val contacos = mutableListOf<Contacto>(
        Contacto("Pablo", 687361991, "pito@gmail.com"),
        Contacto("Pito", 173912823, "simamidamemas@gmail.com"),
        Contacto("Chico", 173945823, "simamidamemenos@gmail.com"),
        Contacto("Ultimo", 973912823, "simamidamepoco@gmail.com")
    )

    println(contacos[0])
     */
    val Alumno = mutableListOf<Estudiantes>(
        Estudiantes("Raúl", 3, 8.75),
        Estudiantes("Álvaro", 2, 3.75),
        Estudiantes("Paca", 5, 9.75),
        Estudiantes("Manu", 2, 4.75)
    )

    println(Alumno[2])
    println(Estudiantes.media(Alumno))

}
