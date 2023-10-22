package PublishSubscribe;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2023/10/22
 */
public abstract class Subject {
    List<Observer> observers = Lists.newArrayList();
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyStatus() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
