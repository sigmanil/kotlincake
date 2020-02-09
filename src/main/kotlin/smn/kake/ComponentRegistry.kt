package smn.kake

interface ComponentRegistry: CarServiceComponent, CarRepositoryComponent, CyclicServiceComponent

class ProductionRegistry: ComponentRegistry {
    override val carRepository = CarRepositoryImpl(this)
    override val carService = CarServiceImpl(this)
    override val cyclicService = CyclicServiceImpl(this)
}