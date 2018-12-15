package fr.pcsoft.wdjava.ui.dessin.p078b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader.TileMode;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1353s;
import fr.pcsoft.wdjava.ui.utils.C1511l;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.b.a */
public class C1362a extends BitmapShader implements C1361d {
    /* renamed from: a */
    private long f4037a = 0;

    public C1362a(long j, int i, int i2) {
        super(C1362a.m9747a(i2, i), TileMode.REPEAT, TileMode.REPEAT);
        this.f4037a = j;
    }

    /* renamed from: a */
    private static Bitmap m9747a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(C1511l.m10532d(8.0f, 2), C1511l.m10532d(8.0f, 2), Config.ARGB_4444);
        C1364c.m9755a(new C1353s(new Canvas(createBitmap), createBitmap), i2, i);
        return createBitmap;
    }

    /* renamed from: a */
    public void mo3737a() {
    }

    /* renamed from: b */
    public long mo3738b() {
        return this.f4037a;
    }
}
