package lv.rensia.day14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowResult = findViewById<Button>(R.id.btnShowResult)

        btnShowResult.setOnClickListener {
            val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
            val etThirdNumber = findViewById<EditText>(R.id.etThirdNumber).text.toString().toInt()
            val etFourthNumber = findViewById<EditText>(R.id.etFourthNumber).text.toString().toInt()
            val etFifthNumber = findViewById<EditText>(R.id.etFifthNumber).text.toString().toInt()

            var array  = arrayOf(etFirstNumber, etSecondNumber, etThirdNumber, etFourthNumber, etFifthNumber);

            val tvResult = findViewById<TextView>(R.id.tvResult)

            var result :Int = 0
            for(i in 0..array.size-1) {
                if(array[i] > result){
                    result = array[i]
                }
            }
            tvResult.text = result.toString()

        }
    }
}