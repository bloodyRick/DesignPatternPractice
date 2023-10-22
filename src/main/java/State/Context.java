package State;

import lombok.Data;

/**
 * @author by woyuan  2023/10/22
 */
@Data
public class Context {
    public State state;

    public Context(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
