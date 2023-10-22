package Bridge;

import jdk.internal.dynalink.linker.LinkerServices;
import lombok.Data;

/**
 * @author by woyuan  2023/10/22
 */
@Data
public abstract  class Abstraction {
    private Implementor implementor;

    public abstract void operation();

}
