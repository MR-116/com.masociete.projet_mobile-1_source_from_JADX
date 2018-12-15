package p000a.p001a.p002a.p007b.p010c;

import fr.pcsoft.wdjava.core.C0607n;
import p000a.p001a.p002a.p007b.p008a.C0046o;
import p000a.p001a.p002a.p007b.p008a.C0048q;
import p000a.p001a.p002a.p007b.p008a.C0049r;

/* renamed from: a.a.a.b.c.f */
public final class C0066f {
    /* renamed from: c */
    public static final int f190c = 8;
    /* renamed from: z */
    private static final String[] f191z = new String[]{C0066f.m392z(C0066f.m393z("P+-LEJf")), C0066f.m392z(C0066f.m393z("zf/IT\u0002/:\u0012\u0000\u001e3.D*")), C0066f.m392z(C0066f.m393z("LzH")), C0066f.m392z(C0066f.m393z("zf4MR\u0003/-F\u001aP")), C0066f.m392z(C0066f.m393z("zf/IT\u0002/:\u0012*")), C0066f.m392z(C0066f.m393z("zf'Kl\u00150'D\u001aP")), C0066f.m392z(C0066f.m393z("NxH")), C0066f.m392z(C0066f.m393z("zf/IS\u001b\u0016#\\T\u00154,\u0012\u0000"))};
    /* renamed from: a */
    private int f192a = -1;
    /* renamed from: b */
    private C0061a f193b;
    /* renamed from: d */
    private C0046o f194d;
    /* renamed from: e */
    private C0048q f195e;
    /* renamed from: f */
    private C0049r f196f;

    /* renamed from: b */
    public static boolean m391b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: z */
    private static String m392z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 70;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 40;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m393z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0048q m394a() {
        return this.f195e;
    }

    /* renamed from: a */
    public void m395a(int i) {
        this.f192a = i;
    }

    /* renamed from: a */
    public void m396a(C0046o c0046o) {
        this.f194d = c0046o;
    }

    /* renamed from: a */
    public void m397a(C0048q c0048q) {
        this.f195e = c0048q;
    }

    /* renamed from: a */
    public void m398a(C0049r c0049r) {
        this.f196f = c0049r;
    }

    /* renamed from: a */
    public void m399a(C0061a c0061a) {
        this.f193b = c0061a;
    }

    /* renamed from: b */
    public C0061a m400b() {
        return this.f193b;
    }

    /* renamed from: c */
    public C0049r m401c() {
        return this.f196f;
    }

    /* renamed from: d */
    public int m402d() {
        return this.f192a;
    }

    /* renamed from: e */
    public C0046o m403e() {
        return this.f194d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(C0607n.Dt);
        stringBuilder.append(f191z[2]);
        stringBuilder.append(f191z[0]);
        stringBuilder.append(this.f195e);
        stringBuilder.append(f191z[5]);
        stringBuilder.append(this.f194d);
        stringBuilder.append(f191z[3]);
        stringBuilder.append(this.f196f);
        stringBuilder.append(f191z[7]);
        stringBuilder.append(this.f192a);
        if (this.f193b == null) {
            stringBuilder.append(f191z[1]);
        } else {
            stringBuilder.append(f191z[4]);
            stringBuilder.append(this.f193b);
        }
        stringBuilder.append(f191z[6]);
        return stringBuilder.toString();
    }
}
