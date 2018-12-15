package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1343g;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1359y;
import java.util.LinkedList;
import java.util.List;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.x */
final class C1084x implements Cloneable {
    /* renamed from: E */
    static final long f3244E = 131072;
    /* renamed from: F */
    static final long f3245F = 16;
    /* renamed from: G */
    static final long f3246G = 512;
    /* renamed from: H */
    static final long f3247H = 32768;
    /* renamed from: I */
    public static final int f3248I = 1;
    /* renamed from: J */
    static final long f3249J = 128;
    /* renamed from: L */
    static final long f3250L = 65536;
    /* renamed from: M */
    static final long f3251M = 1024;
    /* renamed from: N */
    static final long f3252N = 256;
    /* renamed from: O */
    static final long f3253O = 8;
    /* renamed from: R */
    static final long f3254R = 2048;
    /* renamed from: W */
    static final long f3255W = 1;
    /* renamed from: X */
    private static final String f3256X = C1084x.m7862z(C1084x.m7863z(":o_\u0012o\u0000kM\u0011ySfJ]\u001fmA\u0018nSnJ]o\u0007{C\u00182"));
    /* renamed from: a */
    static final long f3257a = 16384;
    /* renamed from: c */
    static final long f3258c = 1048576;
    /* renamed from: d */
    public static final String f3259d = C1084x.m7862z(C1084x.m7863z("\u0000cA\u000e1\u0000g]\u0014z"));
    /* renamed from: f */
    static final long f3260f = 32;
    /* renamed from: g */
    static final long f3261g = 524288;
    /* renamed from: h */
    public static final int f3262h = 700;
    /* renamed from: j */
    static final long f3263j = 4096;
    /* renamed from: k */
    static final long f3264k = 8192;
    /* renamed from: n */
    static final long f3265n = 262144;
    /* renamed from: o */
    private static C1084x f3266o = null;
    /* renamed from: r */
    static final long f3267r = 2;
    /* renamed from: s */
    static final long f3268s = 4;
    /* renamed from: t */
    public static final int f3269t = 400;
    /* renamed from: u */
    static final long f3270u = 64;
    /* renamed from: y */
    public static final int f3271y = -1;
    /* renamed from: A */
    float f3272A;
    /* renamed from: B */
    C1063b[] f3273B;
    /* renamed from: C */
    boolean f3274C;
    /* renamed from: D */
    List<String> f3275D;
    /* renamed from: K */
    C1063b f3276K;
    /* renamed from: P */
    int f3277P;
    /* renamed from: Q */
    C1359y f3278Q;
    /* renamed from: S */
    C1064c f3279S;
    /* renamed from: T */
    C1064c f3280T;
    /* renamed from: U */
    C1063b f3281U;
    /* renamed from: V */
    C1064c f3282V;
    /* renamed from: b */
    float f3283b;
    /* renamed from: e */
    long f3284e = 0;
    /* renamed from: i */
    C1064c f3285i;
    /* renamed from: l */
    C1343g f3286l;
    /* renamed from: m */
    int f3287m;
    /* renamed from: p */
    float f3288p;
    /* renamed from: q */
    boolean f3289q;
    /* renamed from: v */
    C1063b f3290v;
    /* renamed from: w */
    int f3291w;
    /* renamed from: x */
    float f3292x;
    /* renamed from: z */
    float f3293z;

    C1084x() {
    }

    /* renamed from: c */
    static final C1084x m7861c() {
        if (f3266o == null) {
            f3266o = new C1084x();
            f3266o.f3284e = -1;
            f3266o.f3280T = C1079s.a;
            f3266o.f3288p = 1.0f;
            f3266o.f3279S = null;
            f3266o.f3292x = 1.0f;
            f3266o.f3290v = new C1063b(1.0f);
            f3266o.f3286l = C1343g.BUTT;
            f3266o.f3278Q = C1359y.MITER;
            f3266o.f3272A = 4.0f;
            f3266o.f3273B = null;
            f3266o.f3281U = new C1063b(0.0f);
            f3266o.f3293z = 1.0f;
            f3266o.f3285i = C1079s.a;
            f3266o.f3275D = null;
            f3266o.f3276K = new C1063b(12.0f, C1069h.pt);
            f3266o.f3287m = f3269t;
            f3266o.f3291w = 0;
            f3266o.f3277P = 0;
            f3266o.f3289q = true;
            f3266o.f3274C = true;
            f3266o.f3282V = C1079s.a;
            f3266o.f3283b = 1.0f;
        }
        return f3266o;
    }

    /* renamed from: z */
    private static String m7862z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 115;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 47;
                    break;
                case 3:
                    i2 = 125;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7863z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final void m7864a(float f) {
        this.f3272A = f;
        this.f3284e |= 128;
    }

    /* renamed from: a */
    public final void m7865a(int i) {
        this.f3287m = i;
        this.f3284e |= 16384;
    }

