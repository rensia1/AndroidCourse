package lv.rensia.day5_md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber).text.toString().toInt()
        val secondNumber = findViewById<EditText>(R.id.secondNumber).text.toString().toInt()
        val btnCompare = findViewById<Button>(R.id.btnCompare)

        btnCompare.setOnClickListener{

            if(firstNumber > secondNumber){
                Toast.makeText(this@MainActivity, "firstNumber is bigger", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity, "Nav lielakas par 8", Toast.LENGTH_LONG).show()
            }




        }
    }
}