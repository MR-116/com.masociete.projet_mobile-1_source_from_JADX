package p000a.p001a.p002a.p011c;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.u */
public final class C0119u extends C0118t {
    /* renamed from: l */
    static final int[] f409l = new int[]{0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    /* renamed from: k */
    private final int[] f410k = new int[4];

    /* renamed from: a */
    private static void m693a(StringBuilder stringBuilder, int i) throws C0213t {
        int i2 = 0;
        while (i2 < 10) {
            try {
                if (i == f409l[i2]) {
                    stringBuilder.insert(0, (char) (i2 + 48));
                    return;
                }
                i2++;
            } catch (C0213t e) {
                throw e;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    protected int mo23a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        int i;
        int[] iArr2 = this.f410k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c0185f.m1136a();
        int i2 = iArr[1];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 6 && i2 < a) {
            int a2 = C0118t.m681a(c0185f, iArr2, i2, d);
            stringBuilder.append((char) ((a2 % 10) + 48));
            i = i2;
            for (int i5 : iArr2) {
                i += i5;
            }
            if (a2 >= 10) {
                i4 |= 1 << (5 - i3);
            }
            i3++;
            i2 = i;
        }
        C0119u.m693a(stringBuilder, i4);
        i4 = C0118t.m684a(c0185f, i2, true, f)[1];
        i = 0;
        while (i < 6 && i4 < a) {
            stringBuilder.append((char) (C0118t.m681a(c0185f, iArr2, i4, a) + 48));
            i2 = i4;
            for (int a22 : iArr2) {
                i2 += a22;
            }
            i++;
            i4 = i2;
        }
        return i4;
    }

    /* renamed from: b */
    C0217x mo24b() {
        return C0217x.EAN_13;
    }
}
