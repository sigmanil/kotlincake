package smn.kake

import io.mockk.mockk

open class TestRegistry : ComponentRegistry {
    override val carRepository = mockk<CarRepositoryImpl>()
    override val carService = mockk<CarServiceImpl>()
}
