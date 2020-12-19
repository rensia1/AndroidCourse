package lv.rensia.day15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gen = NumberGen()

        var btnDemo = findViewById<Button>(R.id.btnDemo)
        btnDemo.setOnClickListener{
            val txt = gen.generate().toString()
            Toast.makeText(this, txt, Toast.LENGTH_SHORT ).show()

        }
    }
}