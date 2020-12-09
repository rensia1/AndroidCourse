package lv.rensia.day11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = findViewById<Button>(R.id.btnCalcFactorial)
        var enteredNumber = findViewById<EditText>(R.id.editTextNumber)
        val lblResult = findViewById<TextView>(R.id.lblShowResult)

        var factorial: Int = 1
        btnCalculate.setOnClickListener {
            for(i in 1..enteredNumber.text.toString().toInt()) {
                factorial *= i
            }
            lblResult.text = factorial.toString()
            factorial = 1

        }
    }
}