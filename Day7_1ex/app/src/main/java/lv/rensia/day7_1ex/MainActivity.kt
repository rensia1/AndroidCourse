package lv.rensia.day7_1ex

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)

        changeColor(btnOne, btnFour)
        changeColor(btnTwo, btnFour)
        changeColor(btnThree, btnFour)
    }

     private fun changeColor(clickedBtn: Button, btnToChange :Button) {
        clickedBtn.setOnClickListener {
            if (clickedBtn.text == "1") {
                btnToChange.setBackgroundColor(Color.RED)
            } else if (clickedBtn.text == "2"){
                btnToChange.setBackgroundColor(Color.GREEN)
            } else if(clickedBtn.text == "3") {
                btnToChange.setBackgroundColor(Color.BLUE)
            }
        }


    }
}