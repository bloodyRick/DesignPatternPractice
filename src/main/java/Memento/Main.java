package Memento;

/**
 * @author by woyuan  2023/10/22
 */
public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        CareTaker c = new CareTaker();
        c.setMemento(o.CreateMemento());
    }
}
