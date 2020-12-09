package lv.rensia.day11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var factorial: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = findViewById<Button>(R.id.btnCalcFactorial)
        var enteredMaxNumber = findViewById<EditText>(R.id.number2)
        var enteredMinNumber = findViewById<EditText>(R.id.number1)
        val lblResult = findViewById<TextView>(R.id.lblShowResult)


        calcListener(btnCalculate, enteredMinNumber, enteredMaxNumber, lblResult)




    }

    fun calcListener(btnCalculate: Button, enteredMinNumber: EditText, enteredMaxNumber: EditText, lblResult: TextView){


        btnCalculate.setOnClickListener {
            var minRange: Int
            var maxRange: Int

            if (enteredMinNumber.text.isNotEmpty()) {
                minRange = enteredMinNumber.text.toString().toInt()
            } else {
                minRange = 0
            }
            if (enteredMaxNumber.text.isNotEmpty()) {
                maxRange = enteredMaxNumber.text.toString().toInt()
            } else {
                maxRange = 10
            }

            if (minRange < 0 || maxRange > 10 || minRange > maxRange) {
                Toast.makeText(this, "Please enter a number in 0 - 10 range", Toast.LENGTH_SHORT).show()
            } else {
                var numberToCalculate = (minRange..maxRange).random()

                factorial(numberToCalculate)
                lblResult.text = factorial.toString()
                factorial = 1

            }
        }

    }

    fun factorial(numberToCalculate: Int) :Int{
        for(i in 1..numberToCalculate) {
            factorial *= i
        }
        return factorial

    }

}