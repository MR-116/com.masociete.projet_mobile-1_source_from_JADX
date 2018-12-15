package p000a.p001a.p002a.p007b.p008a;

/* renamed from: a.a.a.b.a.o */
public enum C0046o {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    /* renamed from: b */
    private static final C0046o[] f120b = null;
    /* renamed from: a */
    private final int f122a;

    static {
        f120b = new C0046o[]{M, L, H, Q};
    }

    private C0046o(int i) {
        this.f122a = i;
    }

    public static C0046o forBits(int i) {
        if (i >= 0) {
            try {
                if (i < f120b.length) {
                    return f120b[i];
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.f122a;
    }
}
