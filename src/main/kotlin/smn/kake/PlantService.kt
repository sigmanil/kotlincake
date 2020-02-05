package smn.kake

import java.rmi.registry.LocateRegistry

interface PlantServiceComponent: PlantRepositoryComponent {
    val plantService: PlantService
}

class PlantServiceImpl(val registry: PlantServiceComponent): PlantService {
    override fun registerPlant(name: String) {
        val plant = Plant(name)
        registry.plantRepository.savePlant(plant)
    }
}

interface PlantService {
    fun registerPlant(name: String)
}