package p000a.p001a.p002a.p022f.p025c;

import java.util.Formatter;

/* renamed from: a.a.a.f.c.d */
class C0160d {
    /* renamed from: a */
    private static final int f615a = 5;
    /* renamed from: z */
    private static final String[] f616z = new String[]{C0160d.m977z(C0160d.m978z("sMRh\u0018v^\u0016.\u0018v^\u0013<")), C0160d.m977z(C0160d.m978z("sMRh\u0018sMR.\u001de\u001a\u0013<"))};
    /* renamed from: b */
    private final C0163g[] f617b;
    /* renamed from: c */
    private final C0164h f618c;

    C0160d(C0164h c0164h) {
        this.f618c = new C0164h(c0164h);
        this.f617b = new C0163g[((c0164h.m1016d() - c0164h.m1018g()) + 1)];
    }

    /* renamed from: z */
    private static String m977z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 86;
                    break;
                case 1:
                    i2 = 126;
                    break;
                case 2:
                    i2 = 54;
                    break;
                case 3:
                    i2 = 82;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m978z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final C0163g m979a(int i) {
        return this.f617b[m984c(i)];
    }

    /* renamed from: a */
    final void m980a(int i, C0163g c0163g) {
        this.f617b[m984c(i)] = c0163g;
    }

    /* renamed from: a */
    final C0163g[] m981a() {
        return this.f617b;
    }

    /* renamed from: b */
    final C0163g m982b(int i) {
        C0163g a = m979a(i);
        if (a != null) {
            return a;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int c = m984c(i) - i2;
            if (c >= 0) {
                a = this.f617b[c];
                if (a != null) {
                    return a;
                }
            }
            c = m984c(i) + i2;
            if (c < this.f617b.length) {
                a = this.f617b[c];
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    final C0164h m983b() {
        return this.f618c;
    }

    /* renamed from: c */
    final int m984c(int i) {
        return i - this.f618c.m1018g();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        C0163g[] c0163gArr = this.f617b;
        int length = c0163gArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            C0163g c0163g = c0163gArr[i];
            if (c0163g == null) {
                String str = f616z[0];
                Object[] objArr = new Object[1];
                i3 = i2 + 1;
                objArr[0] = Integer.valueOf(i2);
                formatter.format(str, objArr);
            } else {
                String str2 = f616z[1];
                r9 = new Object[3];
                i3 = i2 + 1;
                r9[0] = Integer.valueOf(i2);
                r9[1] = Integer.valueOf(c0163g.m999a());
                r9[2] = Integer.valueOf(c0163g.m1004d());
                formatter.format(str2, r9);
            }
            i++;
            i2 = i3;
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
