package creational.factoryMethod

import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import creational.factoryMethod.factory.Vehicle
import java.time.Duration
import java.time.LocalDate

class Truck(
    var id: Int,
    var last_review: LocalDate,
    var container_type: Container,
    var transport: Transport
) : Vehicle {

    override fun daysToNextTechnicalReview(): String {
        return Duration.between(last_review.plusMonths(48), last_review).toString()
    }

    override fun deliveryPlan(): String {
        return "Container: $container_type | Transport: $transport";
    }
}