package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.y */
public final class C0123y implements cb {
    /* renamed from: z */
    private static final String f418z = C0123y.m713z(C0123y.m714z("`WpTNMZgTDMUq\u0010D\u0003cN7\fb\u001a>\u0016TW\u0016y\u001bU\u0003"));
    /* renamed from: a */
    private final C0108i f419a = new C0108i();

    /* renamed from: z */
    private static String m713z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 54;
                    break;
                case 2:
                    i2 = 30;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m714z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 33);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo7a(String str, C0217x c0217x, int i, int i2) throws fb {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.UPC_A) {
                return this.f419a.mo8a('0' + str, C0217x.EAN_13, i, i2, map);
            }
            throw new IllegalArgumentException(f418z + c0217x);
        } catch (fb e) {
            throw e;
        }
    }
}
