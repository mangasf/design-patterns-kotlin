package creational.factoryMethod

import creational.factoryMethod.enums.Transport
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import java.time.temporal.ChronoUnit

internal class PlaneTest {

    private val testPlane: Plane = Plane(1, LocalDate.now(), Transport.AIR);

    @Test
    fun daysToNextTechnicalReview() {
        val expected = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusMonths(12)).toInt()
        assertEquals(expected, testPlane.daysToNextTechnicalReview());
    }

    @Test
    fun deliveryPlan() {
        val expected = "Transport: AIR";
        assertEquals(expected, testPlane.deliveryPlan());
    }
}