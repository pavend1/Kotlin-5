package ru.otus.cars

object Taz: Car {
    override val tankMouth: Car.TankMouth
        get() = throw IllegalStateException()

    /**
     * Номерной знак
     */
    override val plates: Car.Plates
        get() = throw NotImplementedError("Номера сняты")

    /**
     * Цвет машины
     */
    override val color: String = "Ржавый"

    /**
     * Следит за машиной
     */
    override val carOutput: CarOutput
        get() = throw NotImplementedError("Приборов нет")

    /**
     * Получить оборудование
     */
    override fun getEquipment(): String = "Крыса"

    override fun getContents(): Int {
        throw NotImplementedError()
    }

    override fun receiveFuel(liters: Int) {
        throw IllegalStateException("boom")
    }

    /**
     * Руль вправо на [degrees] градусов
     */
    override fun wheelToRight(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    /**
     * Руль влево на [degrees] градусов
     */
    override fun wheelToLeft(degrees: Int) {
        throw NotImplementedError("Руля нет")
    }

    override fun toString(): String {
        return "Taz(tankMouth=N/A, plates=N/A, color='$color', carOutput=N/A)"
    }
}
