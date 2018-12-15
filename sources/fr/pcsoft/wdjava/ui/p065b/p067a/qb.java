package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Path;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.qb */
final class qb extends mb {
    /* renamed from: A */
    private static final String[] f3190A = new String[]{qb.m7776z(qb.m7777z("4\fkhY\u0017\rk:^\u001a\u0016?iE\u0005\bphDX%:")), qb.m7776z(qb.m7777z("9\u0017q}E\u0010\rm:T\u0010Xo{D\u001dXqóW\u0014\fvlUU\u0011qnU\u0007\u001cvnU["))};
    /* renamed from: f */
    public static final char f3191f = 'c';
    /* renamed from: g */
    public static final char f3192g = 'Z';
    /* renamed from: h */
    public static final char f3193h = 'h';
    /* renamed from: i */
    public static final char f3194i = 's';
    /* renamed from: j */
    public static final char f3195j = 'A';
    /* renamed from: k */
    public static final char f3196k = 'z';
    /* renamed from: l */
    public static final char f3197l = 'L';
    /* renamed from: m */
    public static final char f3198m = 'm';
    /* renamed from: n */
    public static final char f3199n = 'V';
    /* renamed from: p */
    public static final char f3200p = 'H';
    /* renamed from: q */
    public static final char f3201q = 'M';
    /* renamed from: r */
    public static final char f3202r = 't';
    /* renamed from: s */
    public static final char f3203s = 'v';
    /* renamed from: t */
    public static final char f3204t = 'T';
    /* renamed from: u */
    public static final char f3205u = 'q';
    /* renamed from: v */
    public static final char f3206v = 'a';
    /* renamed from: w */
    public static final char f3207w = 'l';
    /* renamed from: x */
    public static final char f3208x = 'C';
    /* renamed from: y */
    public static final char f3209y = 'Q';
    /* renamed from: z */
    public static final char f3210z = 'S';
    /* renamed from: o */
    private Path f3211o = null;

    qb() {
    }

    /* renamed from: z */
    private static String m7776z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 117;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 26;
                    break;
                default:
                    i2 = 48;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7777z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 48);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3211o = null;
    }

    /* renamed from: a */
    public void mo3339a(C1068g c1068g, float f) throws C1066d {
        try {
            if (c1068g != C1068g.pathLength) {
                C0691a.m2856a(f3190A[0] + c1068g.name());
            } else if (f < 0.0f) {
                throw new C1066d(f3190A[1]);
            }
        } catch (C1066d e) {
            throw e;
        } catch (C1066d e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo3343a(C1068g c1068g, Path path) throws C1066d {
        try {
            if (c1068g == C1068g.d) {
                this.f3211o = path;
            } else {
                C0691a.m2856a(f3190A[0] + c1068g.name());
            }
        } catch (C1066d e) {
            throw e;
        }
    }

    /* renamed from: d */
    public final Path m7781d() {
        return this.f3211o;
    }
}
