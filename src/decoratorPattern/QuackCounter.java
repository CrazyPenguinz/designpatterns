package decoratorPattern;

import duck.Quackable;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuack;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        numberOfQuack = 0;
    }

    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}
