package com.example.calculator_one

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivision : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets*/


            btnAdd = findViewById(R.id.btn_add)
            btnSub = findViewById(R.id.btn_sub)
            btnMultiply = findViewById(R.id.btn_multiply)
            btnDivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_firstnumber)
        etB = findViewById(R.id.et_secondnumber)
        resultTv = findViewById(R.id.results)


        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        var firstnumber = etA.text.toString().toDouble()
        var secondnumber = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = firstnumber+secondnumber
            }
            R.id.btn_sub ->{
                result = firstnumber-secondnumber
            }
            R.id.btn_multiply->{
                result = firstnumber*secondnumber
            }
            R.id.btn_division->{
                result = firstnumber/secondnumber
            }
        }
        resultTv.text = "Result is $result"
    }
    }

