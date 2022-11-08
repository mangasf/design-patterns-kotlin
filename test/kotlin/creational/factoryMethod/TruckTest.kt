package creational.factoryMethod

import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

internal class TruckTest {

    private val testTruck: Truck = Truck(1, LocalDate.now(), Container.TANK, Transport.LAND);

    @org.junit.jupiter.api.Test
    fun getDeliveryPlan() {
        val expected = "Container: TANK | Transport: LAND";
        assertEquals(expected, testTruck.deliveryPlan());
    }
}