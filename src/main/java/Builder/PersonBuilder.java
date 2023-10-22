package Builder;

/**
 * @author by woyuan  2023/10/21
 */
public abstract class PersonBuilder {
    // 建造者模式主要是为了将负责对象的构建和它的表示分离，使得同样的构建过程可以创建不同的对象
    public abstract void buildHead();
    public abstract void buildHand();
    public abstract void buildLeg();

}
