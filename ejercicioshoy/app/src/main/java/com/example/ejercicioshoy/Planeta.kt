package com.example.ejercicioshoy

class Planeta(var nombre:String, var tipo:Boolean, var masa:Double) {

        override fun toString():String{
            return nombre+"|"+tipo+"|"+masa
        }

        fun cambiarTipo(tipoNuevo:Boolean){
            this.tipo=tipoNuevo
        }

        fun bombardearPlaneta(){
            nombre="¡¡El Planeta Ha Sido Bombardeado!!"
            tipo=false
            masa=0.0
        }
}
