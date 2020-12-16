package lv.rensia.day14_2

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
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        var list = mutableListOf<Int>()

        btnAdd.setOnClickListener {
            val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            list.add(etFirstNumber)

        }

        btnShowResult.setOnClickListener {
            tvResult.text = list.toString()
        }

    }
}