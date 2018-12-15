package fr.pcsoft.wdjava.ui.p069g;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ViewSwitcher.ViewFactory;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.utils.C1515p;

/* renamed from: fr.pcsoft.wdjava.ui.g.g */
final class C1406g extends ImageSwitcher implements ViewFactory, AnimationListener {
    /* renamed from: z */
    private static final String[] f4170z = new String[]{C1406g.m9978z(C1406g.m9979z("\u0004Y|h)1^zkh+X{%<7X`s¡ \u0019")), C1406g.m9978z(C1406g.m9979z("\u0000Eg`=7\u0017p}+ Gal'+\u0017qp:$Ya%$bV{l%$C|j&k"))};
    /* renamed from: a */
    private Rect f4171a = new Rect();
    /* renamed from: b */
    private ic<Void> f4172b = null;
    /* renamed from: c */
    private BitmapDrawable f4173c = null;
    /* renamed from: d */
    private BitmapDrawable f4174d = null;

    C1406g(Activity activity, Rect rect) {
        super(activity);
        setFactory(this);
        this.f4171a = rect;
        LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.format = -1;
        layoutParams.windowAnimations = 0;
        layoutParams.flags = 392;
        layoutParams.gravity = 51;
        layoutParams.x = this.f4171a.left;
        layoutParams.y = this.f4171a.top;
        layoutParams.width = this.f4171a.width();
        layoutParams.height = this.f4171a.height();
        setLayoutParams(layoutParams);
        Bitmap a = m9976a();
        if (a != null) {
            this.f4174d = new BitmapDrawable(activity.getResources(), a);
            if (this.f4174d != null) {
                setImageDrawable(null);
                setImageDrawable(this.f4174d);
            }
        }
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager != null) {
            windowManager.addView(this, layoutParams);
        }
        C1515p.m10541a();
    }

    /* renamed from: a */
    private Bitmap m9976a() {
        Activity activity = (Activity) getContext();
        if (activity == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        boolean isDrawingCacheEnabled = decorView.isDrawingCacheEnabled();
        decorView.setDrawingCacheEnabled(true);
        try {
            decorView.destroyDrawingCache();
            Bitmap drawingCache = decorView.getDrawingCache();
            int width = this.f4171a.width();
            int height = this.f4171a.height();
            if (width <= 0 || height <= 0) {
                decorView.setDrawingCacheEnabled(isDrawingCacheEnabled);
                return null;
            }
            int width2 = this.f4171a.left + width > drawingCache.getWidth() ? drawingCache.getWidth() - this.f4171a.left : width;
            if (this.f4171a.top + height > drawingCache.getHeight()) {
                height = drawingCache.getHeight() - this.f4171a.top;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache, this.f4171a.left, this.f4171a.top, width2, height);
            decorView.setDrawingCacheEnabled(isDrawingCacheEnabled);
            return createBitmap;
        } catch (Throwable th) {
            decorView.setDrawingCacheEnabled(isDrawingCacheEnabled);
        }
    }

    static BitmapDrawable access$100(C1406g c1406g) {
        return c1406g.f4173c;
    }

    /* renamed from: c */
    private final void m9977c() {
        Bitmap bitmap;
        if (this.f4174d != null) {
            bitmap = this.f4174d.getBitmap();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            this.f4174d = null;
        }
        if (this.f4173c != null) {
            bitmap = this.f4173c.getBitmap();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            this.f4173c = null;
        }
        this.f4171a = null;
        this.f4172b = null;
    }

    /* renamed from: z */
    private static String m9978z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 69;
                    break;
                case 1:
                    i2 = 55;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9979z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 72);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m9980a(int i, int i2, boolean z) {
        try {
            if (getParent() != null) {
                Context a = C1056i.m7562a();
                Resources resources = a.getResources();
                int access$000 = C1404d.m9970a(resources, i, true);
                if (access$000 > 0) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(a, access$000);
                    loadAnimation.setDuration((long) i2);
                    setInAnimation(loadAnimation);
                    access$000 = C1404d.m9970a(resources, i, false);
                    if (access$000 > 0) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(a, access$000);
                        loadAnimation2.setDuration((long) i2);
                        setOutAnimation(loadAnimation2);
                        loadAnimation2.setAnimationListener(this);
                        Bitmap a2 = m9976a();
                        if (a2 != null) {
                            try {
                                this.f4173c = new BitmapDrawable(resources, a2);
                                if (z) {
                                    this.f4172b = new C1411l(this);
                                    try {
                                        this.f4172b.m1785a(0, "", 0);
                                        return;
                                    } catch (Exception e) {
                                        C0691a.m2857a(f4170z[1], e);
                                        return;
                                    }
                                }
                                setImageDrawable(this.f4173c);
                                return;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                        return;
                    }
                    C0691a.m2856a(f4170z[0]);
                    return;
                }
                C0691a.m2856a(f4170z[0]);
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public final void m9981b() {
        Context context = getContext();
        if (context != null && (context instanceof Activity)) {
            WindowManager windowManager = ((Activity) context).getWindowManager();
            if (windowManager != null) {
                windowManager.removeView(this);
            }
        }
        if (this.f4172b != null) {
            this.f4172b.m1784a();
        }
    }

    public View makeView() {
        View imageView = new ImageView(C1056i.m7562a());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return imageView;
    }

    public void onAnimationEnd(Animation animation) {
        m9981b();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9977c();
    }
}
