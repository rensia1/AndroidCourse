package lv.rensia.day7

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTest = findViewById<Button>(R.id.btnTest)
        setListener(btnTest)
        btnTest.setBackgroundColor(Color.RED)
    }

    private fun setListener(btn: Button) {
        val editPsw = findViewById<EditText>(R.id.editPsw)
        btn.setOnClickListener {
            if(validateString(editPsw.text.toString()) == true) {
                customToast("Success")
            }else {
                customToast("Too few")
            }
        }

    }

    private fun validateString(psw: String): Boolean{
        return psw.length >= 8
    }

    fun customToast(text :String) {
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
    }
}