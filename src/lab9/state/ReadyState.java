package lab9.state;

import java.util.Map;
import java.util.TreeMap;

public class ReadyState implements State {
    VendingMachine vendingMachine = new VendingMachine();
    Map<String, Integer> destinationMap = new TreeMap<>();

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationMap.put("Ladprao", 30);
        destinationMap.put("Ratchada", 20);
        destinationMap.put("Chula", 45);
    }

    @Override
    public void insertCoin(int amount) {
        System.out.println("ERROR: Invalid input");
    }

    @Override
    public void chooseDestination(String station) {
        if (destinationMap.containsKey(station)) {
            System.out.println("ERROR: Do not have station");
            return;
        }
        System.out.println("Selecting: " + station + " Price: " + destinationMap.get(station) + "$");
        vendingMachine.setPrice(destinationMap.get(station));
        vendingMachine.setCurrentState(vendingMachine.getExpenseState());
    }

    @Override
    public void getTicket() {
        System.out.println("ERROR: Invalid input");
    }
}
