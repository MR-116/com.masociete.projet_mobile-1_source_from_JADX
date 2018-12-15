package p000a.p001a.p002a.p019g.p029b;

/* renamed from: a.a.a.g.b.e */
public final class C0182e {
    /* renamed from: z */
    private static final String[] f701z = new String[]{C0182e.m1122z(C0182e.m1123z("TK~kuyMf\"g|EgpodJe\"`qKdgb0Vg\"tuF}ac0Rgn~Mekg|\u001d")), C0182e.m1122z(C0182e.m1123z("b}sk+!_(ugc\u0002rgt")), C0182e.m1122z(C0182e.m1123z("cKoogDKdfc8\u0012!\"qqQ(xcbM")), C0182e.m1122z(C0182e.m1123z("UPzmt0NgagdMz\"buEzgc0Fggu0Lgv&}C|an0L}oduP(m`0Pgmrc")), C0182e.m1122z(C0182e.m1123z("RCl\"cbPgp&|MkcryMf"))};
    /* renamed from: a */
    private final C0180c f702a;

    public C0182e(C0180c c0180c) {
        this.f702a = c0180c;
    }

    /* renamed from: a */
    private int[] m1119a(C0178a c0178a) throws C0179b {
        int a = c0178a.m1093a();
        if (a == 1) {
            try {
                return new int[]{c0178a.m1094a(1)};
            } catch (C0179b e) {
                throw e;
            }
        }
        int[] iArr = new int[a];
        int i = 0;
        int i2 = 1;
        while (i2 < this.f702a.m1108b() && i < a) {
            try {
                try {
                    if (c0178a.m1097b(i2) == 0) {
                        iArr[i] = this.f702a.m1109b(i2);
                        i++;
                    }
                    i2++;
                } catch (C0179b e2) {
                    throw e2;
                }
            } catch (C0179b e22) {
                throw e22;
            } catch (C0179b e222) {
                throw e222;
            }
        }
        if (i == a) {
            return iArr;
        }
        try {
            throw new C0179b(f701z[3]);
        } catch (C0179b e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private int[] m1120a(C0178a c0178a, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (i < length) {
            int b = this.f702a.m1109b(iArr[i]);
            int i2 = 1;
            int i3 = 0;
            while (i3 < length) {
                int c;
                if (i != i3) {
                    c = this.f702a.m1112c(iArr[i3], b);
                    c = this.f702a.m1112c(i2, (c & 1) == 0 ? c | 1 : c & -2);
                } else {
                    c = i2;
                }
                i3++;
                i2 = c;
            }
            try {
                iArr2[i] = this.f702a.m1112c(c0178a.m1097b(b), this.f702a.m1109b(i2));
                if (this.f702a.m1114d() != 0) {
                    iArr2[i] = this.f702a.m1112c(iArr2[i], b);
                }
                i++;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private C0178a[] m1121a(C0178a c0178a, C0178a c0178a2, int i) throws C0179b {
        if (c0178a.m1093a() >= c0178a2.m1093a()) {
            C0178a c0178a3 = c0178a2;
            c0178a2 = c0178a;
            c0178a = c0178a3;
        }
        C0178a c = this.f702a.m1113c();
        C0178a a = this.f702a.m1107a();
        while (c0178a.m1093a() >= i / 2) {
            try {
                if (c0178a.m1102c()) {
                    throw new C0179b(f701z[1]);
                }
                C0178a c2 = this.f702a.m1113c();
                int b = this.f702a.m1109b(c0178a.m1094a(c0178a.m1093a()));
                C0178a c0178a4 = c2;
                c2 = c0178a2;
                while (c2.m1093a() >= c0178a.m1093a() && !c2.m1102c()) {
                    try {
                        int a2 = c2.m1093a() - c0178a.m1093a();
                        int c3 = this.f702a.m1112c(c2.m1094a(c2.m1093a()), b);
                        c0178a4 = c0178a4.m1096a(this.f702a.m1110b(a2, c3));
                        c2 = c2.m1096a(c0178a.m1095a(a2, c3));
                    } catch (C0179b e) {
                        throw e;
                    }
                }
                c = c0178a4.m1101c(a).m1096a(c);
                try {
                    if (c2.m1093a() >= c0178a.m1093a()) {
                        throw new IllegalStateException(f701z[0]);
                    }
                    c0178a2 = c0178a;
                    c0178a = c2;
                    c0178a3 = a;
                    a = c;
                    c = c0178a3;
                } catch (C0179b e2) {
                    throw e2;
                }
            } catch (C0179b e22) {
                throw e22;
            }
        }
        int a3 = a.m1094a(0);
        if (a3 == 0) {
            try {
                throw new C0179b(f701z[2]);
            } catch (C0179b e222) {
                throw e222;
            }
        }
        a3 = this.f702a.m1109b(a3);
        a = a.m1100c(a3);
        c = c0178a.m1100c(a3);
        return new C0178a[]{a, c};
    }

    /* renamed from: z */
    private static String m1122z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 16;
                    break;
                case 1:
                    i2 = 34;
                    break;
                case 2:
                    i2 = 8;
                    break;
                case 3:
                    i2 = 2;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1123z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m1124a(int[] iArr, int i) throws C0179b {
        int i2 = 0;
        C0178a c0178a = new C0178a(this.f702a, iArr);
        int[] iArr2 = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            int b = c0178a.m1097b(this.f702a.m1106a(this.f702a.m1114d() + i4));
            iArr2[(iArr2.length - 1) - i4] = b;
            if (b != 0) {
                i3 = 0;
            }
        }
        if (i3 == 0) {
            C0178a[] a = m1121a(this.f702a.m1110b(i, 1), new C0178a(this.f702a, iArr2), i);
            C0178a c0178a2 = a[0];
            C0178a c0178a3 = a[1];
            int[] a2 = m1119a(c0178a2);
            int[] a3 = m1120a(c0178a3, a2);
            while (i2 < a2.length) {
                int length = (iArr.length - 1) - this.f702a.m1111c(a2[i2]);
                if (length < 0) {
                    try {
                        throw new C0179b(f701z[4]);
                    } catch (C0179b e) {
                        throw e;
                    }
                }
                iArr[length] = C0180c.m1103a(iArr[length], a3[i2]);
                i2++;
            }
        }
    }
}
