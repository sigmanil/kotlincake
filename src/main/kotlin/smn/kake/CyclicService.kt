package smn.kake

interface CyclicServiceComponent {
    val cyclicService: CyclicService
}

class CyclicServiceImpl(val registry: ComponentRegistry): CyclicService {
    override fun beCyclic() {
        registry.carService.needCyclic()
    }
}

interface CyclicService {
    fun beCyclic()
}