package com.example.startanimationfromcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import com.example.startanimationfromcode.databinding.ActivityMainBinding

class MainActivity :
    AppCompatActivity(),
    View.OnClickListener {

    // Binding
    private lateinit var binding: ActivityMainBinding

    // Components UI
    private val motion: MotionLayout by lazy {
        binding.activityMainMotion
    }
    private val view: View by lazy {
        binding.view
    }

    // Transition Ids
    private val start_to_end = R.id.start_to_end

    // State Ids
    private val start = R.id.start
    private val end = R.id.end

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    // ==============================
    //    Init Listeners
    // ==============================
    private fun initListeners() {
        view.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // when use Pair<Int, Int> (v?.id, motion.currentState)
        when (v!!.id to motion.currentState) {
            view.id to start -> {
                Animator.animateToEnd(motion, start_to_end, 1000)
            }
            view.id to end -> {
                Animator.animateToStart(motion, start_to_end, 1000)
            }
        }
    }
}

