package Strategy;

public class Mallard extends Duck {
    public Mallard(IFlyBehavior flyB, IQuackBehavior qkB) {
       this. quackBehavior = qkB;
       this. flyBehavior = flyB;
    }

    public void display() {
        System.out.println("I am a real Mallard duck.");
    }
}
