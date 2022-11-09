package creational.factoryMethod

import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import java.time.temporal.ChronoUnit

internal class TruckTest {

    private val testTruck: Truck = Truck(1, LocalDate.now(), Container.TANK, Transport.LAND);

    @Test
    fun daysToNextTechnicalReview() {
        val expected = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plusMonths(48)).toInt()
        assertEquals(expected, testTruck.daysToNextTechnicalReview());
    }

    @Test
    fun deliveryPlan() {
        val expected = "Container: TANK | Transport: LAND";
        assertEquals(expected, testTruck.deliveryPlan());
    }
}