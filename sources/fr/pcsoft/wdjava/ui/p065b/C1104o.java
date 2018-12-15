package fr.pcsoft.wdjava.ui.p065b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.view.View;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p035c.C0665g;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1508i;

/* renamed from: fr.pcsoft.wdjava.ui.b.o */
public class C1104o extends Options implements Cloneable {
    /* renamed from: e */
    public static final int f3333e = 4;
    /* renamed from: i */
    public static final int f3334i = 2;
    /* renamed from: m */
    public static final int f3335m = 16;
    /* renamed from: q */
    public static final int f3336q = 8;
    /* renamed from: s */
    public static final int f3337s = 1;
    /* renamed from: z */
    private static final String f3338z = C1104o.m7980z(C1104o.m7981z("<*X2y\u0006.J1oU#M}i\u0019(F8xU+M.*\u001a7\\4e\u001b4\b9oU$@<x\u0012\"E8d\u0001gL8yU.E<m\u00104\u0006"));
    /* renamed from: a */
    private int f3339a;
    /* renamed from: b */
    public boolean f3340b;
    /* renamed from: c */
    public int f3341c;
    /* renamed from: d */
    public int f3342d;
    /* renamed from: f */
    public boolean f3343f;
    /* renamed from: g */
    public boolean f3344g;
    /* renamed from: h */
    public int f3345h;
    /* renamed from: j */
    private int f3346j;
    /* renamed from: k */
    private boolean f3347k;
    /* renamed from: l */
    public int f3348l;
    /* renamed from: n */
    public int f3349n;
    /* renamed from: o */
    private boolean f3350o;
    /* renamed from: p */
    private int f3351p;
    /* renamed from: r */
    public int f3352r;

    public C1104o() {
        this.f3340b = true;
        this.f3344g = false;
        this.f3339a = -1;
        this.f3351p = -1;
        this.f3350o = false;
        this.f3341c = 1;
        this.f3342d = 0;
        this.f3347k = false;
        this.f3343f = false;
        this.f3352r = 0;
        this.f3348l = -1;
        this.f3345h = 1;
        this.f3349n = 1;
        this.f3346j = 0;
        this.inScaled = false;
    }

    /* renamed from: a */
    private final boolean m7979a() {
        return this.f3350o && this.f3339a > 0 && this.f3351p > 0 && this.f3345h == 1 && this.f3349n == 1;
    }

    static boolean access$000(C1104o c1104o) {
        return c1104o.f3350o;
    }

    static boolean access$002(C1104o c1104o, boolean z) {
        c1104o.f3350o = z;
        return z;
    }

    static int access$100(C1104o c1104o) {
        return c1104o.f3339a;
    }

    static int access$200(C1104o c1104o) {
        return c1104o.f3351p;
    }

    static boolean access$300(C1104o c1104o) {
        return c1104o.m7979a();
    }

    /* renamed from: z */
    private static String m7980z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 117;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 40;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7981z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 10);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public Bitmap m7982a(Bitmap bitmap) {
        if (bitmap == null || !m7990b()) {
            return bitmap;
        }
        if (this.f3341c != 1) {
            bitmap = C1508i.m10493b(bitmap, this.f3341c);
        }
        if (this.f3342d != 0) {
            bitmap = C1508i.m10474a(bitmap, this.f3342d);
        }
        if (this.f3347k && !bitmap.isMutable()) {
            bitmap = C1508i.m10498d(bitmap);
        }
        return (!this.f3343f || this.f3352r <= 0) ? bitmap : C1098i.m7961a(bitmap, this.f3352r);
    }

    /* renamed from: a */
    public final void m7983a(int i, int i2) {
        this.f3346j |= 16;
        m7984a(i, i2, false);
        this.f3340b = false;
    }

    /* renamed from: a */
    public final void m7984a(int i, int i2, boolean z) {
        this.f3339a = i;
        this.f3351p = i2;
        this.f3350o = z;
    }

    /* renamed from: a */
    public final void m7985a(int i, boolean z) {
        if (z) {
            this.f3346j |= i;
        } else {
            this.f3346j &= i ^ -1;
        }
    }

    /* renamed from: a */
    public final void m7986a(View view, boolean z) {
        this.f3339a = C1503b.m10442b(view);
        this.f3351p = C1503b.m10449c(view);
        this.f3350o = z;
    }

    /* renamed from: a */
    public final void m7987a(boolean z) {
        this.f3347k = z;
        try {
            C1014a.m7327b().mo3288a((Options) this, this.f3347k);
        } catch (C0665g e) {
        }
    }

    /* renamed from: a */
    public final boolean m7988a(int i) {
        return (this.f3346j & i) == i;
    }

    /* renamed from: b */
    public final void m7989b(boolean z) {
        if (WDProjet.getInstance().isVersionCompatible(C0657a.ECLAIR.getNumero())) {
            this.f3343f = z;
        }
    }

    /* renamed from: b */
    public final boolean m7990b() {
        return (this.f3341c != 1 || this.f3342d != 0 || m7979a() || this.f3347k || this.f3343f) ? true : (this.inDensity == 0 || this.inDensity == this.inTargetDensity || !this.inScaled) ? false : true;
    }

    /* renamed from: c */
    public final C1104o m7991c() {
        try {
            return (C1104o) clone();
        } catch (Exception e) {
            C0691a.m2857a(f3338z, e);
            return null;
        }
    }

    /* renamed from: d */
    public void m7992d() {
        if (this.outHeight > this.f3339a || this.outWidth > this.f3351p) {
            this.inSampleSize = Math.max(Math.round(((float) this.outHeight) / ((float) this.f3351p)), Math.round(((float) this.outWidth) / ((float) this.f3339a)));
        }
    }
}
