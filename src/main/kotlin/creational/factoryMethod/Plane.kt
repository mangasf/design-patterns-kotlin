package creational.factoryMethod

import creational.factoryMethod.enums.Transport
import creational.factoryMethod.factory.Vehicle
import java.time.Duration
import java.time.LocalDate

class Plane(
    var id: Int,
    var last_review: LocalDate,
    var transport: Transport,
) : Vehicle {

    override fun daysToNextTechnicalReview(): String {
        return Duration.between(last_review.plusMonths(12), last_review).toString()

    }

    override fun deliveryPlan(): String {
        return "Transport: $transport";
    }
}