package udemy.kotlindev.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//name the variables with the camel case not with the snake case it is more preferred
        val btnStart: Button = findViewById(R.id.btn_start)
        val  etName: EditText= findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()
            }else{
                //create an intent it says from which activity we want to move to which other activity
            val intent= Intent(this, QuizQuestionActivity::class.java)

                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent) // this by itself would move us over to the other screen, but it would not close to current screen.
finish()
            }
        }
    }
}