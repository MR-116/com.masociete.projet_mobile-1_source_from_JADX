package fr.pcsoft.wdjava.ui.p065b.p066b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.b.f */
public class C1090f implements C1087g {
    /* renamed from: z */
    private static final String f3309z = C1090f.m7917z(C1090f.m7918z("qxß\u000fc[eXNs\u0015X\u000b7[dE\u001av\\iSNDFkB\u000b[[yB*eS}W\f{W*ÖNb\\*E\u000bb^*ß\u001avF"));
    /* renamed from: a */
    private C1087g f3310a;
    /* renamed from: b */
    private int f3311b;

    public C1090f(int i) {
        this.f3311b = 5;
        this.f3310a = null;
        this.f3311b = i;
    }

    public C1090f(int i, C1087g c1087g) {
        this(i);
        this.f3310a = c1087g;
    }

    /* renamed from: z */
    private static String m7917z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 50;
                    break;
                case 1:
                    i2 = 10;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 23;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7918z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 23);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Drawable mo3344a(Bitmap bitmap) {
        Drawable stateListDrawable = new StateListDrawable();
        C0691a.m2860a(this.f3311b > 1, f3309z);
        int width = bitmap.getWidth() / this.f3311b;
        Resources b = WDAppManager.m2569b();
        for (int i = 0; i < this.f3311b; i++) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i * width, 0, width, bitmap.getHeight());
            Drawable a = this.f3310a != null ? this.f3310a.mo3344a(createBitmap) : new BitmapDrawable(b, createBitmap);
            switch (i) {
                case 0:
                    stateListDrawable.addState(new int[]{-16842919, -16842908, 16842910}, a);
                    break;
                case 1:
                    stateListDrawable.addState(new int[]{16842919, 16842910}, a);
                    break;
                case 2:
                    stateListDrawable.addState(new int[]{-16842910}, a);
                    break;
                case 3:
                    stateListDrawable.addState(new int[]{16842908, 16842910}, a);
                    break;
                default:
                    break;
            }
        }
        return stateListDrawable;
    }
}
