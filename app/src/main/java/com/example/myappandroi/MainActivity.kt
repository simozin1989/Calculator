package com.example.myappandroi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var isNewOp = true
    var oldNumber = ""
    var buOp = "+"

    fun buttonEvent(view: android.view.View) {
        if (isNewOp) {
            textTv.text = ""
        }
        isNewOp = false
        var tvTextShow: String = textTv.text.toString()
        val butSelect = view as Button
        when (butSelect.id) {
            button0.id -> {
                tvTextShow += "0"
            }
            button1.id -> {
                tvTextShow += "1"
            }
            but2.id -> {
                tvTextShow += "2"
            }
            but3.id -> {
                tvTextShow += "3"
            }
            button4.id -> {
                tvTextShow += "4"
            }
            button5.id -> {
                tvTextShow += "5"
            }
            button6.id -> {
                tvTextShow += "6"
            }
            button7.id -> {
                tvTextShow += "7"
            }
            button8.id -> {
                tvTextShow += "8"
            }
            button9.id -> {
                tvTextShow += "9"
            }
            butprsontPlas.id -> {
                tvTextShow = "-" + tvTextShow
            }
            buttonpoint.id -> {
                tvTextShow += "."
            }
        }
        textTv.text = tvTextShow

    }


    fun butOpEvent(view: android.view.View) {
        oldNumber = textTv.text.toString()
        isNewOp = true
        val butSelect = view as Button
        when (butSelect.id) {
            buttonslash.id -> {
                buOp = "/"
            }
            buttonmultplay.id -> {
                buOp = "*"
            }
            buttonminas.id -> {
                buOp = "-"
            }
            buttonplas.id -> {
                buOp = "+"
            }
        }

    }

    fun buEqualEvent(view: android.view.View) {
        val newNumber = textTv.text.toString()
        var finalNumber: Double? = null
        when (buOp) {
            "/" -> {
                finalNumber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "*" -> {
                finalNumber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "-" -> {
                finalNumber = oldNumber.toDouble() - newNumber.toDouble()
            }
            "+" -> {
                finalNumber = oldNumber.toDouble() + newNumber.toDouble()
            }
        }
        textTv.text = finalNumber.toString()
        isNewOp = true
    }

    fun butClean(view: android.view.View) {
        isNewOp = true
        textTv.text = "0"
    }
}