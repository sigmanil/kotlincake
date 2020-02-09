package smn.kake

interface CarServiceComponent {
    val carService: CarService
}

class CarServiceImpl(val registry: ComponentRegistry): CarService {
    override fun registerCar(name: String): Car {
        val car = Car(name)
        registry.carRepository.saveCar(car)
        return car
    }

    override fun needCyclic() {
        registry.cyclicService.beCyclic()
    }
}

interface CarService {
    fun registerCar(name: String): Car
    fun needCyclic()
}