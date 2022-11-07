package creational.factoryMethod

import java.util.Date

class Truck(
    var id: Int,
    var last_review: Date,
    var container_type: Container,
    var transport: Transport
) {

    fun getDeliveryPlan(): String {
        return "Container: $container_type | Transport: $transport";
    }
}