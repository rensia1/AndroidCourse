package com.techspace.jsontest

import android.content.Context
import com.google.gson.Gson
import java.lang.reflect.Type

object JsonParser {

    fun saveToJson(userList:  MutableList<User>): String{
        val json = Gson().toJson(userList)
        return json
    }

    fun getArr(json: String): List<User> {
        return Gson().fromJson(json, Array<User>::class.java).toList()
    }

}