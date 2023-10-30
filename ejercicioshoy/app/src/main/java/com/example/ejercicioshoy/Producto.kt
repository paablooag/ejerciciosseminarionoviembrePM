package com.example.ejercicioshoy

import java.lang.RuntimeException

class Producto {
    var nombre=""
    var precio=0.0
    var cantidad=0

    constructor(nombre:String, precio: Double, cantidad:Int){
        this.nombre=nombre
        this.precio=precio
        this.cantidad=cantidad
    }

    override fun toString(): String {
        return "Nombre: $nombre \nPrecio: $precio \nCantidad: $cantidad"
    }

    fun actualizarStock(Cantidad:Int){
        if(Cantidad<0){
            throw RuntimeException ("No puede haber Stock negativo")
        }
       this.cantidad=Cantidad
    }

}