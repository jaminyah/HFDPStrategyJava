/**
 * Head First Design Pattern
 * Adds Dependency Injection to the Strategy Pattern
 */

package Strategy;

public class MiniDuckSim {
    public static void main(String[] args) {

        Quack quack = new Quack();
        FlyWithWings flyWithWings = new FlyWithWings();
        FlyNoWay flyNoWay = new FlyNoWay();
        FlyByRocket flyByRocket = new FlyByRocket();

        Duck mallard = new Mallard(flyByRocket, quack);
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck(flyNoWay, quack);
        model.performFly();

        model.setFlyBehavior(flyWithWings);
        model.performFly();
    }
}
