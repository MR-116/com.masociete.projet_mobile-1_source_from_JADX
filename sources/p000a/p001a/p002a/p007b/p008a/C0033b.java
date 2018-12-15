package p000a.p001a.p002a.p007b.p008a;

import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.b.a.b */
enum C0033b {
    DATA_MASK_000,
    DATA_MASK_001,
    DATA_MASK_010,
    DATA_MASK_011,
    DATA_MASK_100,
    DATA_MASK_101,
    DATA_MASK_110,
    DATA_MASK_111;

    /* renamed from: z */
    private static String m217z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 81;
                    break;
                case 1:
                    i2 = 122;
                    break;
                case 2:
                    i2 = 98;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 62;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m218z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 62);
        }
        return toCharArray;
    }

    /* renamed from: a */
    final void m219a(C0194n c0194n, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo16a(i2, i3)) {
                    c0194n.m1218c(i3, i2);
                }
            }
        }
    }

    /* renamed from: a */
    abstract boolean mo16a(int i, int i2);
}
