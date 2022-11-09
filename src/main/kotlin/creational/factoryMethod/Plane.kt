package creational.factoryMethod

import creational.factoryMethod.enums.Transport
import creational.factoryMethod.factory.Vehicle
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Plane(
    var id: Int,
    var last_review: LocalDate,
    var transport: Transport,
) : Vehicle {

    override fun daysToNextTechnicalReview(): Int {
        return ChronoUnit.DAYS.between(last_review, last_review.plusMonths(12)).toInt()    }

    override fun deliveryPlan(): String {
        return "Transport: $transport";
    }
}