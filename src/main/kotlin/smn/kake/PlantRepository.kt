package smn.kake

interface PlantRepositoryComponent {
    val plantRepository: PlantRepository
}

class PlantRepositoryImpl(val registry: ComponentRegistry): PlantRepository {
    override fun savePlant(plant: Plant) {
        //TODO: Save plant to db or something
    }
}

interface PlantRepository {
    fun savePlant(plant: Plant)
}