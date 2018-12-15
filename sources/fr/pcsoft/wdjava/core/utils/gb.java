package fr.pcsoft.wdjava.core.utils;

public abstract class gb<T> extends eb<T> {
    public void run() {
        try {
            super.run();
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                notifyAll();
            }
        }
    }
}
