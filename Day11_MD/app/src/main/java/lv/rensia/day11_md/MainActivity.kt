package lv.rensia.day11_md

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

        val btnThrowDice = findViewById<Button>(R.id.btnThrowDice)


        btnThrowDice.setOnClickListener {
            throwDice()
        }



    }

    private fun throwDice(){
        val lblDice = findViewById<TextView>(R.id.lblDice)
        lblDice.text = ""
        val diceCount = findViewById<EditText>(R.id.diceCount)
        var diceCountF : Int = 0

        if(diceCount.text.isEmpty()) {
            Toast.makeText(this, "can't be empty", Toast.LENGTH_SHORT).show()
        }else if(diceCount.text.toString().toInt() > 4) {
            Toast.makeText(this, "Please enter a value between 1 and 4", Toast.LENGTH_SHORT).show()
        } else {
            diceCountF = diceCount.text.toString().toInt()
            for (i in 1..diceCountF) {
                var diceResult: Int = (1..6).random()
                lblDice.text = lblDice.text.toString() + diceResult.toString() + " "
            }

        }


    }
}