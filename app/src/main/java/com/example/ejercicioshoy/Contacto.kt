package com.example.ejercicioshoy

import java.lang.RuntimeException

class Contacto {
    var nombre=""
    var telefono=0
    var gmail=""

    constructor(nombre:String, telefono:Int, gmail:String){
        this.nombre=nombre
        if(telefono>99999999 && telefono<9999999999){
            this.telefono=telefono
        }else{
            throw RuntimeException ("Error al crear el contacto")
        }
        this.gmail=gmail
    }
    override fun toString(): String {
        return "Nombre $nombre \nTelefono $telefono \nGmail $gmail"
    }

}