package Strategy;

public class MuteQuack implements IQuackBehavior {
    public void quack() {
        System.out.print("<< Silence >>");
    }
}
