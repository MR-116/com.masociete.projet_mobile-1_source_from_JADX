package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.z */
class C1360z extends LinearGradient implements C1341l {
    /* renamed from: a */
    private int f4036a = 255;
    final C1344h this$0;

    public C1360z(C1344h c1344h, float f, float f2, float f3, float f4, int i, int i2, TileMode tileMode) {
        this.this$0 = c1344h;
        super(f, f2, f3, f4, i, i2, tileMode);
    }

    /* renamed from: a */
    public void mo3733a() {
    }

    /* renamed from: a */
    public void mo3731a(int i) {
        this.f4036a = Math.min(Math.max(0, i), 255);
    }

    /* renamed from: b */
    public int mo3732b() {
        return this.f4036a;
    }

    /* renamed from: c */
    public boolean mo3734c() {
        return false;
    }

    /* renamed from: d */
    public void mo3735d() {
        this.this$0.f4000f.setShader(this);
        this.this$0.f4000f.setAlpha(this.f4036a);
    }
}
