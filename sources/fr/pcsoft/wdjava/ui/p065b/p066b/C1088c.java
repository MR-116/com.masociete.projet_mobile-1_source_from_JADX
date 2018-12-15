package fr.pcsoft.wdjava.ui.p065b.p066b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fr.pcsoft.wdjava.ui.b.b.c */
public class C1088c implements C1087g {
    /* renamed from: z */
    private static final String f3302z = C1088c.m7906z(C1088c.m7907z("pbD!QY*É0\u0018OhM!\u001fI-I*\u0007\\aI \u0014\u0013"));
    /* renamed from: a */
    private Rect f3303a;
    /* renamed from: b */
    private int f3304b;

    public C1088c(int i) {
        this.f3304b = 2;
        this.f3303a = null;
        this.f3304b = i;
        if (i == 3) {
            this.f3303a = new Rect();
        }
    }

    public C1088c(Rect rect) {
        this.f3304b = 2;
        this.f3303a = null;
        this.f3304b = 3;
        this.f3303a = rect;
    }

    /* renamed from: a */
    private static ByteBuffer m7905a(int i, int i2, int i3, int i4) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i2);
        order.putInt(i4);
        order.putInt(i);
        order.putInt(i3);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }

    /* renamed from: z */
    private static String m7906z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 13;
                    break;
                case 2:
                    i2 = 32;
                    break;
                case 3:
                    i2 = 68;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7907z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 113);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Drawable mo3344a(Bitmap bitmap) {
        int i;
        int i2;
        int i3 = 0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        switch (this.f3304b) {
            case 1:
                i = width > 32 ? (width - 16) / 2 : 0;
                i2 = height;
                height = 0;
                i3 = width - i;
                break;
            case 2:
                break;
            case 3:
                height = this.f3303a.top;
                i2 = bitmap.getHeight() - this.f3303a.bottom;
                i = this.f3303a.left;
                i3 = bitmap.getWidth() - this.f3303a.right;
                break;
            default:
                C0691a.m2856a(f3302z);
                break;
        }
        i2 = width > 20 ? 10 : 0;
        if (height > 32) {
            i3 = (height - 16) / 2;
        }
        int i4 = width - i2;
        i = i2;
        i2 = height - i3;
        height = i3;
        i3 = i4;
        return new NinePatchDrawable(WDAppManager.m2569b(), bitmap, C1088c.m7905a(height, i, i2, i3).array(), new Rect(), null);
    }
}
