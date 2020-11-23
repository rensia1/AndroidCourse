package lv.rensia.day1_basiclayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeName = findViewById<Button>(R.id.btnSubmit)
        val inputName = findViewById<EditText>(R.id.inputName)
        val city = findViewById<EditText>(R.id.city)


        btnChangeName.setOnClickListener{
            var name  = inputName.text
            var city = city.text
            Toast.makeText(this@MainActivity,  name.toString() + " lives in " + city, Toast.LENGTH_SHORT).show()
        }
    }
}