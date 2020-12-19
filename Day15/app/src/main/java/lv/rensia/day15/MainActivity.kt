package lv.rensia.day15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gen = NumberGen()
        //var btnDemo = findViewById<Button>(R.id.btnDemo)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnShow = findViewById<Button>(R.id.btnShow)
        val btnDelete = findViewById<Button>(R.id.btnDelete)




        var lst = mutableListOf<Student>()
        btnAdd.setOnClickListener {
            val etName = findViewById<EditText>(R.id.etName).text.toString()
            val etSurname = findViewById<EditText>(R.id.etSurname).text.toString()
            val etCourse = findViewById<EditText>(R.id.etCourse).text.toString().toInt()
            lst.add(Student(etName, etSurname, etCourse))


        }

        btnShow.setOnClickListener {
            val tvShowStudent = findViewById<TextView>(R.id.tvShowStudent)
            val index = findViewById<EditText>(R.id.etIndex).text.toString().toInt()

            if(index < lst.size ) {
                tvShowStudent.text = lst[index].name
            }else {
                Toast.makeText(this, "There are no elements with that index", Toast.LENGTH_SHORT).show()
            }

        }

        btnDelete.setOnClickListener {
            val index = findViewById<EditText>(R.id.etIndex).text.toString().toInt()
            if(index < lst.size) {
                lst.removeAt(index)
                Toast.makeText(this, "Removed", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No such element", Toast.LENGTH_SHORT).show()
            }
        }

//        btnDemo.setOnClickListener{
//            val txt = gen.generate().toString()
//            val student = Student("Juris", "Berzins", 1)
//            val student2 = Student("Anna", "Lapa", 1)
//            var lst = mutableListOf(student)
//            lst.add(student2)
//            student.name = "tttt"
//            Toast.makeText(this, lst[0].name, Toast.LENGTH_SHORT ).show()
//
//        }
    }
}