package com.example.lesson1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var previous: Button
    private lateinit var add: Button
    private lateinit var next: Button
    private lateinit var remove: Button
    private lateinit var showTextView: TextView
    private lateinit var orderTextView: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val sobranie = CasualCigarettes("Sobranie", 3.70, 6, false, 20)
        val parlament = CasualCigarettes("Parlament", 3.50, 4, true, 20)
        val glo = HeatingSystem("Glo", 50.0, 6, 1, "White", 4)
        val iqos = HeatingSystem("IQOS", 250.0, 5, 3, "Black", 2)
        val ijust = Vape("Ijust", 100.0, 12, 3, "Silver", 100)
        var list: ArrayList<Cigarettes> = arrayListOf(sobranie, parlament, glo, iqos, ijust)

        previous = findViewById(R.id.previousButton)
        add = findViewById(R.id.addButton)
        next = findViewById(R.id.nextButton)
        showTextView = findViewById(R.id.showTextView)
        remove = findViewById(R.id.removeButton)
        orderTextView = findViewById(R.id.orderTextView)
        showTextView.text = list[counter].getString()


        if (this::previous.isInitialized) {
            previous.setOnClickListener {
                when (counter) {
                    0 -> counter = list.size - 1
                    else -> counter--
                }
                showTextView.text = list[counter].getString()
            }
        }
        if (this::add.isInitialized) {
            add.setOnClickListener {
                OrderSingleton.order.add(list[counter])
                orderTextView.text = "You're order is ${OrderSingleton.order}"
            }
        }
        if (this::next.isInitialized) {
            next.setOnClickListener {
                when (counter) {
                    list.size - 1 -> counter = 0
                    else -> counter++
                }
                showTextView.text = list[counter].getString()
            }
        }
        if (this::remove.isInitialized) {
            remove.setOnClickListener {
                OrderSingleton.order.remove(list[counter])
                orderTextView.text = "You're order is ${OrderSingleton.order}"
            }
        }
    }
}