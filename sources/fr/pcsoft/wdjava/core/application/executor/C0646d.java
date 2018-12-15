package fr.pcsoft.wdjava.core.application.executor;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.p041h.C0645a;
import fr.pcsoft.wdjava.p041h.C0920c;
import fr.pcsoft.wdjava.p041h.C0921d;

/* renamed from: fr.pcsoft.wdjava.core.application.executor.d */
final class C0646d extends C0644b implements C0645a {
    /* renamed from: a */
    private C0920c f1611a;
    final WDProcExecutorTimer this$0;

    C0646d(WDProcExecutorTimer wDProcExecutorTimer, C0920c c0920c) {
        this.this$0 = wDProcExecutorTimer;
        super(wDProcExecutorTimer);
        this.f1611a = c0920c;
        this.f1611a.mo3211a(0);
        this.f1611a.m6534a((C0645a) this);
    }

    /* renamed from: a */
    public void mo2560a(int i) {
    }

    /* renamed from: b */
    public void mo2561b() {
        C0921d.m6545a(this.f1611a.m6539e());
    }

    /* renamed from: b */
    public void mo2562b(int i) {
    }

    /* renamed from: c */
    public WDCallback mo2563c() {
        return this.f1611a.m6531a();
    }

    /* renamed from: c */
    public void mo2564c(int i) {
        m2626d();
    }

    /* renamed from: e */
    public void mo2565e() {
        if (this.f1611a != null) {
            this.f1611a.mo3214d();
        }
    }

    /* renamed from: f */
    public void mo2566f() {
        this.f1611a = null;
    }
}
