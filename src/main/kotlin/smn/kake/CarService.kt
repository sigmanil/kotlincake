package smn.kake

interface CarServiceComponent: CarRepositoryComponent {
    val carService: CarService
}

class CarServiceImpl(val registry: CarServiceComponent): CarService {
    override fun registerCar(name: String): Car {
        val car = Car(name)
        registry.carRepository.saveCar(car)
        return car
    }
}

interface CarService {
    fun registerCar(name: String): Car
}