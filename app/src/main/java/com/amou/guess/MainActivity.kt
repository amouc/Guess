package com.amou.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","secret:${secretNumber.secret}")

    }

    fun check(view : View){
        val number = ed_number.text.toString().toInt()
        println("number:$number")
        Log.d("MainActivity","number:$number")
        val diff = secretNumber.validate(number)
        var message = "你猜對了!秘密數字就是:${secretNumber.secret}"
        if (diff>0){
            message = "請猜小一點"
        }else if(diff<0){
            message = "請猜大一點"
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("Guess")
            .setMessage(message)
            .setPositiveButton("OK",null)
            .show()
    }
}

