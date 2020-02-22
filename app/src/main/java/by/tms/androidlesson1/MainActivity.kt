package by.tms.androidlesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnLesson1Click(view: View) {
        val intent = Intent(this, Lesson1Activity::class.java)
        startActivity(intent)
    }
}
