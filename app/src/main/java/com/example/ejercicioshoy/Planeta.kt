package com.example.ejercicioshoy

class Planeta() {


    var nombre:String=""
    var tipo:String=""
    var masa:Double=0.0

    constructor(nombre:String, tipo:String, masa:Double):this(){
        if(tipo.equals("rocoso",true) || tipo.equals("gaseoso")) {
            this.tipo = tipo
        }else{
            this.tipo="Rocoso"
        }
            this.nombre = nombre
            this.masa = masa


    }
        override fun toString():String{
            return nombre+"|"+tipo+"|"+masa
        }

        fun cambiarTipo(tipoNuevo:String){
            this.tipo=tipoNuevo
        }

        fun bombardearPlaneta(){
            nombre="com.example.ejercicioshoy.Planeta ¡¡Bombardeado!!"
            tipo="Destruido"
            masa=0.0
        }



}
