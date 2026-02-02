class CoffeeMachine {
    var waterRemaining = 400 // in milliliters
    var milkRemaining = 540 // in milliliters
    var beansRemaining = 120 // in grams
    var cupsRemaining = 9
    var dollarsEarned = 550

    fun getUserInput(): UserInput {
        println("Write action (buy, fill, take):")
        val userAction =
            when (readln()) {
                "buy" -> UserInput.BUY
                "fill" -> UserInput.FILL
                else -> UserInput.TAKE
            }
        return userAction
    }

    // BUY
    fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
        when (readln().toInt()) {
            1 -> makeEspresso()
            2 -> makeLatte()
            3 -> makeCappuccino()
        }
    }

    fun makeEspresso() {
        waterRemaining -= 250
        beansRemaining -= 16
        dollarsEarned += 4
        cupsRemaining--
    }

    fun makeLatte() {
        waterRemaining -= 350
        milkRemaining -= 75
        beansRemaining -= 20
        dollarsEarned += 7
        cupsRemaining--
    }

    fun makeCappuccino() {
        waterRemaining -= 200
        milkRemaining -= 100
        beansRemaining -= 12
        dollarsEarned += 6
        cupsRemaining--
    }

    // FILL
    fun fillCoffeeMachine() {
        addWater()
        addMilk()
        addCoffeeBeans()
        addCups()
    }

    fun addWater() {
        println("Write how many ml of water you want to add:")
        waterRemaining += readln().toInt()
    }

    fun addMilk() {
        println("Write how many ml of milk you want to add: ")
        milkRemaining += readln().toInt()
    }

    fun addCoffeeBeans() {
        println("Write how many grams of coffee beans you want to add: ")
        beansRemaining += readln().toInt()
    }

    fun addCups() {
        println("Write how many disposable cups you want to add:")
        cupsRemaining += readln().toInt()
    }

    // TAKE
    fun takeMoney() {
        println("I gave you $$dollarsEarned")
        dollarsEarned = 0
    }

    // MACHINE REPORT
    fun showMachineReport() {
        println(
            """
            The coffee machine has:
            $waterRemaining ml of water
            $milkRemaining ml of milk
            $beansRemaining g of coffee beans
            $cupsRemaining disposable cups
            $$dollarsEarned of money
            """
                .trimIndent()
        )
    }
}
