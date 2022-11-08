package creational.factoryMethod.factory

import creational.factoryMethod.Truck
import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import java.time.LocalDate

class TruckFactory(
    var id: Int,
    var last_review: LocalDate,
    var container_type: Container,
    var transport: Transport
) : VehicleFactory {

    override fun createVehicle(): Vehicle {
        return Truck(id, last_review, container_type, transport);
    }
}