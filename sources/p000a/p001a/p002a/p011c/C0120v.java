package p000a.p001a.p002a.p011c;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.v */
public final class C0120v extends C0118t {
    /* renamed from: k */
    private final int[] f411k = new int[4];

    /* renamed from: a */
    protected int mo23a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        int[] iArr2 = this.f411k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c0185f.m1136a();
        int i = iArr[1];
        int i2 = 0;
        while (i2 < 4 && i < a) {
            stringBuilder.append((char) (C0118t.m681a(c0185f, iArr2, i, a) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            i2++;
            i = i3;
        }
        i = C0118t.m684a(c0185f, i, true, f)[1];
        i2 = 0;
        while (i2 < 4 && i < a) {
            stringBuilder.append((char) (C0118t.m681a(c0185f, iArr2, i, a) + 48));
            i3 = i;
            for (int i42 : iArr2) {
                i3 += i42;
            }
            i2++;
            i = i3;
        }
        return i;
    }

    /* renamed from: b */
    C0217x mo24b() {
        return C0217x.EAN_8;
    }
}
