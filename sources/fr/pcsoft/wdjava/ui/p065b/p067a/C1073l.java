package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.l */
final class C1073l implements C1064c {
    /* renamed from: c */
    private C1064c f3147c;
    /* renamed from: d */
    private String f3148d;

    public C1073l(String str, C1064c c1064c) {
        this.f3148d = str;
        this.f3147c = c1064c;
    }

    /* renamed from: a */
    public void mo3340a() {
        this.f3148d = null;
        if (this.f3147c != null) {
            this.f3147c.mo3340a();
            this.f3147c = null;
        }
    }

    /* renamed from: b */
    public final C1064c m7716b() {
        return this.f3147c;
    }

    /* renamed from: c */
    public final String m7717c() {
        return this.f3148d;
    }
}
