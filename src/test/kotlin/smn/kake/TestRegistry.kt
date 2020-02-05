package smn.kake

import io.mockk.mockk

open class TestRegistry : ComponentRegistry {
    override val plantRepository = mockk<PlantRepositoryImpl>()
    override val plantService = mockk<PlantServiceImpl>()
}
