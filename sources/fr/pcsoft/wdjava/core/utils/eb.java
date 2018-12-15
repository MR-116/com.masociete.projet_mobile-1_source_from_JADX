package fr.pcsoft.wdjava.core.utils;

import java.util.concurrent.Callable;

public abstract class eb<T> implements Runnable, Callable<T> {
    /* renamed from: a */
    private Exception f1845a = null;
    /* renamed from: b */
    private T f1846b = null;

    /* renamed from: a */
    private final void m3087a(T t) {
        this.f1846b = t;
    }

    /* renamed from: a */
    public final T m3088a() throws Exception {
        try {
            if (this.f1845a == null) {
                return this.f1846b;
            }
            throw this.f1845a;
        } catch (Exception e) {
            throw e;
        }
    }

    public void run() {
        try {
            m3087a(call());
        } catch (Exception e) {
            this.f1845a = e;
        }
    }
}
