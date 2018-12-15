package p000a.p001a.p002a.p022f.p025c;

import p000a.p001a.p002a.eb;

/* renamed from: a.a.a.f.c.e */
final class C0161e extends C0160d {
    /* renamed from: z */
    private static final String f619z = C0161e.m988z(C0161e.m989z("9lK\u001c\u0010\u0004%'"));
    /* renamed from: d */
    private final boolean f620d;

    C0161e(C0164h c0164h, boolean z) {
        super(c0164h);
        this.f620d = z;
    }

    /* renamed from: a */
    private void m985a(C0169m c0169m) {
        C0164h b = m983b();
        eb i = this.f620d ? b.m1020i() : b.m1019h();
        eb e = this.f620d ? b.m1017e() : b.m1014b();
        int c = m984c((int) i.m311a());
        int c2 = m984c((int) e.m311a());
        C0163g[] a = m981a();
        int i2 = -1;
        c = 0;
        int i3 = 1;
        for (int i4 = c; i4 < c2; i4++) {
            if (a[i4] != null) {
                C0163g c0163g = a[i4];
                c0163g.m1007g();
                int a2 = c0163g.m999a() - i2;
                if (a2 == 0) {
                    c++;
                } else if (a2 == 1) {
                    c = Math.max(i3, c);
                    i2 = c0163g.m999a();
                    i3 = c;
                    c = 1;
                } else if (c0163g.m999a() >= c0169m.m1046b()) {
                    a[i4] = null;
                } else {
                    i2 = c0163g.m999a();
                    c = 1;
                }
            }
        }
    }

    /* renamed from: a */
    private void m986a(C0163g[] c0163gArr, C0169m c0169m) {
        for (int i = 0; i < c0163gArr.length; i++) {
            C0163g c0163g = c0163gArr[i];
            if (c0163gArr[i] != null) {
                int d = c0163g.m1004d() % 30;
                int a = c0163g.m999a();
                if (a <= c0169m.m1046b()) {
                    if (!this.f620d) {
                        a += 2;
                    }
                    switch (a % 3) {
                        case 0:
                            if ((d * 3) + 1 == c0169m.m1045a()) {
                                break;
                            }
                            c0163gArr[i] = null;
                            break;
                        case 1:
                            if (d / 3 != c0169m.m1048d() || d % 3 != c0169m.m1049e()) {
                                c0163gArr[i] = null;
                                break;
                            }
                            break;
                            break;
                        case 2:
                            if (d + 1 == c0169m.m1047c()) {
                                break;
                            }
                            c0163gArr[i] = null;
                            break;
                        default:
                            break;
                    }
                }
                c0163gArr[i] = null;
            }
        }
    }

    /* renamed from: c */
    private void m987c() {
        for (C0163g c0163g : m981a()) {
            if (c0163g != null) {
                c0163g.m1007g();
            }
        }
    }

    /* renamed from: z */
    private static String m988z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 31;
                    break;
                case 2:
                    i2 = 7;
                    break;
                case 3:
                    i2 = 121;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m989z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    /* renamed from: b */
    void m990b(C0169m c0169m) {
        C0163g[] a = m981a();
        m987c();
        m986a(a, c0169m);
        C0164h b = m983b();
        eb i = this.f620d ? b.m1020i() : b.m1019h();
        eb e = this.f620d ? b.m1017e() : b.m1014b();
        int c = m984c((int) i.m311a());
        int c2 = m984c((int) e.m311a());
        int i2 = -1;
        int i3 = c;
        int i4 = 0;
        int i5 = 1;
        while (i3 < c2) {
            if (a[i3] == null) {
                c = i4;
                i4 = i5;
                i5 = i2;
            } else {
                C0163g c0163g = a[i3];
                c = c0163g.m999a() - i2;
                if (c == 0) {
                    c = i4 + 1;
                    i4 = i5;
                    i5 = i2;
                } else if (c == 1) {
                    c = Math.max(i5, i4);
                    i5 = c0163g.m999a();
                    i4 = c;
                    c = 1;
                } else if (c < 0 || c0163g.m999a() >= c0169m.m1046b() || c > i3) {
                    a[i3] = null;
                    c = i4;
                    i4 = i5;
                    i5 = i2;
                } else {
                    int i6 = i5 > 2 ? c * (i5 - 2) : c;
                    Object obj = i6 >= i3 ? 1 : null;
                    for (int i7 = 1; i7 <= i6 && obj == null; i7++) {
                        obj = a[i3 - i7] != null ? 1 : null;
                    }
                    if (obj != null) {
                        a[i3] = null;
                        c = i4;
                        i4 = i5;
                        i5 = i2;
                    } else {
                        i4 = i5;
                        i5 = c0163g.m999a();
                        c = 1;
                    }
                }
            }
            i3++;
            i2 = i5;
            i5 = i4;
            i4 = c;
        }
    }

    /* renamed from: d */
    int[] m991d() {
        C0169m f = m993f();
        if (f == null) {
            return null;
        }
        m985a(f);
        int[] iArr = new int[f.m1046b()];
        for (C0163g c0163g : m981a()) {
            if (c0163g != null) {
                int a = c0163g.m999a();
                if (a < iArr.length) {
                    iArr[a] = iArr[a] + 1;
                }
            }
        }
        return iArr;
    }

    /* renamed from: e */
    boolean m992e() {
        return this.f620d;
    }

    /* renamed from: f */
    C0169m m993f() {
        C0163g[] a = m981a();
        C0168l c0168l = new C0168l();
        C0168l c0168l2 = new C0168l();
        C0168l c0168l3 = new C0168l();
        C0168l c0168l4 = new C0168l();
        for (C0163g c0163g : a) {
            if (c0163g != null) {
                c0163g.m1007g();
                int d = c0163g.m1004d() % 30;
                int a2 = c0163g.m999a();
                if (!this.f620d) {
                    a2 += 2;
                }
                switch (a2 % 3) {
                    case 0:
                        c0168l2.m1044b((d * 3) + 1);
                        break;
                    case 1:
                        c0168l4.m1044b(d / 3);
                        c0168l3.m1044b(d % 3);
                        break;
                    case 2:
                        c0168l.m1044b(d + 1);
                        break;
                    default:
                        break;
                }
            }
        }
        if (c0168l.m1043a().length == 0 || c0168l2.m1043a().length == 0 || c0168l3.m1043a().length == 0 || c0168l4.m1043a().length == 0 || c0168l.m1043a()[0] < 1 || c0168l2.m1043a()[0] + c0168l3.m1043a()[0] < 3 || c0168l2.m1043a()[0] + c0168l3.m1043a()[0] > 90) {
            return null;
        }
        C0169m c0169m = new C0169m(c0168l.m1043a()[0], c0168l2.m1043a()[0], c0168l3.m1043a()[0], c0168l4.m1043a()[0]);
        m986a(a, c0169m);
        return c0169m;
    }

    public String toString() {
        return f619z + this.f620d + '\n' + super.toString();
    }
}
