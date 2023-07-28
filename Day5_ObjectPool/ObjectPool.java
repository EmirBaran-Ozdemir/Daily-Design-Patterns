import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    protected long lifeTime;

    Hashtable<T, Long> lock, unlock;

    ObjectPool() {
        lifeTime = 50000;
        lock = new Hashtable<T, Long>();
        unlock = new Hashtable<T, Long>();
    }

    abstract T create();

    abstract boolean validate(T object);

    abstract void kill(T object);

    synchronized void takeIn(T t) {
        lock.remove(t);
        unlock.put(t, System.currentTimeMillis());
    }

    synchronized T takeOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlock.size() > 0) {
            Enumeration<T> enumeration = unlock.keys();
            while (enumeration.hasMoreElements()) {
                t = enumeration.nextElement();
                if ((now - unlock.get(t)) > lifeTime) {
                    unlock.remove(t);
                    kill(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlock.remove(t);
                        kill(t);
                        t = null;
                    }
                }
            }
        }
        t = create();
        lock.put(t, now);
        return (t);
    }

}
