package com.kassim.constraintlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.Placeholder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun swapView(view : View){
        TransitionManager.beginDelayedTransition(main_layout)
        place_holder.setContentId(view.id)
    }
}
