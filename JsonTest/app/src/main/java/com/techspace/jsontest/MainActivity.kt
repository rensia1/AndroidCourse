package com.techspace.jsontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    var userList: MutableList<User> = mutableListOf()
    var json: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSave = findViewById<Button>(R.id.btnSave)
        val editName = findViewById<EditText>(R.id.editName)
        val editUser = findViewById<EditText>(R.id.editLogin)

        val btnRead = findViewById<Button>(R.id.btnRead)

        btnSave.setOnClickListener{
            userList.add(User(editName.text.toString(),editUser.text.toString()))
            json = JsonParser.saveToJson(userList)
            Log.d("user: ", json)
        }

        btnRead.setOnClickListener{
            val fromString = JsonParser.getArr(json)

            for(el in fromString){
                Log.d("USER: ", el.name)
            }
        }
    }
}