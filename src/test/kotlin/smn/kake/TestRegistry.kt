package smn.kake

import io.mockk.mockk

open class TestRegistry : ComponentRegistry {
    override val carRepository = mockk<CarRepository>()
    override val carService = mockk<CarService>()
    override val cyclicService = mockk<CyclicService>()
}
