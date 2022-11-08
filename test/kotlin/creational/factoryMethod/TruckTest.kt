package creational.factoryMethod

import org.junit.jupiter.api.Assertions.*
import java.time.Instant
import java.util.Date

internal class TruckTest {

    private val testTruck: Truck = Truck(1, Date.from(Instant.now()), Container.TANK, Transport.LAND);

    @org.junit.jupiter.api.Test
    fun getDeliveryPlan() {
        val expected = "Containe: TANK | Transport: LAND";
        assertEquals(expected, testTruck.getDeliveryPlan());
    }
}