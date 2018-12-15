package p000a.p001a.p002a.p007b.p009b;

import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.b.b.h */
public final class C0059h extends eb {
    /* renamed from: c */
    private final float f163c;
    /* renamed from: d */
    private final int f164d;

    C0059h(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    private C0059h(float f, float f2, float f3, int i) {
        super(f, f2);
        this.f163c = f3;
        this.f164d = i;
    }

    /* renamed from: a */
    C0059h m315a(float f, float f2, float f3) {
        int i = this.f164d + 1;
        return new C0059h(((((float) this.f164d) * m312b()) + f2) / ((float) i), ((((float) this.f164d) * m311a()) + f) / ((float) i), ((((float) this.f164d) * this.f163c) + f3) / ((float) i), i);
    }

    /* renamed from: b */
    boolean m316b(float f, float f2, float f3) {
        if (Math.abs(f2 - m311a()) > f || Math.abs(f3 - m312b()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f163c);
        return abs <= 1.0f || abs <= this.f163c;
    }

    /* renamed from: c */
    public float m317c() {
        return this.f163c;
    }

    /* renamed from: d */
    int m318d() {
        return this.f164d;
    }
}
