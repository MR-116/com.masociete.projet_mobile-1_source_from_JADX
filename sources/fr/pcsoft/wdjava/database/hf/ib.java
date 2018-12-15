package fr.pcsoft.wdjava.database.hf;

public class ib {
    /* renamed from: a */
    private static final ib f2270a = new ib(true);
    /* renamed from: b */
    private final boolean f2271b;
    /* renamed from: c */
    private final boolean f2272c;
    /* renamed from: d */
    private final C0861n f2273d;
    /* renamed from: e */
    private final boolean f2274e;
    /* renamed from: f */
    private final Object[] f2275f;
    /* renamed from: g */
    private final boolean f2276g;

    public ib(db dbVar, boolean z, boolean z2, Object[] objArr, C0861n c0861n, boolean z3) {
        this.f2271b = z;
        this.f2272c = z2;
        this.f2275f = objArr;
        this.f2273d = c0861n;
        this.f2276g = z3;
        this.f2274e = false;
    }

    private ib(boolean z) {
        this.f2271b = false;
        this.f2272c = false;
        this.f2275f = null;
        this.f2273d = null;
        this.f2276g = false;
        this.f2274e = z;
    }

    /* renamed from: a */
    public static ib m5980a() {
        return f2270a;
    }

    /* renamed from: a */
    public void m5981a(int i) {
    }

    /* renamed from: a */
    public void m5982a(eb ebVar) {
    }

    /* renamed from: b */
    public boolean m5983b() {
        return this.f2274e;
    }

    /* renamed from: c */
    public Object[] m5984c() {
        return this.f2275f;
    }

    /* renamed from: d */
    public boolean m5985d() {
        return this.f2271b;
    }

    /* renamed from: e */
    public boolean m5986e() {
        return this.f2272c;
    }

    /* renamed from: f */
    public boolean m5987f() {
        return this.f2276g;
    }

    /* renamed from: g */
    public C0861n m5988g() {
        return this.f2273d;
    }
}
