package lab9.state;

public class ExpenseState implements State {
    VendingMachine vendingMachine;

    public ExpenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        int currentAmount = vendingMachine.getAmount() + amount;
        if (currentAmount >= vendingMachine.getPrice()) {
            if (currentAmount > vendingMachine.getPrice())
                System.out.println("Change " + (currentAmount - vendingMachine.getPrice()));
            System.out.println("Complete Expense, Please get your ticket");
            vendingMachine.setAmount(0);
            vendingMachine.setPrice(0);
            vendingMachine.setCurrentState(vendingMachine.getCompleteState());
        } else if (currentAmount < vendingMachine.getPrice())
            System.out.println("Need more " + (vendingMachine.getPrice() - currentAmount));
            vendingMachine.setAmount(amount);
    }

    @Override
    public void chooseDestination(String station) {
        System.out.println("ERROR: Invalid input");
    }

    @Override
    public void getTicket() {
        System.out.println("ERROR: Invalid input");
    }
}
