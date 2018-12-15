package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.f */
class C1067f extends RectF implements xb {
    /* renamed from: a */
    private float f3099a;
    /* renamed from: b */
    private Rect f3100b = new Rect();
    /* renamed from: c */
    private float f3101c;
    /* renamed from: d */
    private RectF f3102d = new RectF();
    final C1070i this$0;

    public C1067f(C1070i c1070i, float f, float f2) {
        this.this$0 = c1070i;
        this.f3099a = f;
        this.f3101c = f2;
    }

    /* renamed from: a */
    public final float m7637a() {
        return this.f3099a;
    }

    /* renamed from: a */
    public void mo3338a(String str) {
        if (this.this$0.f3125e.f3134b.f3274C) {
            this.this$0.f3125e.f3137e.getTextBounds(str, 0, str.length(), this.f3100b);
            this.f3102d.set(this.f3100b);
            this.f3102d.offset(this.f3099a, this.f3101c);
            union(this.f3102d);
        }
        this.f3099a += this.this$0.f3125e.f3137e.measureText(str);
    }
}
