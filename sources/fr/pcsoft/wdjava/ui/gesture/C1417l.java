package fr.pcsoft.wdjava.ui.gesture;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.p072i.C1293e;

/* renamed from: fr.pcsoft.wdjava.ui.gesture.l */
final class C1417l extends ImageView {
    /* renamed from: z */
    private static final String[] f4196z = new String[]{C1417l.m10009z(C1417l.m10010z("D\u00103@3D")), C1417l.m10009z(C1417l.m10010z("\u001c}W2R\t.L3GY9A|_\u0018}H5T\u00178\u00042\u0014\u0018}T=@Y´Pµ\u0013\u001e´JµA8\n"))};
    /* renamed from: a */
    private LayoutParams f4197a = null;

    @TargetApi(16)
    C1417l(View view) {
        super(view.getContext());
        Bitmap a = m10007a(view);
        C0691a.m2860a(a != null, f4196z[1]);
        if (a != null) {
            setImageBitmap(a);
        }
        if (kb.m3965a(C0657a.JELLY_BEAN)) {
            setImageAlpha(128);
        } else {
            setAlpha(128);
        }
    }

    /* renamed from: a */
    private Bitmap m10007a(View view) {
        if (view instanceof C1293e) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        view.setDrawingCacheEnabled(true);
        try {
            view.destroyDrawingCache();
            createBitmap = Bitmap.createBitmap(view.getDrawingCache());
            return createBitmap;
        } finally {
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        }
    }

    /* renamed from: c */
    private WindowManager m10008c() {
        return (WindowManager) C1056i.m7562a().getSystemService(f4196z[0]);
    }

    /* renamed from: z */
    private static String m10009z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 51;
                    break;
                case 1:
                    i2 = 121;
                    break;
                case 2:
                    i2 = 93;
                    break;
                case 3:
                    i2 = 36;
                    break;
                default:
                    i2 = 92;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10010z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 92);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int m10011a() {
        return this.f4197a.x;
    }

    /* renamed from: a */
    public final void m10012a(int i, int i2) {
        if (getParent() == null) {
            this.f4197a = new LayoutParams();
            this.f4197a.gravity = 51;
            this.f4197a.x = i;
            this.f4197a.height = -2;
            this.f4197a.width = -2;
            this.f4197a.format = -3;
            this.f4197a.windowAnimations = 0;
            this.f4197a.y = i2;
            this.f4197a.flags = 408;
            setLayoutParams(this.f4197a);
            WindowManager c = m10008c();
            if (c != null) {
                c.addView(this, this.f4197a);
            }
        }
    }

    /* renamed from: b */
    public final void m10013b() {
        this.f4197a = null;
    }

    /* renamed from: b */
    public final void m10014b(int i, int i2) {
        this.f4197a.x = i;
        this.f4197a.y = i2;
        WindowManager c = m10008c();
        if (c != null) {
            c.updateViewLayout(this, this.f4197a);
        }
    }

    /* renamed from: d */
    public final int m10015d() {
        return this.f4197a.y;
    }

    /* renamed from: e */
    public final void m10016e() {
        Drawable drawable = getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            drawable.setCallback(null);
            unscheduleDrawable(drawable);
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        if (getParent() != null) {
            WindowManager c = m10008c();
            if (c != null) {
                c.removeView(this);
            }
        }
    }
}
