package smn.kake

import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*

internal class CarServiceImplTest {
    val testRegistry = object : TestRegistry() {
        override val carService = CarServiceImpl(this)
    }

    @org.junit.jupiter.api.Test
    fun registerCar() {
        val mockId = "mocked new id"
        val carName = "testnavn"
        every { testRegistry.carRepository.saveCar(Car(carName)) } returns mockId

        val car = testRegistry.carService.registerCar(carName)

        assertEquals(carName,car.name)

        verify(exactly = 1) {
            testRegistry.carRepository.saveCar(Car(carName))
            testRegistry.carRepository.saveCar(any())
        }

    }
}