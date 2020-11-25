package lv.rensia.day4_variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber  = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        var result = findViewById<TextView>(R.id.lblShowResult)
        val btnCalculate = findViewById<Button>(R.id.btnSum)


        btnCalculate.setOnClickListener{
            result.text = (firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt() ).toString()
        }

        btnMinus.setOnClickListener{
            result.text = (firstNumber.text.toString().toInt() - secondNumber.text.toString().toInt() ).toString()
        }

        btnMultiply.setOnClickListener{
            result.text = (firstNumber.text.toString().toInt() * secondNumber.text.toString().toInt() ).toString()
        }

        btnDivide.setOnClickListener{
            result.text = (firstNumber.text.toString().toDouble() / secondNumber.text.toString().toDouble() ).toString()
        }


    }
}