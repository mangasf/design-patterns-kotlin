package creational.factoryMethod.factory

import creational.factoryMethod.Ship
import creational.factoryMethod.enums.Container
import java.time.LocalDate

class ShipFactory(
    var id: Int,
    var last_review: LocalDate,
    var container_type: Container,
) : VehicleFactory {

    override fun createVehicle(): Vehicle {
        return Ship(id, last_review, container_type);
    }
}