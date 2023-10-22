package State;

/**
 * @author by woyuan  2023/10/22
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        ConcreteStateB concreteStateB = new ConcreteStateB();
        context.setState(concreteStateB);
    }
}
