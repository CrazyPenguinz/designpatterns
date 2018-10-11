package decoratorPattern;

import adapterPattern.*;
import duck.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck =  new QuackEcho(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackEcho(new PigeonAdapter(new Pigeon()));

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
