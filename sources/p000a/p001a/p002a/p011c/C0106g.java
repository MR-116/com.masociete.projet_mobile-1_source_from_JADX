package p000a.p001a.p002a.p011c;

import java.util.Map;
import p000a.p001a.p002a.C0204i;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.fb;
import p000a.p001a.p002a.p019g.C0194n;

/* renamed from: a.a.a.c.g */
public final class C0106g extends C0101b {
    /* renamed from: a */
    private static final int[] f338a = new int[]{3, 1, 1};
    /* renamed from: b */
    private static final int[] f339b = new int[]{1, 1, 1, 1};
    /* renamed from: z */
    private static final String[] f340z = new String[]{C0106g.m622z(C0106g.m623z("XWF[oiQD\u000fk,PE[wdZ\u0003\u0012m|JW[pdPV\u0017g,]F[fzZM")), C0106g.m622z(C0106g.m623z("^ZR\u000efKF\u001f#oPM\u000ffbKP[pdPV\u0017g,]F[oiLP[wd^M[;<\u001fG\u0012deKP[ocQDW#nJW[dcK\u0003")), C0106g.m622z(C0106g.m623z("O^M[lbSZ[fb\\L\u001ff,vw=/,]V\u000f#kPW["))};

    /* renamed from: z */
    private static String m622z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 12;
                    break;
                case 1:
                    i2 = 63;
                    break;
                case 2:
                    i2 = 35;
                    break;
                case 3:
                    i2 = 123;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m623z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0194n mo8a(String str, C0217x c0217x, int i, int i2, Map<C0204i, ?> map) throws fb {
        try {
            if (c0217x == C0217x.ITF) {
                return super.mo8a(str, c0217x, i, i2, map);
            }
            throw new IllegalArgumentException(f340z[2] + c0217x);
        } catch (fb e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean[] mo21a(String str) {
        int length = str.length();
        try {
            if (length % 2 != 0) {
                throw new IllegalArgumentException(f340z[0]);
            } else if (length > 80) {
                try {
                    throw new IllegalArgumentException(f340z[1] + length);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } else {
                boolean[] zArr = new boolean[((length * 9) + 9)];
                int a = C0101b.m587a(zArr, 0, f339b, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[18];
                    int i2 = 0;
                    while (i2 < 5) {
                        try {
                            iArr[i2 * 2] = C0115q.f388a[digit][i2];
                            iArr[(i2 * 2) + 1] = C0115q.f388a[digit2][i2];
                            i2++;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    a += C0101b.m587a(zArr, a, iArr, true);
                }
                C0101b.m587a(zArr, a, f338a, true);
                return zArr;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
