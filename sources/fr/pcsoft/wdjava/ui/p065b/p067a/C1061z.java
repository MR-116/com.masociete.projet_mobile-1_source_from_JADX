package fr.pcsoft.wdjava.ui.p065b.p067a;

import android.graphics.Path;
import android.graphics.RectF;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.z */
public abstract class C1061z extends C1060y {
    /* renamed from: z */
    private static final String[] f3067z = new String[]{C1061z.m7580z(C1061z.m7581z(" b0g\u0019\u0003c05")), C1061z.m7580z(C1061z.m7581z("Ax+{P\u0012c4e\u001f\u0013b­5\u0000\u0000ddyWz­x\u0015\u000fbdF&&6 pP\u0015o4pP"))};
    /* renamed from: b */
    private RectF f3068b = null;
    /* renamed from: c */
    private String f3069c = null;
    /* renamed from: d */
    private C1084x f3070d = null;

    /* renamed from: z */
    private static String m7580z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 22;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 21;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7581z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 112);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3327a() {
        super.mo3327a();
        this.f3069c = null;
        if (this.f3070d != null) {
            this.f3070d.m7876b();
            this.f3070d = null;
        }
    }

    /* renamed from: a */
    public final void m7583a(RectF rectF) {
        this.f3068b = rectF;
    }

    /* renamed from: a */
    public void mo3339a(C1068g c1068g, float f) throws C1066d {
        C0691a.m2856a(f3067z[0] + c1068g.name() + f3067z[1] + getClass().getName());
    }

    /* renamed from: a */
    public void mo3343a(C1068g c1068g, Path path) throws C1066d {
        C0691a.m2856a(f3067z[0] + c1068g.name() + f3067z[1] + getClass().getName());
    }

    /* renamed from: a */
    public void mo3333a(C1068g c1068g, RectF rectF) throws C1066d {
        C0691a.m2856a(f3067z[0] + c1068g.name() + f3067z[1] + getClass().getName());
    }

    /* renamed from: a */
    public void mo3334a(C1068g c1068g, C1063b c1063b) throws C1066d {
        C0691a.m2856a(f3067z[0] + c1068g.name() + f3067z[1] + getClass().getName());
    }

    /* renamed from: a */
    public void mo3335a(C1068g c1068g, String str) throws C1066d {
        C0691a.m2856a(f3067z[0] + c1068g.name() + f3067z[1] + getClass().getName());
    }

    /* renamed from: a */
    public final void m7589a(String str) {
        this.f3069c = str;
    }

    /* renamed from: g */
    public final RectF m7590g() {
        return this.f3068b;
    }

    /* renamed from: h */
    public final C1084x m7591h() {
        return this.f3070d;
    }

    /* renamed from: i */
    public final C1084x m7592i() {
        if (this.f3070d == null) {
            this.f3070d = new C1084x();
        }
        return this.f3070d;
    }

    /* renamed from: j */
    public final String m7593j() {
        return this.f3069c;
    }
}
