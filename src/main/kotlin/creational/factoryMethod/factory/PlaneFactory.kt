package creational.factoryMethod.factory

import creational.factoryMethod.Plane
import creational.factoryMethod.enums.Transport
import java.time.LocalDate

class PlaneFactory(
    var id: Int,
    var last_review: LocalDate,
    var transport: Transport,
) : VehicleFactory {

    override fun createVehicle(): Vehicle {
        return Plane(id, last_review, transport);
    }
}