package smn.kake

import java.rmi.registry.LocateRegistry

interface PlantServiceComponent: PlantRepositoryComponent {
    val plantService: PlantService
}

class PlantServiceImpl(val registry: PlantServiceComponent): PlantService {
    override fun registerPlant(name: String): Plant {
        val plant = Plant(name)
        registry.plantRepository.savePlant(plant)
        return plant
    }
}

interface PlantService {
    fun registerPlant(name: String): Plant
}