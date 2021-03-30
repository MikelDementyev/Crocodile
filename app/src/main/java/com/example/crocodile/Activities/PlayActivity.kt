package com.example.crocodile.Activities

import android.annotation.SuppressLint
import com.example.crocodile.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class PlayActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val parentLinear: LinearLayout = findViewById(R.id.parentLinear)

        val firstCard: CardView = findViewById(R.id.card)
        firstCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, firstCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, firstCard, true)
            }
        })
    }

    fun animateSwipe(parentView: LinearLayout, view: CardView, isRight: Boolean) {
        view.visibility = View.VISIBLE
        view.alpha = 1.0f

        val xOffset = (parentView.width / 2).toFloat()
        view.animate()
            .translationX(if(isRight) xOffset else -xOffset)
            .alpha(0.0f)
            .setListener(null)
    }
}