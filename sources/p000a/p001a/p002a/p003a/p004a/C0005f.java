package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.a.a.f */
final class C0005f implements C0000a {
    /* renamed from: z */
    private static final String[] f33z = new String[]{C0005f.m45z(C0005f.m46z("\u00125<da\u0015=!0vFz")), C0005f.m45z(C0005f.m46z("56$!b\u001d6h)j\u0018?rd"))};

    C0005f() {
    }

    /* renamed from: a */
    private static char m44a(char c, char c2) {
        try {
            if (C0001b.m9a(c) && C0001b.m9a(c2)) {
                return (char) ((((c - 48) * 10) + (c2 - 48)) + 130);
            }
            throw new IllegalArgumentException(f33z[0] + c + c2);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m45z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.Hn;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 72;
                    break;
                case 3:
                    i2 = 68;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m46z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3a() {
        return 0;
    }

    /* renamed from: a */
    public void mo4a(C0006g c0006g) {
        if (C0001b.m3a(c0006g.m68k(), c0006g.f35a) >= 2) {
            try {
                c0006g.m53a(C0005f.m44a(c0006g.m68k().charAt(c0006g.f35a), c0006g.m68k().charAt(c0006g.f35a + 1)));
                c0006g.f35a += 2;
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        char e2 = c0006g.m62e();
        int a = C0001b.m4a(c0006g.m68k(), c0006g.f35a, mo3a());
        try {
            if (a != mo3a()) {
                switch (a) {
                    case 1:
                        c0006g.m53a('æ');
                        c0006g.m59b(1);
                        return;
                    case 2:
                        c0006g.m53a('ï');
                        c0006g.m59b(2);
                        return;
                    case 3:
                        c0006g.m53a('î');
                        c0006g.m59b(3);
                        return;
                    case 4:
                        c0006g.m53a('ð');
                        c0006g.m59b(4);
                        return;
                    case 5:
                        c0006g.m53a('ç');
                        c0006g.m59b(5);
                        return;
                    default:
                        throw new IllegalStateException(f33z[1] + a);
                }
                throw e;
            }
            try {
                if (C0001b.m12d(e2)) {
                    c0006g.m53a('ë');
                    c0006g.m53a((char) ((e2 - 128) + 1));
                    c0006g.f35a++;
                    return;
                }
                c0006g.m53a((char) (e2 + 1));
                c0006g.f35a++;
            } catch (IllegalStateException e3) {
                throw e3;
            }
        } catch (IllegalStateException e32) {
            throw e32;
        } catch (IllegalStateException e322) {
            throw e322;
        }
    }
}
