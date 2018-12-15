package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.core.C0607n;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.x */
public final class C0122x extends C0118t {
    /* renamed from: k */
    private static final int[] f413k = new int[]{1, 1, 1, 1, 1, 1};
    /* renamed from: l */
    static final int[] f414l = new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37};
    /* renamed from: n */
    private static final int[][] f415n = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    /* renamed from: z */
    private static final String[] f416z = new String[]{C0122x.m707z(C0122x.m708z("\u0013DrH\u0018")), C0122x.m707z(C0122x.m708z("\u0013DrH"))};
    /* renamed from: m */
    private final int[] f417m = new int[4];

    /* renamed from: a */
    private static void m705a(StringBuilder stringBuilder, int i) throws C0213t {
        for (int i2 = 0; i2 <= 1; i2++) {
            int i3 = 0;
            while (i3 < 10) {
                try {
                    if (i == f415n[i2][i3]) {
                        stringBuilder.insert(0, (char) (i2 + 48));
                        stringBuilder.append((char) (i3 + 48));
                        return;
                    }
                    i3++;
                } catch (C0213t e) {
                    throw e;
                }
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: b */
    public static String m706b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder stringBuilder = new StringBuilder(12);
        stringBuilder.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                stringBuilder.append(cArr, 0, 2);
                stringBuilder.append(c);
                stringBuilder.append(f416z[1]);
                stringBuilder.append(cArr, 2, 3);
                break;
            case '3':
                stringBuilder.append(cArr, 0, 3);
                stringBuilder.append(f416z[0]);
                stringBuilder.append(cArr, 3, 2);
                break;
            case '4':
                stringBuilder.append(cArr, 0, 4);
                stringBuilder.append(f416z[0]);
                stringBuilder.append(cArr[4]);
                break;
            default:
                stringBuilder.append(cArr, 0, 5);
                stringBuilder.append(f416z[1]);
                stringBuilder.append(c);
                break;
        }
        if (str.length() >= 8) {
            stringBuilder.append(str.charAt(7));
        }
        return stringBuilder.toString();
    }

    /* renamed from: z */
    private static String m707z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 116;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = C0607n.co;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m708z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected int mo23a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        int[] iArr2 = this.f417m;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c0185f.m1136a();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6 && i < a) {
            int a2 = C0118t.m681a(c0185f, iArr2, i, d);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a2 >= 10) {
                i3 |= 1 << (5 - i2);
            }
            i2++;
            i = i4;
        }
        C0122x.m705a(stringBuilder, i3);
        return i;
    }

    /* renamed from: a */
    protected boolean mo26a(String str) throws C0212s {
        return super.mo26a(C0122x.m706b(str));
    }

    /* renamed from: a */
    protected int[] mo27a(C0185f c0185f, int i) throws C0213t {
        return C0118t.m684a(c0185f, i, true, f413k);
    }

    /* renamed from: b */
    C0217x mo24b() {
        return C0217x.UPC_E;
    }
}
