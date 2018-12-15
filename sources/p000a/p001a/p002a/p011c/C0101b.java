package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.cb;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.b */
public abstract class C0101b implements cb {
    /* renamed from: z */
    private static final String[] f310z = new String[]{C0101b.m589z(C0101b.m590z("\nQc-y-Bal~-Nald7\u0014j#ydUh b3Q`b-\rZt9y~\u0014")), C0101b.m589z(C0101b.m590z("\u0002[q\"idQi<y=\u0014g#c0Qj8~"))};

    /* renamed from: a */
    protected static int m587a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (i2 < length) {
            int i5 = iArr[i2];
            int i6 = i4;
            i4 = 0;
            while (i4 < i5) {
                int i7 = i6 + 1;
                try {
                    zArr[i6] = z;
                    i4++;
                    i6 = i7;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 += i5;
            i2++;
            z = !z;
            i4 = i6;
        }
        return i3;
    }

    /* renamed from: a */
    private static C0194n m588a(boolean[] zArr, int i, int i2, int i3) {
        int i4 = 0;
        int length = zArr.length;
        int i5 = length + i3;
        int max = Math.max(i, i5);
        int max2 = Math.max(1, i2);
        int i6 = max / i5;
        i5 = (max - (length * i6)) / 2;
        C0194n c0194n = new C0194n(max, max2);
        while (i4 < length) {
            try {
                if (zArr[i4]) {
                    c0194n.m1212a(i5, 0, i6, max2);
                }
                i4++;
                i5 += i6;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return c0194n;
    }

    /* renamed from: z */
    private static String m589z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 52;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m590z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 13);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo22a() {
        return 10;
    }

    /* renamed from: a */
    public final C0194n mo7a(String str, C0217x c0217x, int i, int i2) throws fb {
        return mo8a(str, c0217x, i, i2, null);
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException(f310z[1]);
            } else if (i < 0 || i2 < 0) {
                try {
                    throw new IllegalArgumentException(f310z[0] + i + 'x' + i2);
                } catch (fb e) {
                    throw e;
                }
            } else {
                int a = mo22a();
                if (map != null) {
                    try {
                        if (map.containsKey(C0204i.MARGIN)) {
                            a = Integer.parseInt(map.get(C0204i.MARGIN).toString());
                        }
                    } catch (fb e2) {
                        throw e2;
                    }
                }
                return C0101b.m588a(mo21a(str), i, i2, a);
            }
        } catch (fb e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public abstract boolean[] mo21a(String str);
}
