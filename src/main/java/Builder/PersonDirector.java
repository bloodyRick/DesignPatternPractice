package Builder;

/**
 * @author by woyuan  2023/10/21
 */
public class PersonDirector {
    private PersonBuilder builder;
    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void CreatePerson() {
        builder.buildHand();
        builder.buildHead();
        builder.buildLeg();
    }
}
