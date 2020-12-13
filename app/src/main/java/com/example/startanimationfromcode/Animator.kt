package com.example.startanimationfromcode

import androidx.constraintlayout.motion.widget.MotionLayout

object Animator {

    fun animateToEnd(motion: MotionLayout, transitionId: Int, duration: Int) {
        motion.apply {
            setTransition(transitionId)
            setTransitionDuration(duration)
            transitionToEnd()
        }
    }

    fun animateToStart(motion: MotionLayout, transitionId: Int, duration: Int) {
        motion.apply {
            setTransition(transitionId)
            setTransitionDuration(duration)
            transitionToStart()
        }
    }
}


