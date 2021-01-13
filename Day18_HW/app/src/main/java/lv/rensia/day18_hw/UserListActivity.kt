package lv.rensia.day18_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class UserListActivity : AppCompatActivity() {

    var json: String = ""
    var stringTemp = "User List: \n\n"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        var textView = findViewById<TextView>(R.id.textView)

        val fromString = JsonParser.getArr(this)
        var i = 1

        for(el in fromString){
            var user = User(el.name, el.surname, el.username, el.email, el.city)
            stringTemp += "User $i\n$user\n\n"
            i++
        }

        textView.text = stringTemp


    }
}