    /* renamed from: a */
    public final void m7866a(C1063b c1063b) {
        this.f3290v = c1063b;
        this.f3284e |= 16;
    }

    /* renamed from: a */
    public final void m7867a(C1064c c1064c) {
        this.f3282V = c1064c;
        this.f3284e |= 524288;
    }

    /* renamed from: a */
    public final void m7868a(C1343g c1343g) {
        this.f3286l = c1343g;
        this.f3284e |= 32;
    }

    /* renamed from: a */
    public final void m7869a(C1359y c1359y) {
        this.f3278Q = c1359y;
        this.f3284e |= 64;
    }

    /* renamed from: a */
    public final void m7870a(List<String> list) {
        this.f3275D = list;
        this.f3284e |= 4096;
    }

    /* renamed from: a */
    public final void m7871a(List<String> list, int i, C1063b c1063b, int i2) {
        this.f3275D = list;
        this.f3291w = i;
        this.f3287m = i2;
        this.f3276K = c1063b;
        this.f3284e |= 61440;
    }

    /* renamed from: a */
    public final void m7872a(boolean z) {
        this.f3274C = z;
        this.f3284e |= 262144;
    }

    /* renamed from: a */
    public final void m7873a(C1063b[] c1063bArr) {
        this.f3273B = c1063bArr;
        this.f3284e |= 256;
    }

    /* renamed from: a */
    public final boolean m7874a() {
        return this == f3266o;
    }

    /* renamed from: a */
    public final boolean m7875a(long j) {
        return (this.f3284e & j) != 0;
    }

    /* renamed from: b */
    public void m7876b() {
        if (!m7874a()) {
            if (this.f3280T != null) {
                this.f3280T.mo3340a();
                this.f3280T = null;
            }
            if (this.f3279S != null) {
                this.f3279S.mo3340a();
                this.f3279S = null;
            }
            if (this.f3290v != null) {
                this.f3290v.m7605a();
                this.f3290v = null;
            }
            this.f3286l = null;
            this.f3278Q = null;
            this.f3273B = null;
            this.f3281U = null;
            if (this.f3275D != null) {
                this.f3275D.clear();
                this.f3275D = null;
            }
            if (this.f3276K != null) {
                this.f3276K.m7605a();
                this.f3276K = null;
            }
            if (this.f3282V != null) {
                this.f3282V.mo3340a();
                this.f3282V = null;
            }
        }
    }

    /* renamed from: b */
    public final void m7877b(float f) {
        this.f3283b = f;
        this.f3284e |= 1048576;
    }

    /* renamed from: b */
    public final void m7878b(int i) {
        this.f3291w = i;
        this.f3284e |= 32768;
    }

    /* renamed from: b */
    public final void m7879b(C1063b c1063b) {
        this.f3276K = c1063b;
        this.f3284e |= 8192;
    }

    /* renamed from: b */
    public final void m7880b(C1064c c1064c) {
        this.f3279S = c1064c;
        this.f3284e |= 4;
    }

    /* renamed from: b */
    public final void m7881b(boolean z) {
        this.f3289q = z;
        this.f3284e |= 131072;
    }

    /* renamed from: c */
    public final void m7882c(float f) {
        this.f3292x = f;
        this.f3284e |= 8;
    }

    /* renamed from: c */
    public final void m7883c(int i) {
        this.f3277P = i;
        this.f3284e |= 65536;
    }

    /* renamed from: c */
    public final void m7884c(C1063b c1063b) {
        this.f3281U = c1063b;
        this.f3284e |= 512;
    }

    /* renamed from: c */
    public final void m7885c(C1064c c1064c) {
        this.f3285i = c1064c;
        this.f3284e |= 2048;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            C1084x c1084x = (C1084x) super.clone();
            if (this.f3273B != null) {
                c1084x.f3273B = (C1063b[]) this.f3273B.clone();
            }
            if (this.f3275D == null) {
                return c1084x;
            }
            c1084x.f3275D = new LinkedList(this.f3275D);
            return c1084x;
        } catch (CloneNotSupportedException e) {
            throw e;
        } catch (CloneNotSupportedException e2) {
            throw e2;
        } catch (Exception e3) {
            C0691a.m2857a(f3256X, e3);
            return new C1084x();
        }
    }

    /* renamed from: d */
    public final void m7886d() {
        this.f3289q = true;
        this.f3293z = 1.0f;
        this.f3282V = C1079s.a;
        this.f3283b = 1.0f;
    }

    /* renamed from: d */
    public final void m7887d(float f) {
        this.f3293z = f;
        this.f3284e |= 1024;
    }

    /* renamed from: d */
    public final void m7888d(C1064c c1064c) {
        this.f3280T = c1064c;
        this.f3284e |= 1;
    }

    /* renamed from: e */
    public final void m7889e(float f) {
        this.f3288p = f;
        this.f3284e |= 2;
    }
}
