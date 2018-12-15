package p000a.p001a.p002a.p019g;

/* renamed from: a.a.a.g.l */
public final class C0192l {
    /* renamed from: a */
    private final float f743a;
    /* renamed from: b */
    private final float f744b;
    /* renamed from: c */
    private final float f745c;
    /* renamed from: d */
    private final float f746d;
    /* renamed from: e */
    private final float f747e;
    /* renamed from: f */
    private final float f748f;
    /* renamed from: g */
    private final float f749g;
    /* renamed from: h */
    private final float f750h;
    /* renamed from: i */
    private final float f751i;

    private C0192l(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f748f = f;
        this.f743a = f4;
        this.f745c = f7;
        this.f744b = f2;
        this.f750h = f5;
        this.f749g = f8;
        this.f747e = f3;
        this.f746d = f6;
        this.f751i = f9;
    }

    /* renamed from: a */
    public static C0192l m1193a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return C0192l.m1195b(f, f2, f3, f4, f5, f6, f7, f8).m1196a();
    }

    /* renamed from: a */
    public static C0192l m1194a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return C0192l.m1195b(f9, f10, f11, f12, f13, f14, f15, f16).m1197a(C0192l.m1193a(f, f2, f3, f4, f5, f6, f7, f8));
    }

    /* renamed from: b */
    public static C0192l m1195b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C0192l(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f10 * f11) - (f9 * f13)) / f15;
        return new C0192l((f3 - f) + (f16 * f3), (f7 - f) + (f17 * f7), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }

    /* renamed from: a */
    C0192l m1196a() {
        return new C0192l((this.f750h * this.f751i) - (this.f749g * this.f746d), (this.f749g * this.f747e) - (this.f744b * this.f751i), (this.f744b * this.f746d) - (this.f750h * this.f747e), (this.f745c * this.f746d) - (this.f743a * this.f751i), (this.f748f * this.f751i) - (this.f745c * this.f747e), (this.f743a * this.f747e) - (this.f748f * this.f746d), (this.f743a * this.f749g) - (this.f745c * this.f750h), (this.f745c * this.f744b) - (this.f748f * this.f749g), (this.f748f * this.f750h) - (this.f743a * this.f744b));
    }

    /* renamed from: a */
    C0192l m1197a(C0192l c0192l) {
        return new C0192l(((this.f748f * c0192l.f748f) + (this.f744b * c0192l.f743a)) + (this.f747e * c0192l.f745c), ((this.f748f * c0192l.f744b) + (this.f744b * c0192l.f750h)) + (this.f747e * c0192l.f749g), ((this.f748f * c0192l.f747e) + (this.f744b * c0192l.f746d)) + (this.f747e * c0192l.f751i), ((this.f743a * c0192l.f748f) + (this.f750h * c0192l.f743a)) + (this.f746d * c0192l.f745c), ((this.f743a * c0192l.f744b) + (this.f750h * c0192l.f750h)) + (this.f746d * c0192l.f749g), ((this.f743a * c0192l.f747e) + (this.f750h * c0192l.f746d)) + (this.f746d * c0192l.f751i), ((this.f745c * c0192l.f748f) + (this.f749g * c0192l.f743a)) + (this.f751i * c0192l.f745c), ((this.f745c * c0192l.f744b) + (this.f749g * c0192l.f750h)) + (this.f751i * c0192l.f749g), ((this.f745c * c0192l.f747e) + (this.f749g * c0192l.f746d)) + (this.f751i * c0192l.f751i));
    }

    /* renamed from: a */
    public void m1198a(float[] fArr) {
        int length = fArr.length;
        float f = this.f748f;
        float f2 = this.f743a;
        float f3 = this.f745c;
        float f4 = this.f744b;
        float f5 = this.f750h;
        float f6 = this.f749g;
        float f7 = this.f747e;
        float f8 = this.f746d;
        float f9 = this.f751i;
        for (int i = 0; i < length; i += 2) {
            float f10 = fArr[i];
            float f11 = fArr[i + 1];
            float f12 = ((f3 * f10) + (f6 * f11)) + f9;
            fArr[i] = (((f * f10) + (f4 * f11)) + f7) / f12;
            fArr[i + 1] = (((f10 * f2) + (f11 * f5)) + f8) / f12;
        }
    }

    /* renamed from: a */
    public void m1199a(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f = fArr[i];
            float f2 = fArr2[i];
            float f3 = ((this.f745c * f) + (this.f749g * f2)) + this.f751i;
            fArr[i] = (((this.f748f * f) + (this.f744b * f2)) + this.f747e) / f3;
            fArr2[i] = (((f * this.f743a) + (f2 * this.f750h)) + this.f746d) / f3;
        }
    }
}
