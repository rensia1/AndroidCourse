package lv.rensia.day18_hw

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    var userList: MutableList<User> = mutableListOf()
    var json: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnShow = findViewById<Button>(R.id.btnShow)

        val etName = findViewById<EditText>(R.id.etName)
        val etSurname = findViewById<EditText>(R.id.etSurname)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val spinner = findViewById<Spinner>(R.id.spinner)




        btnSave.setOnClickListener {
            userList.add(
                User(
                    etName.text.toString(), etSurname.text.toString(), etUsername.text.toString(),
                    etEmail.text.toString(), spinner.selectedItem.toString()
                )
            )
            json = JsonParser.saveToJson(this, userList)
            Log.d("user: ", json)

        }

        btnShow.setOnClickListener {
            val activity2Intent = Intent(applicationContext, UserListActivity::class.java)
            startActivity(activity2Intent)

        }


        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this,
            R.array.city_list, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner.adapter = adapter

    }


}