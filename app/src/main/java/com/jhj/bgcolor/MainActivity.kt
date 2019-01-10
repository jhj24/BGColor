package com.jhj.bgcolor

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jhj.selector.BGSelector
import com.jhj.selector.TCSelector
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.background = BGSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt())
        textView1.setOnClickListener {
        }

        textView2.background = BGSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 10f)
        textView2.setOnClickListener {
        }

        textView3.background = BGSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 20f, 3, 0xff999999.toInt())
        textView3.setTextColor(TCSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView3.setOnClickListener {
        }

        textView4.background = BGSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 10f, 0f, 0f, 10f,
                3, 0xff999999.toInt(), true, true, true, true)
        textView4.setTextColor(TCSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView4.setOnClickListener {
        }

        textView5.background = BGSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 0f, 10f, 10f, 0f,
                3, 0xff999999.toInt(), false, true, true, true)
        textView5.setTextColor(TCSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView5.setOnClickListener {
        }


        textView6.background = BGSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt())
        textView6.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView7.background = BGSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 10f)
        textView7.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView8.background = BGSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 20f, 3, 0xff999999.toInt())
        textView8.setTextColor(TCSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView8.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView9.background = BGSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 10f, 0f, 0f, 10f,
                3, 0xff999999.toInt(), true, true, true, true)
        textView9.setTextColor(TCSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView9.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView10.background = BGSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 0f, 10f, 10f, 0f,
                3, 0xff999999.toInt(), false, true, true, true)
        textView10.setTextColor(TCSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView10.setOnClickListener {
            it.isSelected = !it.isSelected
        }

    }
}
