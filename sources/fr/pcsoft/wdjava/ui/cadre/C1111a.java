package fr.pcsoft.wdjava.ui.cadre;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.cadre.a */
public abstract class C1111a implements C1110m {
    /* renamed from: z */
    private static final String f3396z = C1111a.m8095z(C1111a.m8096z("\u001aN~=aIcxa3Bx9e:\rr-\"<Lr*g"));
    /* renamed from: e */
    private int f3397e;
    /* renamed from: f */
    private int f3398f;
    /* renamed from: g */
    private int f3399g;
    /* renamed from: h */
    protected int f3400h = 255;
    /* renamed from: i */
    private int f3401i;

    /* renamed from: z */
    private static String m8095z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 95;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 22;
                    break;
                case 3:
                    i2 = 88;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8096z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3364a() {
        return this.f3397e;
    }

    /* renamed from: a */
    public void mo3365a(int i, int i2, int i3, int i4) {
        this.f3401i = i;
        this.f3399g = i2;
        this.f3397e = i3;
        this.f3398f = i4;
    }

    /* renamed from: a */
    public void mo3366a(Canvas canvas, int i, int i2, int i3, int i4, Path path) {
        mo3383b(canvas, i, i2, i3, i4, path);
        mo3388a(canvas, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo3367a(Canvas canvas, Rect rect) {
        mo3388a(canvas, rect.left, rect.top, rect.width(), rect.height());
    }

    /* renamed from: a */
    public void mo3368a(Canvas canvas, Rect rect, Path path) {
        mo3383b(canvas, rect.left, rect.top, rect.width(), rect.height(), path);
    }

    /* renamed from: a */
    public void mo3369a(Canvas canvas, View view) {
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if ((scrollX | scrollY) == 0) {
            mo3388a(canvas, 0, 0, view.getWidth(), view.getHeight());
            return;
        }
        canvas.translate((float) scrollX, (float) scrollY);
        mo3388a(canvas, 0, 0, view.getWidth(), view.getHeight());
        canvas.translate((float) (-scrollX), (float) (-scrollY));
    }

    /* renamed from: a */
    public void mo3370a(Canvas canvas, View view, Path path) {
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if ((scrollX | scrollY) == 0) {
            mo3383b(canvas, 0, 0, view.getWidth(), view.getHeight(), path);
            return;
        }
        canvas.translate((float) scrollX, (float) scrollY);
        mo3383b(canvas, 0, 0, view.getWidth(), view.getHeight(), path);
        canvas.translate((float) (-scrollX), (float) (-scrollY));
    }

    /* renamed from: b */
    public void mo3371b(int i) {
        this.f3400h = i;
    }

    /* renamed from: b */
    public void mo3372b(Canvas canvas, Rect rect, Path path) {
        mo3366a(canvas, rect.left, rect.top, rect.width(), rect.height(), path);
    }

    /* renamed from: b */
    public void mo3373b(Canvas canvas, View view, Path path) {
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if ((scrollX | scrollY) == 0) {
            mo3366a(canvas, 0, 0, view.getWidth(), view.getHeight(), path);
            return;
        }
        canvas.translate((float) scrollX, (float) scrollY);
        mo3366a(canvas, 0, 0, view.getWidth(), view.getHeight(), path);
        canvas.translate((float) (-scrollX), (float) (-scrollY));
    }

    /* renamed from: c */
    public int mo3374c() {
        return this.f3401i;
    }

    /* renamed from: e */
    public C1110m mo3375e() {
        try {
            return (C1110m) clone();
        } catch (Exception e) {
            C0691a.m2863b(f3396z, e);
            return this;
        }
    }

    /* renamed from: f */
    public boolean mo3376f() {
        return false;
    }

    /* renamed from: g */
    public int mo3377g() {
        return this.f3398f;
    }

    /* renamed from: j */
    public int mo3378j() {
        return this.f3400h;
    }

    /* renamed from: k */
    public boolean mo3379k() {
        return false;
    }

    /* renamed from: m */
    public int mo3380m() {
        return this.f3399g;
    }
}
