package com.example.lesson1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson1.classes.CasualCigarettes
import com.example.lesson1.classes.Cigarettes
import com.example.lesson1.classes.HeatingSystem
import com.example.lesson1.classes.Vape
import com.example.lesson1.src.Catalog
import com.example.lesson1.src.OrderSingleton


class MainActivity : AppCompatActivity() {
    private lateinit var add: Button
    private lateinit var remove: Button
    private lateinit var showTextView: TextView
    private lateinit var orderTextView: TextView
    private lateinit var catalogView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var counter = 0
        val sobranie = CasualCigarettes("Sobranie", 3.70, 6, false, 20)
        val parlament = CasualCigarettes("Parlament", 3.50, 4, true, 20)
        val glo = HeatingSystem("Glo", 50.0, 6, 1, "White", 4)
        val iqos = HeatingSystem("IQOS", 250.0, 5, 3, "Black", 2)
        val ijust = Vape("Ijust", 100.0, 12, 3, "Silver", 100)
        var list = Catalog<Cigarettes>(arrayListOf(sobranie, parlament, glo, iqos, ijust))


        add = findViewById(R.id.addButton)
        showTextView = findViewById(R.id.showTextView)
        remove = findViewById(R.id.removeButton)
        orderTextView = findViewById(R.id.orderTextView)
        catalogView = findViewById(R.id.catalogView)
        showTextView.text = list.catalog[0].getString() //counter
        var temp = ""
        list.catalog.forEach{ temp += it.name + "\n" }
        catalogView.text = temp

        if (this::add.isInitialized) {
            add.setOnClickListener {
                OrderSingleton.order.add(list.catalog[0])
                orderTextView.text = "You're order is "+ OrderSingleton.getName()
            }
        }

        if (this::remove.isInitialized) {
            remove.setOnClickListener {
                val size = OrderSingleton.order.size
                if(size != 0)
                OrderSingleton.order.removeAt(size - 1)
                orderTextView.text = "You're order is " + OrderSingleton.getName()
            }
        }
    }
}