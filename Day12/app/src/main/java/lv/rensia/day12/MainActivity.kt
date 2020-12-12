package lv.rensia.day12

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

        val btnThrow = findViewById<Button>(R.id.btnThrow)
        val editDiceCount = findViewById<EditText>(R.id.editDiceCount)
        val lblResult2 = findViewById<TextView>(R.id.lblResultPlayer2)
        val lblResult1 = findViewById<TextView>(R.id.lblResultPlayer1)


        btnThrow.setOnClickListener{

            var player1Sum = setResult(editDiceCount, lblResult1)
            var player2Sum = setResult(editDiceCount, lblResult2)

            showResult(player1Sum, player2Sum)


        }
    }

    fun showResult(player1Sum: Int, player2Sum: Int){
        val lblSum = findViewById<TextView>(R.id.lblSum)
        lblSum.text = "Player 1 = " + player1Sum + "\nPlayer 2 = " + player2Sum
        if(player1Sum > player2Sum) {
            Toast.makeText(this, "Player 1 won", Toast.LENGTH_SHORT ).show()
        } else if(player1Sum == player2Sum) {
            Toast.makeText(this, "TIE", Toast.LENGTH_SHORT ).show()
        } else {
            Toast.makeText(this, "Player 2 won", Toast.LENGTH_SHORT ).show()
        }
    }



    fun throwDice(): Int{
        return (1..6).random()
    }


    fun setResult(editDiceCount: EditText, lblResult: TextView) :Int{
        var sum: Int = 0
        if(editDiceCount.toString().length > 0){
            var diceCount = editDiceCount.text.toString().toInt()

            if(diceCount > 0){
                var diceValues = " "

                for(i in 1..diceCount){
                    var randomNumber = throwDice()
                    diceValues = diceValues + " " + randomNumber
                    sum += randomNumber
                }
                lblResult.text = diceValues
            }


        }
        return sum
    }




}