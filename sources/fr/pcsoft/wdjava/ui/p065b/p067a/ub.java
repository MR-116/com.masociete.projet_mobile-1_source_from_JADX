package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.ub */
final class ub extends C1060y implements zb {
    /* renamed from: b */
    private kb f3228b;
    /* renamed from: c */
    private String f3229c;

    public ub(String str) {
        this.f3229c = str;
    }

    /* renamed from: a */
    public void mo3341a(kb kbVar) {
        this.f3228b = kbVar;
    }

    /* renamed from: a */
    public final void m7817a(String str) {
        if (this.f3229c != null) {
            this.f3229c += str;
        } else {
            this.f3229c = str;
        }
    }

    /* renamed from: b */
    public final void m7818b(String str) {
        this.f3229c = str;
    }

    /* renamed from: d */
    public final String m7819d() {
        return this.f3229c;
    }

    /* renamed from: e */
    public kb mo3342e() {
        return this.f3228b;
    }
}
