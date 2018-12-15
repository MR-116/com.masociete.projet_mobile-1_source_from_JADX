package p000a.p001a.p002a.p022f.p025c;

import java.util.Formatter;
import p000a.p001a.p002a.p022f.C0170d;

/* renamed from: a.a.a.f.c.k */
final class C0167k {
    /* renamed from: a */
    private static final int f639a = 2;
    /* renamed from: z */
    private static final String[] f640z = new String[]{C0167k.m1032z(C0167k.m1033z("\u001fp$:M\u001afs")), C0167k.m1032z(C0167k.m1033z("|\u00027{\u0002[o")), C0167k.m1032z(C0167k.m1033z("\u001fu7~M\u001fu7")), C0167k.m1032z(C0167k.m1033z("\u001a;"))};
    /* renamed from: b */
    private C0164h f641b;
    /* renamed from: c */
    private final C0169m f642c;
    /* renamed from: d */
    private final C0160d[] f643d = new C0160d[(this.f644e + 2)];
    /* renamed from: e */
    private final int f644e;

    C0167k(C0169m c0169m, C0164h c0164h) {
        this.f642c = c0169m;
        this.f644e = c0169m.m1047c();
        this.f641b = c0164h;
    }

    /* renamed from: a */
    private static int m1023a(int i, int i2, C0163g c0163g) {
        if (c0163g == null || c0163g.m1006f()) {
            return i2;
        }
        if (!c0163g.m1002b(i)) {
            return i2 + 1;
        }
        c0163g.m1000a(i);
        return 0;
    }

    /* renamed from: a */
    private void m1024a(int i, int i2, C0163g[] c0163gArr) {
        C0163g c0163g = c0163gArr[i2];
        C0163g[] a = this.f643d[i - 1].m981a();
        C0163g[] a2 = this.f643d[i + 1] != null ? this.f643d[i + 1].m981a() : a;
        C0163g[] c0163gArr2 = new C0163g[14];
        c0163gArr2[2] = a[i2];
        c0163gArr2[3] = a2[i2];
        if (i2 > 0) {
            c0163gArr2[0] = c0163gArr[i2 - 1];
            c0163gArr2[4] = a[i2 - 1];
            c0163gArr2[5] = a2[i2 - 1];
        }
        if (i2 > 1) {
            c0163gArr2[8] = c0163gArr[i2 - 2];
            c0163gArr2[10] = a[i2 - 2];
            c0163gArr2[11] = a2[i2 - 2];
        }
        if (i2 < c0163gArr.length - 1) {
            c0163gArr2[1] = c0163gArr[i2 + 1];
            c0163gArr2[6] = a[i2 + 1];
            c0163gArr2[7] = a2[i2 + 1];
        }
        if (i2 < c0163gArr.length - 2) {
            c0163gArr2[9] = c0163gArr[i2 + 2];
            c0163gArr2[12] = a[i2 + 2];
            c0163gArr2[13] = a2[i2 + 2];
        }
        int length = c0163gArr2.length;
        int i3 = 0;
        while (i3 < length && !C0167k.m1026a(c0163g, c0163gArr2[i3])) {
            i3++;
        }
    }

    /* renamed from: a */
    private void m1025a(C0160d c0160d) {
        if (c0160d != null) {
            ((C0161e) c0160d).m990b(this.f642c);
        }
    }

    /* renamed from: a */
    private static boolean m1026a(C0163g c0163g, C0163g c0163g2) {
        if (c0163g2 == null || !c0163g2.m1006f() || c0163g2.m1001b() != c0163g.m1001b()) {
            return false;
        }
        c0163g.m1000a(c0163g2.m999a());
        return true;
    }

