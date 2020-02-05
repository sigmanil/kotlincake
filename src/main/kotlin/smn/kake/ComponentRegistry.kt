package smn.kake

interface ComponentRegistry: CarServiceComponent, CarRepositoryComponent

class ProductionRegistry: ComponentRegistry {
    override val carRepository = CarRepositoryImpl(this)
    override val carService = CarServiceImpl(this)
}