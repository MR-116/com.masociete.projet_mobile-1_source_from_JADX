package fr.pcsoft.wdjava.tlm;

import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.tlm.a */
public class C1028a {
    /* renamed from: z */
    private static final String f2943z = C1028a.m7423z(C1028a.m7424z("\u0017y\u0012eG6lFc])<Vc^)}[r\b±h@c\b»<HïZ42"));
    /* renamed from: a */
    private long f2944a = 0;
    /* renamed from: b */
    private C1029b f2945b = null;
    /* renamed from: c */
    private long f2946c = 0;
    /* renamed from: d */
    private long f2947d = System.nanoTime();
    /* renamed from: e */
    private int f2948e = 0;

    /* renamed from: z */
    private static String m7423z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 91;
                    break;
                case 1:
                    i2 = 28;
                    break;
                case 2:
                    i2 = 50;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7424z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final long m7425a() {
        return this.f2944a;
    }

    /* renamed from: a */
    public void mo3307a(C1029b c1029b) {
        this.f2945b = c1029b;
    }

    /* renamed from: b */
    public C1029b mo3308b() {
        return this.f2945b;
    }

    /* renamed from: c */
    public void m7428c() {
        if (this.f2946c == 0) {
            C0691a.m2860a(this.f2948e == 0, f2943z);
            this.f2946c = System.nanoTime();
        }
        this.f2948e++;
    }

    /* renamed from: d */
    public final long m7429d() {
        return m7430e() - this.f2944a;
    }

    /* renamed from: e */
    public final long m7430e() {
        return (System.nanoTime() - this.f2947d) / 1000000;
    }

    /* renamed from: f */
    public void mo3309f() {
        if (this.f2945b != null) {
            this.f2945b.m7435a(this);
            this.f2945b = null;
        }
    }

    /* renamed from: g */
    public void m7432g() {
        if (this.f2948e != 0) {
            this.f2948e--;
            if (this.f2948e == 0) {
                this.f2944a += (System.nanoTime() - this.f2946c) / 1000000;
                this.f2946c = 0;
            }
        }
    }
}
