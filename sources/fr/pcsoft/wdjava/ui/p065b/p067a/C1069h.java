package fr.pcsoft.wdjava.ui.p065b.p067a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;

/* renamed from: fr.pcsoft.wdjava.ui.b.a.h */
enum C1069h {
    px,
    in,
    cm,
    mm,
    pt,
    pc,
    percent,
    em,
    ex;
    
    /* renamed from: a */
    private static final C1069h[] f3110a = null;
    /* renamed from: z */
    private static final String f3111z = null;

    static {
        f3111z = C1069h.m7644z(C1069h.m7645z("\u0016V\u0016,îck)\u001f'-W\u0011xt6H\u000f7u7Ñ\u001ax=c"));
        px = new C1069h(C1069h.m7644z(C1069h.m7645z("3@")), 0);
        in = new C1069h(C1069h.m7644z(C1069h.m7645z("*V")), 1);
        cm = new C1069h(C1069h.m7644z(C1069h.m7645z(" U")), 2);
        mm = new C1069h(C1069h.m7644z(C1069h.m7645z(".U")), 3);
        pt = new C1069h(C1069h.m7644z(C1069h.m7645z("3L")), 4);
        pc = new C1069h(C1069h.m7644z(C1069h.m7645z("3[")), 5);
        percent = new C1069h(C1069h.m7644z(C1069h.m7645z("3]\r;b-L")), 6);
        em = new C1069h(C1069h.m7644z(C1069h.m7645z("&U")), 7);
        ex = new C1069h(C1069h.m7644z(C1069h.m7645z("&@")), 8);
        f3110a = new C1069h[]{px, in, cm, mm, pt, pc, percent, em, ex};
    }

    public static final C1069h getUnitFromName(String str) {
        try {
            return C1069h.valueOf(str);
        } catch (IllegalArgumentException e) {
            C0691a.m2856a(f3111z + str);
            return px;
        }
    }

    /* renamed from: z */
    private static String m7644z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 67;
                    break;
                case 1:
                    i2 = 56;
                    break;
                case 2:
                    i2 = C0607n.bx;
                    break;
                case 3:
                    i2 = 88;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7645z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 7);
        }
        return toCharArray;
    }
}
