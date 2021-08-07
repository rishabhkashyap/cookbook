package singletons;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static Singleton singleton;

    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("Trying to create copies of singleton");
        }
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    protected Object readResolve() {
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
