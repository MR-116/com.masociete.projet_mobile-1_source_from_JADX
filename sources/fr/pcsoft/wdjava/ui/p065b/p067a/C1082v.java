package fr.pcsoft.wdjava.ui.p065b.p067a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.v */
class C1082v implements xb {
    /* renamed from: a */
    private float f3230a;
    /* renamed from: b */
    private float f3231b;
    final C1070i this$0;

    public C1082v(C1070i c1070i, float f, float f2) {
        this.this$0 = c1070i;
        this.f3231b = f;
        this.f3230a = f2;
    }

    /* renamed from: a */
    public final float m7821a() {
        return this.f3231b;
    }

    /* renamed from: a */
    public final void m7822a(float f, float f2) {
        this.f3231b = f;
        this.f3230a = f2;
    }

    /* renamed from: a */
    public void mo3338a(String str) {
        if (this.this$0.f3125e.f3134b.f3274C) {
            if (this.this$0.f3125e.f3138f) {
                this.this$0.f3123b.drawText(str, this.f3231b, this.f3230a, this.this$0.f3125e.f3137e);
            }
            if (this.this$0.f3125e.f3133a) {
                this.this$0.f3123b.drawText(str, this.f3231b, this.f3230a, this.this$0.f3125e.f3135c);
            }
        }
        this.f3231b += this.this$0.f3125e.f3137e.measureText(str);
    }

    /* renamed from: b */
    public final float m7824b() {
        return this.f3230a;
    }
}
