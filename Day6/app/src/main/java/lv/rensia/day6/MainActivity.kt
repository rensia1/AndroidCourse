package lv.rensia.day6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnGuess = findViewById<Button>(R.id.btnGuess)
        //val stringToGuess = "Programmetajs"
        var guessCount = 0




        btnGuess.setOnClickListener{
            guessCount ++
            val stringToGuess = findViewById<EditText>(R.id.wordToGuess).text.toString()
            val word = findViewById<EditText>(R.id.guessedWord).text.toString()



            if(stringToGuess != word  && guessCount == 5) {
                Toast.makeText(this,"Sorry, you lost ):", Toast.LENGTH_SHORT).show()
                guessCount = 0
            } else if(stringToGuess.toLowerCase() == word.toLowerCase()) {
                Toast.makeText(this,"Yay, you won :)", Toast.LENGTH_SHORT).show()
                guessCount = 0
            }



        }


    }
}