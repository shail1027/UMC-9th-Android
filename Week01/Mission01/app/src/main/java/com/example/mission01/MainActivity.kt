package com.example.mission01

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViews: List<TextView>

    private fun setClick(img: ImageView, text: TextView, message: String) {
        img.setOnClickListener {
            textViews.forEach { it.setTextColor(Color.BLACK) }
            text.setTextColor(Color.parseColor("red"))
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val happyText = findViewById<TextView>(R.id.tvHappy)
        val excitedText = findViewById<TextView>(R.id.tvExcited)
        val normalText = findViewById<TextView>(R.id.tvNormal)
        val anxiousText = findViewById<TextView>(R.id.tvAnxious)
        val angryText = findViewById<TextView>(R.id.tvAngry)

        textViews = listOf(happyText, excitedText, normalText, anxiousText, angryText)

        setClick(findViewById(R.id.imgHappy), happyText, "행복한 하루")
        setClick(findViewById(R.id.imgExcited), excitedText, "들뜬 하루")
        setClick(findViewById(R.id.imgNormal), normalText, "평범한 하루")
        setClick(findViewById(R.id.imgAnxious), anxiousText, "불안한 하루")
        setClick(findViewById(R.id.imgAngry), angryText, "화나는 하루")
    }
}
