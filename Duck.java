package Strategy;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    public Duck() { }

    public abstract void display();

    public void performFly() {
       this. flyBehavior.fly();
    }

    public void performQuack() {
       this. quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }
}
