package com.techspace.day11_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sakas #1
        val btnFact = findViewById<Button>(R.id.btnFact)


        btnFact.setOnClickListener{

            sanatizeInputException()


        }

        //sakas MD
        val btnThrow = findViewById<Button>(R.id.btnThrow)

        val lblResultPl1 = findViewById<TextView>(R.id.lblResultPl1)
        val lblResultPl2 = findViewById<TextView>(R.id.lblResultPl2)
        val lblWinResult = findViewById<TextView>(R.id.lblWinResult)
        btnThrow.setOnClickListener{
            val editDiceCount = findViewById<EditText>(R.id.editDiceCount)
            val res = Results()
            var pl1 = res.getResult(lblResultPl1, editDiceCount)
            var pl2 = res.getResult(lblResultPl2, editDiceCount)

            if(pl1 > pl2){
                lblWinResult.text =  "Uzvar pirmais!"
            }else if(pl2>pl1){
                lblWinResult.text =  "Uzvar otrais!"
            }else{
                lblWinResult.text = "Neizšķirts!"
            }

        }
    }





    fun sanatizeInputException(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)
        try{
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }catch(ex: Exception){
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()

        }

    }

    fun sanatizeInputLen(){
        val editFact = findViewById<EditText>(R.id.editFact)
        val lblResult = findViewById<TextView>(R.id.lblResult)

        if(editFact.text.toString().length > 0){
            var number = editFact.text.toString().toInt()
            lblResult.text = factorial(number).toString()
        }else{
            Toast.makeText(this@MainActivity, "Nepareiza ievade!",
                Toast.LENGTH_LONG).show()
        }
    }

    fun factorial(number: Int) : Int{

        var result: Int = 1

        for(i in 2..number){
//            result = result * i
            result *= i
        }

        return result
    }
}