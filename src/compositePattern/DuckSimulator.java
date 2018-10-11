package compositePattern;

import abstractFactoryPattern.AbstractDuckFactory;
import abstractFactoryPattern.CountingDuckFactory;
import decoratorPattern.QuackCounter;
import duck.MallardDuck;
import duck.Quackable;
import duck.RedheadDuck;
import duck.RubberDuck;

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
