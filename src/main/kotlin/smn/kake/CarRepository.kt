package smn.kake

import java.util.*

interface CarRepositoryComponent {
    val carRepository: CarRepository
}

class CarRepositoryImpl(val registry: ComponentRegistry): CarRepository {
    override fun saveCar(car: Car): String {
        val idForNewCar = UUID.randomUUID().toString()

        //TODO: Save car to db or something

        return idForNewCar
    }
}

interface CarRepository {
    fun saveCar(car: Car): String
}