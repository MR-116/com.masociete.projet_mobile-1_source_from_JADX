package fr.pcsoft.wdjava.ui.p065b.p066b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.ui.p065b.C1094e;

/* renamed from: fr.pcsoft.wdjava.ui.b.b.d */
public class C1089d extends BitmapDrawable {
    /* renamed from: a */
    private RectF f3305a;
    /* renamed from: b */
    private byte f3306b;
    /* renamed from: c */
    private byte f3307c;
    /* renamed from: d */
    private RectF f3308d;

    public C1089d(Bitmap bitmap) {
        super(WDAppManager.m2569b(), bitmap);
        this.f3306b = (byte) 78;
        this.f3307c = (byte) 4;
        this.f3305a = null;
        this.f3308d = null;
    }

    public C1089d(Bitmap bitmap, long j) {
        this(bitmap);
        m7916a(j);
    }

    /* renamed from: a */
    private void m7909a() {
        setGravity(119);
    }

    /* renamed from: b */
    private void m7910b() {
        setGravity(119);
        setTileModeXY(TileMode.REPEAT, TileMode.REPEAT);
    }

    /* renamed from: c */
    private void m7911c() {
        setGravity(17);
    }

    /* renamed from: d */
    private void m7912d() {
        switch (this.f3307c) {
            case (byte) 0:
                setGravity(51);
                return;
            case (byte) 1:
                setGravity(49);
                return;
            case (byte) 2:
                setGravity(53);
                return;
            case (byte) 3:
                setGravity(19);
                return;
            case (byte) 4:
                setGravity(17);
                return;
            case (byte) 5:
                setGravity(21);
                return;
            case (byte) 6:
                setGravity(83);
                return;
            case (byte) 7:
                setGravity(81);
                return;
            case (byte) 8:
                setGravity(85);
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    private final RectF m7913e() {
        if (this.f3305a == null) {
            this.f3305a = new RectF(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        }
        return this.f3305a;
    }

    /* renamed from: f */
    private void m7914f() {
        switch (this.f3306b) {
            case (byte) 5:
            case (byte) 7:
            case (byte) 9:
                m7915g();
                return;
            case (byte) 8:
            case (byte) 10:
            case (byte) 72:
                this.f3307c = (byte) 4;
                m7915g();
                return;
            case (byte) 67:
                m7911c();
                return;
            case (byte) 69:
                m7909a();
                return;
            case (byte) 77:
                m7910b();
                return;
            case (byte) 78:
                m7912d();
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    private void m7915g() {
        if (this.f3308d == null) {
            this.f3308d = new RectF();
            setGravity(51);
        }
        int intrinsicWidth = getIntrinsicWidth();
        int intrinsicHeight = getIntrinsicHeight();
        Rect bounds = getBounds();
        double width = ((double) bounds.width()) / ((double) intrinsicWidth);
        double height = ((double) bounds.height()) / ((double) intrinsicHeight);
        if (this.f3306b == (byte) 7 || this.f3306b == (byte) 8) {
            width = Math.max(width, height);
        } else {
            width = Math.min(width, height);
            if (this.f3306b == (byte) 9 || this.f3306b == (byte) 10) {
                width = Math.min(width, 1.0d);
            }
        }
        intrinsicWidth = (int) (((double) intrinsicWidth) * width);
        int i = (int) (width * ((double) intrinsicHeight));
        switch (this.f3307c) {
            case (byte) 0:
                this.f3308d.left = 0.0f;
                this.f3308d.top = 0.0f;
                break;
            case (byte) 1:
                this.f3308d.left = (float) ((bounds.width() - intrinsicWidth) / 2);
                this.f3308d.top = 0.0f;
                break;
            case (byte) 2:
                this.f3308d.left = (float) (bounds.width() - intrinsicWidth);
                this.f3308d.top = 0.0f;
                break;
            case (byte) 3:
                this.f3308d.left = 0.0f;
                this.f3308d.top = (float) ((bounds.height() - i) / 2);
                break;
            case (byte) 4:
                this.f3308d.left = (float) ((bounds.width() - intrinsicWidth) / 2);
                this.f3308d.top = (float) ((bounds.height() - i) / 2);
                break;
            case (byte) 5:
                this.f3308d.left = (float) (bounds.width() - intrinsicWidth);
                this.f3308d.top = (float) ((bounds.height() - i) / 2);
                break;
            case (byte) 6:
                this.f3308d.left = 0.0f;
                this.f3308d.top = (float) (bounds.height() - i);
                break;
            case (byte) 7:
                this.f3308d.left = (float) ((bounds.width() - intrinsicWidth) / 2);
                this.f3308d.top = (float) (bounds.height() - i);
                break;
            case (byte) 8:
                this.f3308d.left = (float) (bounds.width() - intrinsicWidth);
                this.f3308d.top = (float) (bounds.height() - i);
                break;
        }
        this.f3308d.right = ((float) intrinsicWidth) + this.f3308d.left;
        this.f3308d.bottom = ((float) i) + this.f3308d.top;
    }

    /* renamed from: a */
    public void m7916a(long j) {
        this.f3306b = C1094e.m7936a(j, 24);
        this.f3307c = C1094e.m7936a(j, 16);
        m7914f();
    }

    public void draw(Canvas canvas) {
        Object obj = null;
        if (this.f3308d != null) {
            Matrix matrix = new Matrix();
            matrix.setRectToRect(m7913e(), this.f3308d, ScaleToFit.FILL);
            canvas.save();
            obj = 1;
            canvas.concat(matrix);
        }
        super.draw(canvas);
        if (obj != null) {
            canvas.restore();
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f3308d != null) {
            m7914f();
        }
    }
}
