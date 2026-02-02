fun main() {
    val coffeeMachine = CoffeeMachine()
    coffeeMachine.showMachineReport()
    val userInput = coffeeMachine.getUserInput()
    when (userInput) {
        UserInput.BUY -> coffeeMachine.buyCoffee()
        UserInput.FILL -> coffeeMachine.fillCoffeeMachine()
        else -> coffeeMachine.takeMoney()
    }
    coffeeMachine.showMachineReport()
}