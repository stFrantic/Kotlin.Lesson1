package com.example.lesson1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson1.src.Character
import fibonacci

class MainActivity : AppCompatActivity() {
    private lateinit var submit: Button
    private lateinit var count: Button
    private lateinit var generate: Button

    private lateinit var answer: TextView
    private lateinit var taps: TextView
    private lateinit var data: TextView



    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit = findViewById(R.id.button)
        answer = findViewById(R.id.textView)

        count = findViewById(R.id.button2)
        taps = findViewById(R.id.textView2)

        generate = findViewById(R.id.generate)
        data = findViewById(R.id.textView3)
        if (this::submit.isInitialized) {
            submit.setOnClickListener {
                editText = findViewById(R.id.editText1)
                val number = Integer.parseInt((editText.text).toString())
                if (number > 0) {
                    //var result = IntArray(number + 1)
                    // for (i in 0 until number + 1) result[i] = fibonacci(i)
                    //answer.text = "answer is ${result.contentToString()}"
                    answer.text = "Answer is ${fibonacci(number + 1).contentToString()}"
                } else answer.text =
                    "Number must be more then 0, and less then ${Int.MAX_VALUE - 1}"

            }
        }
        if (this::count.isInitialized) {
            var counter: Int = 0;
            count.setOnClickListener {
                taps.text = "Amount of taps: ${++counter}"
            }
        }
        if (this::generate.isInitialized) {
            generate.setOnClickListener {
                var ch = Character()
                ch.createHero()
                data.text = ch.toString()
            }
        }

    }
}