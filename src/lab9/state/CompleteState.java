package lab9.state;

public class CompleteState implements State {
    VendingMachine vendingMachine;

    public CompleteState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("ERROR: Invalid input");
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("ERROR: Invalid input");
    }

    @Override
    public void getTicket() {
        System.out.println("Thank you");
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
    }
}
