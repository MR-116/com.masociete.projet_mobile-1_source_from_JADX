package p000a.p001a.p002a.p007b.p009b;

import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.b.b.g */
public final class C0058g extends eb {
    /* renamed from: c */
    private final float f162c;

    C0058g(float f, float f2, float f3) {
        super(f, f2);
        this.f162c = f3;
    }

    /* renamed from: a */
    C0058g m313a(float f, float f2, float f3) {
        return new C0058g((m312b() + f2) / 2.0f, (m311a() + f) / 2.0f, (this.f162c + f3) / 2.0f);
    }

    /* renamed from: b */
    boolean m314b(float f, float f2, float f3) {
        if (Math.abs(f2 - m311a()) > f || Math.abs(f3 - m312b()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.f162c);
        return abs <= 1.0f || abs <= this.f162c;
    }
}
