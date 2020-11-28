package lv.rensia.day6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {

    var clickCountVar :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCount = findViewById<TextView>(R.id.lblCount)
        val btnPlus = findViewById<Button>(R.id.btnPlus)


        btnPlus.setOnClickListener{
            clickCountVar = clickCount.text.toString().toInt()
            clickCount.text = (clickCountVar + 1).toString()
        }


    }
}