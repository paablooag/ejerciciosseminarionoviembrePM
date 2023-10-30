package com.example.ejercicioshoy

import java.lang.RuntimeException

class Estudiantes {
    var nombre=""
    var edad=0
    var calificaciones=0.0
    constructor(nombre:String, edad:Int, calificaciones:Double){
        this.nombre=nombre
        if(edad<0){
            throw RuntimeException ("Error al crear")
        }else {
            this.edad = edad
        }
        this.calificaciones=calificaciones
    }

    override fun toString(): String {
        return "Nombre: $nombre \nEdad: $edad \nNota: $calificaciones"
    }

    companion object{
    fun media(lista:MutableList<Estudiantes>):Double {
        var media = 0.0

        for (i in lista.indices) {
            media+= lista[i].calificaciones

        }
        media /= lista.size
        return media
    }
    }
}