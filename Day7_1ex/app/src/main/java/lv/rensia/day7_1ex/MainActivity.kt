package lv.rensia.day7_1ex

import android.R.attr.button
import android.R.attr.fadingEdgeLength
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var redState = false
    var greenState = false
    var blueState = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)

        btnOne.setOnClickListener {
            redState = redState == false
            checkState(btnFour,redState,greenState,blueState)
        }

        btnTwo.setOnClickListener {
            greenState = greenState == false
            checkState(btnFour,redState,greenState,blueState)
        }

        btnThree.setOnClickListener {
            blueState = blueState == false
            checkState(btnFour,redState,greenState,blueState)
        }
    }

    private fun checkState(btnFour: Button, redState : Boolean, greenState: Boolean, blueState : Boolean) {
        if(redState && greenState && blueState){
            btnFour.setBackgroundColor(Color.WHITE)
        }
        else if(redState && greenState && !blueState){
            btnFour.setBackgroundColor(Color.YELLOW)
        }
        else if(redState && !greenState && blueState){
            btnFour.setBackgroundColor(Color.MAGENTA)
        }
        else if(!redState && greenState && blueState){
            btnFour.setBackgroundColor(Color.CYAN)
        }
        else if(redState && !greenState && !blueState){
            btnFour.setBackgroundColor(Color.RED)
        }
        else if(!redState && greenState && !blueState){
            btnFour.setBackgroundColor(Color.GREEN)
        }
        else if(!redState && !greenState && blueState){
            btnFour.setBackgroundColor(Color.BLUE)
        }
    }

}