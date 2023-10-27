package com.example.ejercicioshoy

import kotlin.math.max

class SistemaSolar() {

     private lateinit var lista: MutableList<Planeta>

    constructor(lista:MutableList<Planeta>):this(){
        this.lista=lista
    }

    fun mayorPeso():Planeta{
        var listaOrdenada= this.lista

        listaOrdenada.sortByDescending { it.masa }

        return listaOrdenada.get(0)
    }

    fun menorPeso():Planeta{
        var listaOrdenada= this.lista

        listaOrdenada.sortBy { it.masa }

        return listaOrdenada.get(0)
    }

}