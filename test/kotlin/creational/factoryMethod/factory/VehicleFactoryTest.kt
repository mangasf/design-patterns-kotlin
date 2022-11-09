package creational.factoryMethod.factory

import creational.factoryMethod.Plane
import creational.factoryMethod.Ship
import creational.factoryMethod.Truck
import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

internal class VehicleFactoryTest {

    @Test
    fun createPlane() {
        var planeFactory = PlaneFactory(1, LocalDate.now(), Transport.AIR);
        var plane = planeFactory.createVehicle();

        assertInstanceOf(Plane::class.java, plane);
    }

    @Test
    fun createShip() {
        var shipFactory = ShipFactory(1, LocalDate.now(), Container.FLAT_RACK);
        var ship = shipFactory.createVehicle();

        assertInstanceOf(Ship::class.java, ship);
    }

    @Test
    fun createTruck() {
        var truckFactory = TruckFactory(1, LocalDate.now(), Container.TANK, Transport.AIR);
        var truck = truckFactory.createVehicle();

        assertInstanceOf(Truck::class.java, truck);
    }
}