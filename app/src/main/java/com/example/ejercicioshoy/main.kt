package com.example.ejercicioshoy

fun main(){
/*

    println("Cuantos planetas deseas añadir : ")
    var actualizacion=readLine()
    var cantidad = actualizacion?.toInt() ?: 0
    var sistema= mutableListOf<Planeta>()
    var nombre=""
    var masa=0.0
    var tipo=""
    for (i in 1 .. cantidad){
        println("Nombre del planeta")
        nombre= readLine().toString()
        println("Tipo")
        tipo= readLine().toString()
        println("Masa del planeta")
        masa= readLine()?.toDouble() ?: 0.0
        var nombre=Planeta(nombre, tipo, masa)
        sistema.add(nombre)
    }
    var sistemasolar=SistemaSolar(sistema)
    for (i in sistemasolar.lista.indices){
        println(sistemasolar.lista[i].toString())
    }

 */


var lista = mutableListOf<Planeta>(
    Planeta("Ano", "Gaseoso", 12.43),
    Planeta("Pito", "Rocoso", 10.43),
    Planeta("Polla", "Rocoso", 12.43),
    Planeta("Lorena", "Gaseoso", 14.43),
    Planeta("Ines", "Rocoso", 52.43),
    Planeta("Anodf", "Gaseoso", 32.43),
    Planeta("Anuco", "Rocoso", 132.43),
    Planeta("Tierra", "Gaseoso", 92.0),
    Planeta("Mnuo", "Gaseoso", 12.413)

    )
/*
for (i in lista.indices){
    println(lista[i])
}


 */

    /*
for (i in lista.indices){
    if(lista[i].nombre[0].equals('m', true)){
        println(lista[i])
    }

     */
/*
    var masaTierra=0.0
    for (i in lista.indices) {
        if (lista[i].nombre.equals("Tierra", true)) {
            masaTierra = lista[i].masa
        }
    }
    for (i in lista.indices){
        if(lista[i].tipo == "Rocoso" && lista[i].masa>(20*masaTierra)){
        println(lista[i])
    }

}

 */
/*
    var masaMedia=0.0
    var contador=0
    var sumaMasa=0.0
    for (i in lista.indices){
        sumaMasa+=lista[i].masa
        contador++
    }
    masaMedia=sumaMasa/contador
    println(masaMedia)


 */

/*

    println("Cuantos contactos deseas añadir : ")
    var actualizacion=readLine()
    var cantidad = actualizacion?.toInt() ?: 0
    var sistema= mutableListOf<Contacto>()
    var nombre=""
    var gmail="0.0"
    var telefono=0
    for (i in 1 .. cantidad){
        println("Nombre del contacto:")
        nombre= readLine().toString()
        println("Gmail:")
        gmail= readLine().toString()
        println("Telefono")
        telefono= readLine()?.toInt() ?: 0
        var nombre=Contacto(nombre, telefono, gmail)
        sistema.add(nombre)
    }


    for (i in sistema.indices){
        println(sistema[i].toString())
    }


 */
    /*
    val Alumno = mutableListOf<Estudiantes>(
       Estudiantes("Raúl", 3, 8.75),
       Estudiantes("Álvaro", 2, 3.75),
       Estudiantes("Paca", 5, 9.75),
       Estudiantes("Manu", 2, 4.75)
    )

    println(Alumno[2])
    println(Estudiantes.media(Alumno))

     */

/*
val inventario = mutableListOf<Producto>(
    Producto("Consolador", 20.99, 35),
    Producto("Anillo Vibrador", 9.99, 55),
    Producto("Arnés Pene", 18.99, 15)
)

println("De cuantos productos desea añadir el inventario: ")
var actualizacion=readLine()
var cantidad = actualizacion?.toInt() ?: 0
var nombre=""
var precio=0.0
for (i in 1 .. cantidad){
    println("Nombre de producto que desea añadir")
        nombre= readLine().toString()
    println("Precio del producto")
        precio= readLine()?.toDouble() ?: 0.0
    println("Stock que desea añadir")
        cantidad= readLine()?.toInt() ?: 0
    var nombre=Producto(nombre, precio, cantidad)
}
for (i in inventario.indices){
    println(inventario[i].toString())
}

 */



}
