package smn.kake

import java.util.*

interface PlantRepositoryComponent {
    val plantRepository: PlantRepository
}

class PlantRepositoryImpl(val registry: PlantRepositoryComponent): PlantRepository {
    override fun savePlant(plant: Plant): String {
        val idForNewPlant = UUID.randomUUID().toString()

        //TODO: Save plant to db or something

        return idForNewPlant
    }
}

interface PlantRepository {
    fun savePlant(plant: Plant): String
}