package creational.factoryMethod

import creational.factoryMethod.enums.Container
import creational.factoryMethod.enums.Transport
import creational.factoryMethod.factory.Vehicle
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Truck(
    var id: Int,
    var last_review: LocalDate,
    var container_type: Container,
    var transport: Transport
) : Vehicle {

    override fun daysToNextTechnicalReview(): Int {
        return ChronoUnit.DAYS.between(last_review, last_review.plusMonths(48)).toInt()
    }

    override fun deliveryPlan(): String {
        return "Container: $container_type | Transport: $transport";
    }
}