package ru.otus.cars

/**
 * Машина целиком
 */
interface Car : CarInput {

    val tankMouth: TankMouth

    /**
     * Номерной знак
     */
    val plates: Plates

    /**
     * Цвет машины
     */
    val color: String

    /**
     * Следит за машиной
     */
    val carOutput: CarOutput

    /**
     * Получить оборудование
     */
    fun getEquipment(): String

    fun getContents(): Int
    fun receiveFuel(liters: Int)

    /**
     * Внутренний статический класс - номерой знак
     */
    data class Plates(val number: String, val region: Int)

    sealed class TankMouth {

        private var tank: Tank = Tank()

        fun getContents(): Int = tank.fuelLevel
        fun receiveFuel(liters: Int) = tank.receiveFuel(liters)

        inner class Tank {
            var fuelLevel: Int = 0

            fun receiveFuel(liters: Int) {
                fuelLevel += liters
            }
        }
    }
}
