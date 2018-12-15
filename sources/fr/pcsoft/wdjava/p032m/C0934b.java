package fr.pcsoft.wdjava.p032m;

import java.util.HashSet;

/* renamed from: fr.pcsoft.wdjava.m.b */
public class C0934b extends HashSet<C0933a> {
    /* renamed from: a */
    public synchronized void m6799a() {
        clear();
    }

    /* renamed from: a */
    public void m6800a(int i) {
        synchronized (this) {
            int size = size();
            C0933a[] c0933aArr = new C0933a[size];
            toArray(c0933aArr);
        }
        for (int i2 = 0; i2 < size; i2++) {
            C0933a c0933a = c0933aArr[i2];
            if (c0933a != null) {
                c0933a.m6793a(i);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m6801a(C0933a c0933a) {
        add(c0933a);
    }

    /* renamed from: b */
    public synchronized void m6802b(C0933a c0933a) {
        remove(c0933a);
    }
}
