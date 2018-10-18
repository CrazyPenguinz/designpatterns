package lab8.abstractFactoryPattern;

import lab8.duck.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createRubberDuck();
}
