package com.techspace.day11_md

import android.widget.EditText
import android.widget.TextView

class Results {

    fun getResult(lbl: TextView, editDiceCount: EditText): Int{


        var result = 0

        if(editDiceCount.toString().length > 0){

            var diceCount = editDiceCount.text.toString().toInt()
            val gen = NumberGen()


            if(diceCount > 0){
                var diceValues = ""

                for(i in 1..diceCount){
                    var randomNumber = gen.throwDice()
                    result += randomNumber

                    if(diceValues!="")
                        diceValues = "$diceValues, $randomNumber"
                    else
                        diceValues = "$randomNumber"
                }

                lbl.text = diceValues
            }

        }

        return result //seit vajag atgriezt skaitlu summu- so rindinu ir jamaina obligati
        //jaatgriez masiva garums
    }
}