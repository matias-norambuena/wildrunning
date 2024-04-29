package com.matiasdev.wildrunning

import android.animation.ObjectAnimator
import android.view.View
import android.widget.LinearLayout

object Utility {

    fun setHeightLinearLayout(ly: LinearLayout, value: Int){
        val params: LinearLayout.LayoutParams = ly.layoutParams as LinearLayout.LayoutParams
        params.height = value
        ly.layoutParams = params
    }

    fun animateViewofInt(v: View, attr: String, value: Int, time: Long){
        ObjectAnimator.ofInt(v, attr, value).apply {
            duration = 500
            start()
        }
    }

    fun animateViewofFloat(v: View, attr: String, value: Float, time: Long){
        ObjectAnimator.ofFloat(v, attr, value).apply {
            duration = 500
            start()
        }
    }
}