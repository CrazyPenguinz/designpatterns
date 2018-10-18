package lab8.abstractFactoryPattern;

import lab8.duck.MallardDuck;
import lab8.duck.Quackable;
import lab8.duck.RedheadDuck;
import lab8.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
