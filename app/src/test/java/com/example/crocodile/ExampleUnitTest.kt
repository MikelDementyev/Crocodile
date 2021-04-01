package com.example.crocodile

import androidx.cardview.widget.CardView
import com.example.crocodile.Activities.PlayActivity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.manipulation.Ordering

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun timeFormat_isCorrect() {
        val time = PlayActivity().rightTimer(60000)
        assertEquals("01:60", time)
    }

    @Test
    fun scoreCalc() {
        assertEquals(4, PlayActivity().calcScore(true,5))
    }

    lateinit var instrumentationContext: Ordering.Context
    @Before
    fun setup() {
        instrumentationContext = InstrumentationRegistry.getInstrumentation().context
    }

    @Test
    fun ifCardsAreTransparent() {
        val firstCard = CardView(this)
        var secondCard: CardView
        var thirdCard: CardView
        lateinit var fourthCard: CardView
        lateinit var fifthCard: CardView

        firstCard.alpha = 0.0f
        secondCard.alpha = 0.0f
        thirdCard.alpha = 0.0f
        fourthCard.alpha = 0.0f
        fifthCard.alpha = 0.0f

        lateinit var cardsArray: Array<CardView>

        cardsArray = arrayOf(firstCard, secondCard, thirdCard, fourthCard, fifthCard)

        var bool: Boolean = PlayActivity().ifCardsAreTransparent(cardsArray)

        assertEquals(true, bool)
    }
}