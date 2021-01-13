package lv.rensia.day18_hw

import android.content.Context
import com.google.gson.Gson
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter

object JsonParser {

    fun saveToJson(context: Context, userList:  MutableList<User>): String{
        val json = Gson().toJson(userList)
        saveFile(context, json)
        return json
    }

    fun getArr(context: Context): MutableList<User>{
        val json = getJson(context)
        return Gson().fromJson(json, Array<User>::class.java).toMutableList()
    }

    private fun saveFile(context: Context, json: String){
        val file = File(context.filesDir, "userData")
        val fileWriter = FileWriter(file)

        val bufferedWriter = BufferedWriter(fileWriter)
        bufferedWriter.write(json)
        bufferedWriter.close()
    }

    private fun getJson(context: Context): String{
        return try{
            val file = File(context.filesDir, "userData")
            val reader = FileReader(file)
            reader.readText()
        }catch(e: Exception){
            "null"
        }
    }

}