package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.champs.C1151p;
import fr.pcsoft.wdjava.ui.champs.gc;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.o */
public class C1305o extends C1151p {
    /* renamed from: z */
    private static final String f3899z = C1305o.m9170z(C1305o.m9171z("|\u00127/PUSy~@C\u00077)DCSa0AU"));
    final C1294e this$0;

    public C1305o(C1294e c1294e, Context context) {
        this.this$0 = c1294e;
        super(context);
        setVisibility(4);
        setBackgroundDrawable(null);
        Paint paintHorizontalSeparator = c1294e.b.getPaintHorizontalSeparator();
        if (paintHorizontalSeparator != null) {
            setPadding(0, 0, 0, (int) paintHorizontalSeparator.getStrokeWidth());
        }
    }

    /* renamed from: z */
    private static String m9170z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 48;
                    break;
                case 1:
                    i2 = 115;
                    break;
                case 2:
                    i2 = 23;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9171z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m9172a(Iterator<gc> it) {
        C0691a.m2860a(getChildCount() == 0, f3899z);
        while (it.hasNext()) {
            addView(((gc) it.next()).getCompConteneur());
        }
    }

    /* renamed from: c */
    public void m9173c() {
        super.requestLayout();
    }

    /* renamed from: d */
    public void m9174d() {
    }

    public void forceLayout() {
    }

    public void invalidate() {
    }

    public void invalidate(int i, int i2, int i3, int i4) {
    }

    public void invalidate(Rect rect) {
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void invalidateDrawable(Drawable drawable) {
    }

    public void requestLayout() {
    }
}
