package ru.otus.cars

class FuelStation {

    fun refuel(car: Car, amount: Int) {
        try {
            when (car.tankMouth) {
                is PetrolMouth -> refuelPetrol(car, amount)
                is LpgMouth -> refuelLpg(car, amount)
                else -> throw IllegalArgumentException()
            }
        } catch (e: IllegalStateException) {
            println("ooops...")
        }
    }

    private fun refuelPetrol(car: Car, amount: Int) = car.tankMouth.receiveFuel(amount)
    private fun refuelLpg(car: Car, amount: Int) = car.tankMouth.receiveFuel(amount)
}
