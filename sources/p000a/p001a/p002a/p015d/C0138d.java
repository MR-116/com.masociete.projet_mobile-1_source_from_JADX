package p000a.p001a.p002a.p015d;

import java.nio.charset.Charset;
import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.p015d.p018c.C0130a;
import p000a.p001a.p002a.p015d.p018c.C0131b;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.d.d */
public final class C0138d implements cb {
    /* renamed from: a */
    private static final Charset f476a = Charset.forName(C0138d.m815z(C0138d.m816z("]\"\u001b{4,Dm{=")));
    /* renamed from: z */
    private static final String f477z = C0138d.m815z(C0138d.m816z("W\u0010:vcz\u001d-viz\u0012;2i40\u000e\u0002IW]t4y`Q39x4"));

    /* renamed from: a */
    private static C0194n m813a(C0130a c0130a, int i, int i2) {
        C0194n a = c0130a.m762a();
        if (a == null) {
            try {
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int a2 = a.m1208a();
        int i3 = a.m1226i();
        int max = Math.max(i, a2);
        int max2 = Math.max(i2, i3);
        int min = Math.min(max / a2, max2 / i3);
        int i4 = (max - (a2 * min)) / 2;
        int i5 = (max2 - (i3 * min)) / 2;
        C0194n c0194n = new C0194n(max, max2);
        max2 = i5;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = i4;
            max = 0;
            while (max < a2) {
                try {
                    if (a.m1221d(max, i6)) {
                        c0194n.m1212a(i5, max2, min, min);
                    }
                    max++;
                    i5 += min;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            max2 += min;
        }
        return c0194n;
    }

    /* renamed from: a */
    private static C0194n m814a(String str, C0217x c0217x, int i, int i2, Charset charset, int i3, int i4) {
        try {
            if (c0217x == C0217x.AZTEC) {
                return C0138d.m813a(C0131b.m774a(str.getBytes(charset), i3, i4), i, i2);
            }
            throw new IllegalArgumentException(f477z + c0217x);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: z */
    private static String m815z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 113;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 86;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m816z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 12);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo7a(String str, C0217x c0217x, int i, int i2) {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) {
        int i3;
        Charset charset;
        Charset charset2 = f476a;
        int i4 = 33;
        int i5 = 0;
        if (map != null) {
            try {
                if (map.containsKey(C0204i.CHARACTER_SET)) {
                    charset2 = Charset.forName(map.get(C0204i.CHARACTER_SET).toString());
                }
                if (map.containsKey(C0204i.ERROR_CORRECTION)) {
                    i4 = Integer.parseInt(map.get(C0204i.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C0204i.AZTEC_LAYERS)) {
                    i5 = Integer.parseInt(map.get(C0204i.AZTEC_LAYERS).toString());
                    i3 = i4;
                    charset = charset2;
                    return C0138d.m814a(str, c0217x, i, i2, charset, i3, i5);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        i3 = i4;
        charset = charset2;
        return C0138d.m814a(str, c0217x, i, i2, charset, i3, i5);
    }
}
