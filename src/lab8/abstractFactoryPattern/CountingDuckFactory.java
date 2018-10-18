package lab8.abstractFactoryPattern;

import lab8.decoratorPattern.QuackCounter;
import lab8.duck.MallardDuck;
import lab8.duck.Quackable;
import lab8.duck.RedheadDuck;
import lab8.duck.RubberDuck;

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