    /* renamed from: c */
    private void m1027c() {
        int i = 0;
        if (this.f643d[0] != null && this.f643d[this.f644e + 1] != null) {
            C0163g[] a = this.f643d[0].m981a();
            C0163g[] a2 = this.f643d[this.f644e + 1].m981a();
            while (i < a.length) {
                if (!(a[i] == null || a2[i] == null || a[i].m999a() != a2[i].m999a())) {
                    for (int i2 = 1; i2 <= this.f644e; i2++) {
                        C0163g c0163g = this.f643d[i2].m981a()[i];
                        if (c0163g != null) {
                            c0163g.m1000a(a[i].m999a());
                            if (!c0163g.m1006f()) {
                                this.f643d[i2].m981a()[i] = null;
                            }
                        }
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: d */
    private int m1028d() {
        if (this.f643d[0] == null) {
            return 0;
        }
        C0163g[] a = this.f643d[0].m981a();
        int i = 0;
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] != null) {
                int a2 = a[i2].m999a();
                int i3 = i;
                int i4 = 0;
                for (i = 1; i < this.f644e + 1 && i4 < 2; i++) {
                    C0163g c0163g = this.f643d[i].m981a()[i2];
                    if (c0163g != null) {
                        i4 = C0167k.m1023a(a2, i4, c0163g);
                        if (!c0163g.m1006f()) {
                            i3++;
                        }
                    }
                }
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: e */
    private int m1029e() {
        m1027c();
        return m1028d() + m1031i();
    }

    /* renamed from: g */
    private int m1030g() {
        int e = m1029e();
        if (e == 0) {
            return 0;
        }
        for (int i = 1; i < this.f644e + 1; i++) {
            C0163g[] a = this.f643d[i].m981a();
            int i2 = 0;
            while (i2 < a.length) {
                if (!(a[i2] == null || a[i2].m1006f())) {
                    m1024a(i, i2, a);
                }
                i2++;
            }
        }
        return e;
    }

    /* renamed from: i */
    private int m1031i() {
        if (this.f643d[this.f644e + 1] == null) {
            return 0;
        }
        C0163g[] a = this.f643d[this.f644e + 1].m981a();
        int i = 0;
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] != null) {
                int a2 = a[i2].m999a();
                int i3 = i;
                i = 0;
                for (int i4 = this.f644e + 1; i4 > 0 && i < 2; i4--) {
                    C0163g c0163g = this.f643d[i4].m981a()[i2];
                    if (c0163g != null) {
                        i = C0167k.m1023a(a2, i, c0163g);
                        if (!c0163g.m1006f()) {
                            i3++;
                        }
                    }
                }
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: z */
    private static String m1032z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 85;
                    break;
                case 2:
                    i2 = 23;
                    break;
                case 3:
                    i2 = 94;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1033z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 49);
        }
        return toCharArray;
    }

    /* renamed from: a */
    C0160d m1034a(int i) {
        return this.f643d[i];
    }

    /* renamed from: a */
    C0164h m1035a() {
        return this.f641b;
    }

    /* renamed from: a */
    void m1036a(int i, C0160d c0160d) {
        this.f643d[i] = c0160d;
    }

    /* renamed from: a */
    public void m1037a(C0164h c0164h) {
        this.f641b = c0164h;
    }

    /* renamed from: b */
    int m1038b() {
        return this.f642c.m1046b();
    }

    /* renamed from: f */
    int m1039f() {
        return this.f642c.m1048d();
    }

    /* renamed from: h */
    C0160d[] m1040h() {
        m1025a(this.f643d[0]);
        m1025a(this.f643d[this.f644e + 1]);
        int i = C0170d.f651a;
        while (true) {
            int g = m1030g();
            if (g > 0 && g < r0) {
                i = g;
            }
        }
        return this.f643d;
    }

    /* renamed from: j */
    int m1041j() {
        return this.f644e;
    }

    public String toString() {
        C0160d c0160d = this.f643d[0];
        if (c0160d == null) {
            c0160d = this.f643d[this.f644e + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c0160d.m981a().length; i++) {
            formatter.format(f640z[1], new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f644e + 2; i2++) {
                if (this.f643d[i2] == null) {
                    formatter.format(f640z[2], new Object[0]);
                } else {
                    if (this.f643d[i2].m981a()[i] == null) {
                        formatter.format(f640z[2], new Object[0]);
                    } else {
                        formatter.format(f640z[0], new Object[]{Integer.valueOf(r5.m999a()), Integer.valueOf(r5.m1004d())});
                    }
                }
            }
            formatter.format(f640z[3], new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
