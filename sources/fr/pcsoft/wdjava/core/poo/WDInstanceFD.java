package fr.pcsoft.wdjava.core.poo;

import java.lang.ref.WeakReference;

public class WDInstanceFD extends C0729v {
    /* renamed from: b */
    protected WeakReference<C0558c> f1858b;

    public WDInstanceFD(C0558c c0558c) {
        this(c0558c, c0558c.getClass());
    }

    protected WDInstanceFD(C0558c c0558c, Class cls) {
        super(c0558c, cls);
    }

    public C0729v creerInstanceNonAllouee() {
        return new WDInstanceFD(null, this.a);
    }

    protected C0558c getReference() {
        return this.f1858b != null ? (C0558c) this.f1858b.get() : null;
    }

    protected void setReference(C0558c c0558c) {
        this.f1858b = c0558c != null ? new WeakReference(c0558c) : null;
    }
}
