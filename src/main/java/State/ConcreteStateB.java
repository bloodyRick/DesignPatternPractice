package State;

/**
 * @author by woyuan  2023/10/22
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        ConcreteStateA concreteStateA = new ConcreteStateA();
        context.setState(concreteStateA);
    }
}
