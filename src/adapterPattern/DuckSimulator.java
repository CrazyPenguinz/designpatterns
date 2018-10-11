package adapterPattern;

import duck.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck =  new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
