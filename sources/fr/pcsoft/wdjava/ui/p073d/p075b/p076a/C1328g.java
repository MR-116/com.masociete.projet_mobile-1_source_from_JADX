package fr.pcsoft.wdjava.ui.p073d.p075b.p076a;

import fr.pcsoft.wdjava.p032m.C0938m;

/* renamed from: fr.pcsoft.wdjava.ui.d.b.a.g */
class C1328g implements Runnable {
    /* renamed from: a */
    protected boolean f3965a = false;
    final C1327f this$0;

    C1328g(C1327f c1327f) {
        this.this$0 = c1327f;
    }

    /* renamed from: a */
    public final boolean m9493a() {
        return this.f3965a;
    }

    /* renamed from: b */
    public void m9494b() {
        this.f3965a = true;
        run();
    }

    /* renamed from: c */
    public void m9495c() {
        this.f3965a = false;
    }

    public void run() {
        this.this$0.m9467R();
        if (this.f3965a) {
            C0938m.m6816c().postDelayed(this, (long) this.this$0.p);
        }
    }
}
