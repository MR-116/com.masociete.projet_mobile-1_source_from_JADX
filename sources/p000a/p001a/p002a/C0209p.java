package p000a.p001a.p002a;

/* renamed from: a.a.a.p */
public final class C0209p {
    /* renamed from: a */
    private final int f783a;
    /* renamed from: b */
    private final int f784b;

    public C0209p(int i, int i2) {
        if (i < 0 || i2 < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f784b = i;
        this.f783a = i2;
    }

    /* renamed from: a */
    public int m1261a() {
        return this.f784b;
    }

    /* renamed from: b */
    public int m1262b() {
        return this.f783a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0209p)) {
            return false;
        }
        C0209p c0209p = (C0209p) obj;
        try {
            return this.f784b == c0209p.f784b ? this.f783a == c0209p.f783a : false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        return (this.f784b * 32713) + this.f783a;
    }

    public String toString() {
        return this.f784b + "x" + this.f783a;
    }
}
