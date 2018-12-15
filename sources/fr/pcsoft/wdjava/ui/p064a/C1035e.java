package fr.pcsoft.wdjava.ui.p064a;

import android.content.res.ColorStateList;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.a.e */
public class C1035e extends C1034d {
    /* renamed from: s */
    private static C1035e f2986s = null;
    /* renamed from: t */
    private static C1035e f2987t = null;
    /* renamed from: u */
    private static C1035e f2988u = null;
    /* renamed from: v */
    private static C1035e f2989v = null;
    /* renamed from: w */
    private static C1035e f2990w = null;
    /* renamed from: x */
    private static C1035e f2991x = null;

    private C1035e(int i) {
        super(i);
    }

    private C1035e(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: A */
    public static final C1035e m7503A() {
        return C1035e.m7516z();
    }

    /* renamed from: B */
    public static final C1035e m7504B() {
        if (f2986s == null) {
            f2986s = new C1035e(64, 64, 64, 255);
        }
        return f2986s;
    }

    /* renamed from: C */
    public static final C1035e m7505C() {
        return C1035e.m7507E();
    }

    /* renamed from: D */
    public static final C1035e m7506D() {
        return C1035e.m7514x();
    }

    /* renamed from: E */
    public static final C1035e m7507E() {
        if (f2991x == null) {
            f2991x = new C1035e(0, 0, 0, 255);
        }
        return f2991x;
    }

    /* renamed from: F */
    public static final C1035e m7508F() {
        if (f2988u == null) {
            f2988u = new C1035e(128, 128, 128, 255);
        }
        return f2988u;
    }

    /* renamed from: a */
    public static final ColorStateList m7509a(TextView textView) {
        r1 = new int[2][];
        r1[0] = new int[]{16842913};
        r1[1] = new int[0];
        return new ColorStateList(r1, new int[]{-1, textView.getTextColors().getDefaultColor()});
    }

    /* renamed from: b */
    public static C1034d m7510b(int i) {
        return null;
    }

    /* renamed from: c */
    public static C1034d m7511c(int i) {
        return null;
    }

    /* renamed from: v */
    public static final C1035e m7512v() {
        if (f2989v == null) {
            f2989v = new C1035e(10, 36, 106, 255);
        }
        return f2989v;
    }

    /* renamed from: w */
    public static final C1035e m7513w() {
        return C1035e.m7516z();
    }

    /* renamed from: x */
    public static final C1035e m7514x() {
        if (f2987t == null) {
            f2987t = new C1035e(C0607n.Ep, C0607n.qj, C0607n.Dt, 255);
        }
        return f2987t;
    }

    /* renamed from: y */
    public static final C1035e m7515y() {
        return C1035e.m7516z();
    }

    /* renamed from: z */
    public static final C1035e m7516z() {
        if (f2990w == null) {
            f2990w = new C1035e(255, 255, 255, 255);
        }
        return f2990w;
    }

    /* renamed from: a */
    public final boolean mo3314a() {
        return true;
    }
}
