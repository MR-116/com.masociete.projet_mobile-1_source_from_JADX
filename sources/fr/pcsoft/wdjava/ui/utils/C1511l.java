package fr.pcsoft.wdjava.ui.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.utils.jc;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.ui.utils.l */
public class C1511l {
    /* renamed from: a */
    public static final int f4627a = 4;
    /* renamed from: b */
    public static final int f4628b = C1511l.m10518a(6.0f, 2, f4647u);
    /* renamed from: c */
    public static final int f4629c = C1511l.m10518a(10.0f, 2, f4647u);
    /* renamed from: d */
    public static final int f4630d = C1511l.m10518a(40.0f, 2, f4647u);
    /* renamed from: e */
    public static final int f4631e = 160;
    /* renamed from: f */
    public static final int f4632f = C1511l.m10518a(1.0f, 2, f4647u);
    /* renamed from: g */
    public static final int f4633g = 1;
    /* renamed from: h */
    public static final int f4634h = 3;
    /* renamed from: i */
    public static final int f4635i = C1511l.m10518a(9.0f, 2, f4647u);
    /* renamed from: j */
    public static final int f4636j = C1511l.m10518a(8.0f, 2, f4647u);
    /* renamed from: k */
    public static final int f4637k = C1511l.m10518a(4.0f, 2, f4647u);
    /* renamed from: l */
    public static final int f4638l = C1511l.m10518a(7.0f, 2, f4647u);
    /* renamed from: m */
    public static final int f4639m = C1511l.m10518a(30.0f, 2, f4647u);
    /* renamed from: n */
    public static final int f4640n = C1511l.m10518a(50.0f, 2, f4647u);
    /* renamed from: o */
    public static final int f4641o = C1511l.m10518a(3.0f, 2, f4647u);
    /* renamed from: p */
    public static final int f4642p = 2;
    /* renamed from: q */
    public static final int f4643q = C1511l.m10518a((float) ViewConfiguration.getTouchSlop(), 2, f4647u);
    /* renamed from: r */
    public static final int f4644r = C1511l.m10518a(2.0f, 2, f4647u);
    /* renamed from: s */
    public static final int f4645s = C1511l.m10518a(5.0f, 2, f4647u);
    /* renamed from: t */
    public static final int f4646t = C1511l.m10518a(20.0f, 2, f4647u);
    /* renamed from: u */
    private static final DisplayMetrics f4647u = Resources.getSystem().getDisplayMetrics();
    /* renamed from: z */
    private static final String[] f4648z = new String[]{C1511l.m10535z(C1511l.m10536z("|d\u0004^!\u0019k\u0003I1\u0019c\t\u001b.X'\u001eÒ!LwI#Mn\u0003Ub]bLW#\u0019o\rN6\\r\u001e\u001b&\\'\u0000Zb[f\u001eI'\u0019t\u0015H6Ñj\t\u0015")), C1511l.m10535z(C1511l.m10536z("Js\rO7JX\u000eZ0fo\tR%Qs")), C1511l.m10535z(C1511l.m10536z("Zh\u0001\u0015#Wc\u001eT+])\u0005U6\\u\u0002Z.\u0017UH_+Tb\u0002")), C1511l.m10535z(C1511l.m10536z("li\u0005O«\u0019i\u0003UbJr\u001cK-Ks^l")), C1511l.m10535z(C1511l.m10536z("ufLV'Mo\u0003_'\u0019`\tO\u0010Vs\rO+ViLUeX'\u001cZ1\u0019î\u0018ÒbMu\u0003N4ÐbB")), C1511l.m10535z(C1511l.m10536z("^b\u0018i-Mf\u0018R-W"))};

    /* renamed from: a */
    public static final float m10514a(float f, int i) {
        C0508h h = WDAppelContexte.getContexte().m2722h();
        int displayUnit = h != null ? h.getDisplayUnit() : WDProjet.getInstance().isUniteAffichageLogique() ? 2 : 1;
        return i != displayUnit ? C1511l.m10515a(f, i, displayUnit) : f;
    }

    /* renamed from: a */
    public static final float m10515a(float f, int i, int i2) {
        return C1511l.m10516a(f, i, i2, f4647u);
    }

    /* renamed from: a */
    public static final float m10516a(float f, int i, int i2, DisplayMetrics displayMetrics) {
        switch (i2) {
            case 1:
                return (float) Math.round((float) C1511l.m10518a(f, i, f4647u));
            case 2:
                return (float) Math.round(C1511l.m10530d(f, i, f4647u));
            case 3:
                return (float) C1511l.m10518a(f, i, f4647u);
            case 4:
                return (float) Math.round(C1511l.m10523b(f, i, f4647u));
            default:
                C0691a.m2856a(f4648z[3]);
                return f;
        }
    }

    /* renamed from: a */
    public static final int m10517a() {
        try {
            Field field = Class.forName(f4648z[2]).getField(f4648z[1]);
            if (field != null) {
                field.setAccessible(true);
                return Resources.getSystem().getDimensionPixelSize(field.getInt(null));
            }
        } catch (Exception e) {
            C0691a.m2856a(f4648z[0]);
        }
        return 25;
    }

