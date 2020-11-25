package lv.rensia.ticktacktoe

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var player = 1

    val buttonIdList = listOf(
        R.id.btnGrid1,
        R.id.btnGrid2,
        R.id.btnGrid3,
        R.id.btnGrid4,
        R.id.btnGrid5,
        R.id.btnGrid6,
        R.id.btnGrid7,
        R.id.btnGrid8,
        R.id.btnGrid9,
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeButtonTextTo()

    }

    fun changeButtonTextTo(){
        for (id in buttonIdList) {
            val button = findViewById<View>(id) as Button
                button.setOnClickListener{
                    if(button.text == "-") {
                        if (player == 1) {
                            button.text = "X"
                            player = 2
                        } else {
                            button.text = "O"
                            player = 1
                        }
                    }
                }

            }

    }
}