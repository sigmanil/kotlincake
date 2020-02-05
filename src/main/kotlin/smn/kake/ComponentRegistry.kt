package smn.kake

interface ComponentRegistry: PlantServiceComponent, PlantRepositoryComponent

class ProductionRegistry: ComponentRegistry {
    override val plantRepository = PlantRepositoryImpl(this)
    override val plantService = PlantServiceImpl(this)
}