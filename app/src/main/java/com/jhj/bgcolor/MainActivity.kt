package com.jhj.bgcolor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.background = com.jhj.selector.BGSelector.pressed(0xffff1111.toInt(), 0xffe1e1e1.toInt(),10f)
        textView1.setTextColor(com.jhj.selector.TCSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))

        textView1.setOnClickListener {

        }

    }
}
