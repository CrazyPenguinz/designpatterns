package lab8.compositePattern;

import lab8.abstractFactoryPattern.AbstractDuckFactory;
import lab8.abstractFactoryPattern.CountingDuckFactory;
import lab8.decoratorPattern.QuackCounter;
import lab8.duck.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Flock flockOfDuck = new Flock();
        flockOfDuck.add(mallardDuck);
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(rubberDuck);

        simulate(flockOfDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
