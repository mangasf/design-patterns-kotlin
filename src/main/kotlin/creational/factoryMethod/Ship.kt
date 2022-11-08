package creational.factoryMethod

import creational.factoryMethod.enums.Container
import creational.factoryMethod.factory.Vehicle
import java.time.Duration
import java.time.LocalDate

class Ship(
    var id: Int,
    var last_review: LocalDate,
    var container_type: Container,
) : Vehicle {

    override fun daysToNextTechnicalReview(): String {
        return Duration.between(last_review.plusMonths(24), last_review).toString()
    }

    override fun deliveryPlan(): String {
        return "Container: $container_type";
    }
}