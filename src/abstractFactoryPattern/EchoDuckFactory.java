package abstractFactoryPattern;

import decoratorPattern.QuackCounter;
import decoratorPattern.QuackEcho;
import duck.MallardDuck;
import duck.Quackable;
import duck.RedheadDuck;
import duck.RubberDuck;

public class EchoDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
