package fr.pcsoft.wdjava.ui.dessin.p078b;

import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.b.b */
public class C1363b extends LinearGradient implements C1361d {
    /* renamed from: a */
    private long f4038a = 0;

    public C1363b(long j, int i, int i2, int i3) {
        super(0.0f, 0.0f, 0.0f, (float) i, i2, i3, TileMode.REPEAT);
        this.f4038a = j;
    }

    /* renamed from: a */
    public void mo3737a() {
    }

    /* renamed from: b */
    public long mo3738b() {
        return this.f4038a;
    }
}
