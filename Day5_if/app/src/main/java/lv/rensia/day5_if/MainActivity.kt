package lv.rensia.day5_if

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var previousValue :String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val btnShowCurrent = findViewById<Button>(R.id.btnShowCurrent)
        val btnShowPrevious = findViewById<Button>(R.id.btnShowPrevious)

        var currentValue: String

        previousValue = editText.text.toString()

        btnShowCurrent.setOnClickListener {
            currentValue = editText.text.toString()
            Toast.makeText(this, currentValue, Toast.LENGTH_SHORT).show()

        }
        btnShowPrevious.setOnClickListener {

            Toast.makeText(this, previousValue.reversed(), Toast.LENGTH_SHORT).show()


        }
    }
}