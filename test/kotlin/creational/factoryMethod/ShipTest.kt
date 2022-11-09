package creational.factoryMethod

import creational.factoryMethod.enums.Container
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import java.time.temporal.ChronoUnit

internal class ShipTest {

    private val testShip: Ship = Ship(1, LocalDate.now(), Container.REEFER);

    @Test
    fun daysToNextTechnicalReview() {
        val expected = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusMonths(24)).toInt()
        assertEquals(expected, testShip.daysToNextTechnicalReview());
    }

    @Test
    fun deliveryPlan() {
        val expected = "Container: REEFER";
        assertEquals(expected, testShip.deliveryPlan());
    }
}