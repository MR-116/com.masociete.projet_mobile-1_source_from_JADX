package p000a.p001a.p002a.p011c.p012a;

import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.c.a.g */
public final class C0100g {
    /* renamed from: a */
    private final int[] f304a;
    /* renamed from: b */
    private final int f305b;
    /* renamed from: c */
    private final eb[] f306c;

    public C0100g(int i, int[] iArr, int i2, int i3, int i4) {
        this.f305b = i;
        this.f304a = iArr;
        this.f306c = new eb[]{new eb((float) i2, (float) i4), new eb((float) i3, (float) i4)};
    }

    /* renamed from: a */
    public int m579a() {
        return this.f305b;
    }

    /* renamed from: b */
    public eb[] m580b() {
        return this.f306c;
    }

    /* renamed from: c */
    public int[] m581c() {
        return this.f304a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0100g)) {
            return false;
        }
        return this.f305b == ((C0100g) obj).f305b;
    }

    public int hashCode() {
        return this.f305b;
    }
}
