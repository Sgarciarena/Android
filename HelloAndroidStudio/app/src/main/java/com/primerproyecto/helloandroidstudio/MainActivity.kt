package com.primerproyecto.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesyConstantes()
        tiposDeDatos()
    }

    private fun variablesyConstantes(){
        //Variables
        var myVariable = "Hola pillo"

        println(myVariable)
        myVariable = "2"
        println(myVariable)

        //Constantes
        val constante = "Tu vieja"

    }

    private fun tiposDeDatos(){



    }
}