package fr.pcsoft.wdjava.ui.champs.fenetreinterne;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.PageTransformer;
import android.view.MotionEvent;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetreinterne.v */
public class C1193v extends ViewPager implements C1188r {
    /* renamed from: z */
    private static final String f3606z = C1193v.m8514z(C1193v.m8515z("\u0015\u000b[\u0018C¸BB\u0012\u0016*BL\bC5\rL\u000f=BZ\u0018\u0012-\u000b[\u0018M"));
    /* renamed from: a */
    private boolean f3607a = true;

    public C1193v(Context context) {
        super(context);
    }

    /* renamed from: z */
    private static String m8514z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 88;
                    break;
                case 1:
                    i2 = 98;
                    break;
                case 2:
                    i2 = 40;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8515z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 99);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3450a(PageTransformer pageTransformer) {
        setPageTransformer(true, pageTransformer);
    }

    /* renamed from: a */
    public void mo3451a(boolean z) {
        this.f3607a = z;
    }

    /* renamed from: a */
    public boolean mo3452a() {
        return this.f3607a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (this.f3607a) {
                try {
                    z = super.onInterceptTouchEvent(motionEvent);
                } catch (IllegalArgumentException e) {
                }
            }
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            C0691a.m2857a(f3606z, e);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            if (this.f3607a) {
                try {
                    z = super.onTouchEvent(motionEvent);
                } catch (IllegalArgumentException e) {
                }
            }
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
