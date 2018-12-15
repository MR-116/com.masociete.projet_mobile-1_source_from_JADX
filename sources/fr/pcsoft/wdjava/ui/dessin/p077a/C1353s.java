package fr.pcsoft.wdjava.ui.dessin.p077a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p065b.C1104o;
import fr.pcsoft.wdjava.ui.utils.C1508i;

/* renamed from: fr.pcsoft.wdjava.ui.dessin.a.s */
public class C1353s extends C1352r {
    /* renamed from: b */
    private Bitmap f4027b = null;

    public C1353s(Canvas canvas, Bitmap bitmap) {
        super(canvas);
        this.f4027b = bitmap;
    }

    /* renamed from: a */
    public static final C1353s m9717a(int i, int i2, int i3, int i4, boolean z) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, z ? Config.ARGB_8888 : Config.RGB_565);
        createBitmap.setDensity(i3);
        if (C1031a.m7448a(i4) > 0) {
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColor(i4);
            paint.setStyle(Style.FILL);
            canvas.drawRect(0.0f, 0.0f, (float) createBitmap.getWidth(), (float) createBitmap.getHeight(), paint);
        }
        return C1353s.m9718a(createBitmap);
    }

    /* renamed from: a */
    public static final C1353s m9718a(Bitmap bitmap) {
        Bitmap d = C1508i.m10498d(bitmap);
        return new C1353s(new Canvas(d), d);
    }

    /* renamed from: a */
    public static final C1353s m9719a(String str) {
        C1104o c1104o = new C1104o();
        c1104o.m7987a(true);
        Bitmap a = C1093d.m7922a(str, c1104o, WDAppManager.m2569b());
        return a != null ? C1353s.m9718a(a) : null;
    }

    /* renamed from: a */
    public final C1336b m9720a(boolean z) {
        return new C1348m(z ? C1508i.m10476a(this.f4027b, -1, -1) : this.f4027b);
    }

    /* renamed from: a */
    public void mo3730a() {
        super.mo3730a();
        if (this.f4027b != null) {
            this.f4027b = null;
        }
    }

    /* renamed from: c */
    public final boolean m9722c() {
        return this.f4027b != null ? this.f4027b.hasAlpha() : false;
    }

    /* renamed from: d */
    public final int m9723d() {
        return this.f4027b != null ? this.f4027b.getHeight() : 0;
    }

    /* renamed from: e */
    public final int m9724e() {
        return this.f4027b != null ? this.f4027b.getWidth() : 0;
    }

    /* renamed from: f */
    public final Bitmap m9725f() {
        return this.f4027b;
    }

    /* renamed from: g */
    public final int m9726g() {
        return m9722c() ? 32 : 24;
    }
}