    /* renamed from: a */
    public static final int m10518a(float f, int i, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
                return (int) Math.floor((double) f);
            case 2:
                return (int) Math.floor((double) (displayMetrics.density * f));
            case 3:
                return (int) Math.floor((double) ((displayMetrics.xdpi * f) * 0.013888889f));
            case 4:
                return (int) Math.floor((double) (displayMetrics.scaledDensity * f));
            default:
                C0691a.m2856a(f4648z[3]);
                return (int) f;
        }
    }

    /* renamed from: a */
    public static final int m10519a(Activity activity) {
        if (kb.m3986p() >= C0657a.FROYO.getNumero()) {
            try {
                switch (((Integer) Display.class.getMethod(f4648z[5], new Class[0]).invoke(activity.getWindowManager().getDefaultDisplay(), new Object[0])).intValue()) {
                    case 0:
                        return 0;
                    case 1:
                        return 90;
                    case 2:
                        return 180;
                    case 3:
                        return C0607n.al;
                }
            } catch (Exception e) {
                C0691a.m2857a(f4648z[4], e);
            }
        }
        return C1511l.m10524b(activity) == 2 ? 270 : 0;
    }

    /* renamed from: a */
    public static final int m10520a(Activity activity, int i) {
        int i2 = 1;
        if (i == C0607n.al || i == 90) {
            i2 = 2;
        }
        C1511l.m10525b(activity, i2);
        return C1511l.m10519a(activity);
    }

    /* renamed from: b */
    public static final double m10521b() {
        Point a = C1014a.m7327b().mo3295a(true);
        float f = ((float) a.x) / f4647u.xdpi;
        float f2 = ((float) a.y) / f4647u.ydpi;
        return Math.sqrt(Math.pow((double) f2, 2.0d) + Math.pow((double) f, 2.0d));
    }

    /* renamed from: b */
    public static final float m10522b(float f, int i) {
        return C1511l.m10523b(f, i, f4647u);
    }

    /* renamed from: b */
    public static final float m10523b(float f, int i, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
                return f / displayMetrics.scaledDensity;
            case 2:
                return f * (displayMetrics.density / displayMetrics.scaledDensity);
            case 3:
                return ((displayMetrics.xdpi * f) * 0.013888889f) / displayMetrics.scaledDensity;
            case 4:
                return f;
            default:
                C0691a.m2856a(f4648z[3]);
                return f;
        }
    }

    /* renamed from: b */
    public static final int m10524b(Activity activity) {
        int i = activity.getResources().getConfiguration().orientation;
        if (i != 0) {
            return i;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        i = defaultDisplay.getOrientation();
        return i == 0 ? defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2 : i;
    }

    /* renamed from: b */
    public static final int m10525b(Activity activity, int i) {
        if (i == 2) {
            activity.setRequestedOrientation(6);
        } else {
            activity.setRequestedOrientation(7);
        }
        return C1511l.m10524b(activity);
    }

    /* renamed from: c */
    public static final float m10526c(float f, int i) {
        return C1511l.m10530d(f, i, f4647u);
    }

    /* renamed from: c */
    public static final float m10527c(float f, int i, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
                return f / (displayMetrics.xdpi * 0.013888889f);
            case 2:
                return (displayMetrics.density * f) / (displayMetrics.xdpi * 0.013888889f);
            case 3:
                return f;
            case 4:
                return (displayMetrics.scaledDensity * f) / (displayMetrics.xdpi * 0.013888889f);
            default:
                C0691a.m2856a(f4648z[3]);
                return f;
        }
    }

    /* renamed from: c */
    public static final int m10528c() {
        return f4647u.densityDpi;
    }

    /* renamed from: c */
    public static final void m10529c(Activity activity) {
        int i;
        switch (activity.getRequestedOrientation()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 0;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 8;
                break;
            case 11:
                i = 12;
                break;
            case 12:
                i = 11;
                break;
            default:
                return;
        }
        activity.setRequestedOrientation(i);
    }

    /* renamed from: d */
    public static final float m10530d(float f, int i, DisplayMetrics displayMetrics) {
        switch (i) {
            case 1:
                return f / displayMetrics.density;
            case 2:
                return f;
            case 3:
                return ((displayMetrics.xdpi * f) * 0.013888889f) / displayMetrics.density;
            case 4:
                return f * (displayMetrics.scaledDensity / displayMetrics.density);
            default:
                C0691a.m2856a(f4648z[3]);
                return f;
        }
    }

    /* renamed from: d */
    public static final int m10531d() {
        return kb.m3986p() >= C0657a.HONEYCOMB.getNumero() ? C1511l.m10532d(48.0f, 2) : kb.m3966a(jc.KINDLE_FIRE) ? 60 : 0;
    }

    /* renamed from: d */
    public static final int m10532d(float f, int i) {
        return C1511l.m10518a(f, i, f4647u);
    }

    /* renamed from: e */
    public static final float m10533e(float f, int i) {
        return C1511l.m10527c(f, i, f4647u);
    }

    /* renamed from: e */
    public static final DisplayMetrics m10534e() {
        return f4647u;
    }

    /* renamed from: z */
    private static String m10535z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 108;
                    break;
                case 3:
                    i2 = 59;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10536z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 66);
        }
        return toCharArray;
    }
}
