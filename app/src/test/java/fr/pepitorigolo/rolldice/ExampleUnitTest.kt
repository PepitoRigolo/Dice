package fr.pepitorigolo.rolldice

import junit.framework.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice= Dice(6)
        val rollResult = dice.roll()
        assertTrue("Bien joué!",rollResult in 1..6)
    }
}