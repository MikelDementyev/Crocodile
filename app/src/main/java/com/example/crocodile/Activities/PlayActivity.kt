package com.example.crocodile.Activities

import android.animation.Animator
import android.annotation.SuppressLint
import com.example.crocodile.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.crocodile.Listeners.OnSwipeTouchListener

class PlayActivity : AppCompatActivity() {

    private lateinit var firstCard: CardView
    private lateinit var secondCard: CardView
    private lateinit var thirdCard: CardView
    private lateinit var fourthCard: CardView
    private lateinit var fifthCard: CardView

    private lateinit var cardsArray: Array<CardView>
    private lateinit var scoreLabel: TextView

    private var score = 0

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val parentLinear: LinearLayout = findViewById(R.id.parentLinear)
        scoreLabel = findViewById(R.id.score_team)

        firstCard = findViewById(R.id.card)
        firstCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, firstCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, firstCard, true)
            }
        })

        secondCard = findViewById(R.id.cardSecond)
        secondCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, secondCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, secondCard, true)
            }
        })

        thirdCard = findViewById(R.id.cardThird)
        thirdCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, thirdCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, thirdCard, true)
            }
        })

        fourthCard = findViewById(R.id.cardFourth)
        fourthCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, fourthCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, fourthCard, true)
            }
        })

        fifthCard = findViewById(R.id.cardFifth)
        fifthCard.setOnTouchListener(object: OnSwipeTouchListener(this) {
            override fun onSwipeLeft() {
                animateSwipe(parentLinear, fifthCard, false)
            }
            override fun onSwipeRight() {
                animateSwipe(parentLinear, fifthCard, true)
            }
        })

        cardsArray = arrayOf(firstCard, secondCard, thirdCard, fourthCard, fifthCard)
    }

    fun animateSwipe(parentView: LinearLayout, view: CardView, isRight: Boolean) {
        view.visibility = View.VISIBLE
        view.alpha = 1.0f

        score += if(isRight) -1 else 1

        scoreLabel.text = "$score очков"

        val xOffset = (parentView.width / 2).toFloat()
        view.animate()
            .translationX(if(isRight) xOffset else -xOffset)
            .alpha(0.0f)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationEnd(animation: Animator) {
                    if (firstCard.alpha == 0.0f
                            && secondCard.alpha == 0.0f
                            && thirdCard.alpha == 0.0f
                            && fourthCard.alpha == 0.0f
                            && fifthCard.alpha == 0.0f) {
                        for (card in cardsArray) {
                            animateSwipeBack(card)
                        }
                    }
                }
                override fun onAnimationRepeat(animation: Animator?) {}
                override fun onAnimationCancel(animation: Animator?) {}
                override fun onAnimationStart(animation: Animator?) {}
            })
    }

    fun animateSwipeBack(view: CardView) {
        view.visibility = View.VISIBLE
        view.alpha = 0.0f

        view.animate()
                .translationX(0.0f)
                .alpha(1.0f)
                .setListener(null)
    }
}