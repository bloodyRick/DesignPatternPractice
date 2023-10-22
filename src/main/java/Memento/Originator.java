package Memento;

import lombok.Data;

/**
 * @author by woyuan  2023/10/22
 */
@Data
public class Originator {
    private String state;

    public Memento CreateMemento() {
        return new Memento();
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println(state);
    }

}
