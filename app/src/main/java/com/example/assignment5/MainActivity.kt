package com.example.assignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button7.setOnClickListener {
            if (textView3.text == "0" || textView3.text.length.toString() == "1") {
                textView3.setText("0")
            } else {
                textView3.setText(textView3.text.toString().dropLast(1))
            }
        }

        button6.setOnClickListener {
            textView3.setText("0")
        }
        button10.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "7")
            } else {
                textView3.setText(textView3.text.toString() + "7")
            }
        }
        button11.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "8")
            } else {
                textView3.setText(textView3.text.toString() + "8")
            }
        }
        button12.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "9")
            } else {
                textView3.setText(textView3.text.toString() + "9")
            }
        }
        button14.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "4")
            } else {
                textView3.setText(textView3.text.toString() + "4")
            }
        }
        button15.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "5")
            } else {
                textView3.setText(textView3.text.toString() + "5")
            }
        }
        button16.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "6")
            } else {
                textView3.setText(textView3.text.toString() + "6")
            }
        }
        button18.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "1")
            } else {
                textView3.setText(textView3.text.toString() + "1")
            }
        }
        button19.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "2")
            } else {
                textView3.setText(textView3.text.toString() + "2")
            }
        }
        button20.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("")
                textView3.setText(textView3.text.toString() + "3")
            } else {
                textView3.setText(textView3.text.toString() + "3")
            }
        }
        button22.setOnClickListener {
            if (textView3.text == "0") {
                textView3.setText("0")
            } else {
                textView3.setText(textView3.text.toString() + "0")
            }
        }

    }
}