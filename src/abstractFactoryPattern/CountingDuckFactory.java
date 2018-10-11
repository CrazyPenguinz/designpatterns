package abstractFactoryPattern;

import decoratorPattern.QuackCounter;
import duck.MallardDuck;
import duck.Quackable;
import duck.RedheadDuck;
import duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
