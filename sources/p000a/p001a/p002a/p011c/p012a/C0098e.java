package p000a.p001a.p002a.p011c.p012a;

/* renamed from: a.a.a.c.a.e */
public class C0098e {
    /* renamed from: a */
    private final int f300a;
    /* renamed from: b */
    private final int f301b;

    public C0098e(int i, int i2) {
        this.f300a = i;
        this.f301b = i2;
    }

    /* renamed from: a */
    public final int m574a() {
        return this.f300a;
    }

    /* renamed from: b */
    public final int m575b() {
        return this.f301b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0098e)) {
            return false;
        }
        C0098e c0098e = (C0098e) obj;
        return this.f300a == c0098e.f300a && this.f301b == c0098e.f301b;
    }

    public final int hashCode() {
        return this.f300a ^ this.f301b;
    }

    public final String toString() {
        return this.f300a + "(" + this.f301b + ')';
    }
}
