package Bridge;

/**
 * @author by woyuan  2023/10/22
 */
public class RefinedAbs extends Abstraction {
    @Override
    public void operation() {
        super.getImplementor().operation();
    }
}
