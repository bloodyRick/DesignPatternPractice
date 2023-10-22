package Iterator;

/**
 * @author by woyuan  2023/10/22
 */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract Object currentItem();
    public abstract boolean isDone();
}
