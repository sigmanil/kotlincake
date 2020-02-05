package smn.kake

import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*

internal class PlantServiceImplTest {
    val testRegistry = object : TestRegistry() {
        override val plantService = PlantServiceImpl(this)
    }

    @org.junit.jupiter.api.Test
    fun registerPlant() {
        val mockId = "mocked new id"
        val plantName = "testnavn"
        every { testRegistry.plantRepository.savePlant(Plant(plantName)) } returns mockId

        val plant = testRegistry.plantService.registerPlant(plantName)

        assertEquals(plantName,plant.name)

        verify(exactly = 1) {
            testRegistry.plantRepository.savePlant(Plant(plantName))
            testRegistry.plantRepository.savePlant(any())
        }

    }
}