package com.jhj.bgcolor

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.jhj.selector.BackGroundSelector
import com.jhj.selector.TextColorSelector
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.background = BackGroundSelector.pressed(getTColor(R.color.yellow1), getTColor(R.color.yellow0))
        textView1.setOnClickListener {
        }

        textView2.background = BackGroundSelector.pressed(getTColor(R.color.blue1), getTColor(R.color.blue0), 10f)
        textView2.setOnClickListener {
        }

        textView3.background = BackGroundSelector.pressed(getTColor(R.color.red1), getTColor(R.color.red0), 20f, 3, 0xff999999.toInt())
        textView3.setTextColor(TextColorSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView3.setOnClickListener {
        }

        textView4.background = BackGroundSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 10f, 0f, 0f, 10f,
                3, 0xff999999.toInt(), true, true, true, true)
        textView4.setTextColor(TextColorSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView4.setOnClickListener {
        }

        textView5.background = BackGroundSelector.pressed(0xffff1111.toInt(), 0xffff5555.toInt(), 0f, 10f, 10f, 0f,
                3, 0xff999999.toInt(), false, true, true, true)
        textView5.setTextColor(TextColorSelector.pressed(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView5.setOnClickListener {
        }


        textView6.background = BackGroundSelector.selected(getTColor(R.color.yellow1), getTColor(R.color.yellow0))
        textView6.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView7.background = BackGroundSelector.selected(getTColor(R.color.blue1), getTColor(R.color.blue0), 10f)
        textView7.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView8.background = BackGroundSelector.selected(getTColor(R.color.red1), getTColor(R.color.red0), 20f, 3, 0xff999999.toInt())
        textView8.setTextColor(TextColorSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView8.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView9.background = BackGroundSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 10f, 0f, 0f, 10f,
                3, 0xff999999.toInt(), true, true, true, true)
        textView9.setTextColor(TextColorSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView9.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        textView10.background = BackGroundSelector.selected(0xffff1111.toInt(), 0xffff5555.toInt(), 0f, 10f, 10f, 0f,
                3, 0xff999999.toInt(), false, true, true, true)
        textView10.setTextColor(TextColorSelector.selected(0xffe1e1e1.toInt(), 0xff999999.toInt()))
        textView10.setOnClickListener {
            it.isSelected = !it.isSelected
        }

        imageView1.setImageDrawable(BackGroundSelector.pressed(ContextCompat.getDrawable(this, R.drawable.main_home1),
                ContextCompat.getDrawable(this, R.drawable.main_home0)))
        imageView1.setOnClickListener {

        }

        imageView2.background = BackGroundSelector.selected(ContextCompat.getDrawable(this, R.drawable.main_home1),
                ContextCompat.getDrawable(this, R.drawable.main_home0))
        imageView2.setOnClickListener {
            it.isSelected = !it.isSelected
        }

    }

    fun getTColor(color: Int): Int {
        return ContextCompat.getColor(this, color)
    }

}
