package p000a.p001a.p002a.p022f.p023a;

import java.lang.reflect.Array;

/* renamed from: a.a.a.f.a.c */
public final class C0148c {
    /* renamed from: a */
    private final int f536a;
    /* renamed from: b */
    private int f537b;
    /* renamed from: c */
    private final C0151f[] f538c;
    /* renamed from: d */
    private final int f539d;

    C0148c(int i, int i2) {
        this.f538c = new C0151f[i];
        int length = this.f538c.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f538c[i3] = new C0151f(((i2 + 4) * 17) + 1);
        }
        this.f539d = i2 * 17;
        this.f536a = i;
        this.f537b = -1;
    }

    /* renamed from: a */
    void m875a(int i, int i2, byte b) {
        this.f538c[i2].m898a(i, b);
    }

    /* renamed from: a */
    public byte[][] m876a() {
        return m877a(1, 1);
    }

    /* renamed from: a */
    public byte[][] m877a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{this.f536a * i2, this.f539d * i});
        int i3 = this.f536a * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f538c[i4 / i2].m900a(i);
        }
        return bArr;
    }

    /* renamed from: b */
    void m878b() {
        this.f537b++;
    }

    /* renamed from: c */
    C0151f m879c() {
        return this.f538c[this.f537b];
    }
}
