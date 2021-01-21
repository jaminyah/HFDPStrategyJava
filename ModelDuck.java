package Strategy;

public class ModelDuck extends Duck {

    public ModelDuck(IFlyBehavior flyB, IQuackBehavior qkB) {
        this.flyBehavior = flyB;
        this.quackBehavior = qkB;
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}