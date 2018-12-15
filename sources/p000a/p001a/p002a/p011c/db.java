package p000a.p001a.p002a.p011c;

import java.util.EnumMap;
import java.util.Map;
import p000a.p001a.p002a.C0206k;
import p000a.p001a.p002a.C0208m;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.C0217x;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.db */
final class db {
    /* renamed from: a */
    private final StringBuilder f334a = new StringBuilder();
    /* renamed from: b */
    private final int[] f335b = new int[4];

    db() {
    }

    /* renamed from: a */
    private int m607a(C0185f c0185f, int[] iArr, StringBuilder stringBuilder) throws C0213t {
        int[] iArr2 = this.f335b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int a = c0185f.m1136a();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < a; i3++) {
            int a2 = C0118t.m681a(c0185f, iArr2, i, C0118t.f402d);
            stringBuilder.append((char) ((a2 % 10) + 48));
            int i4 = 0;
            while (i4 < iArr2.length) {
                int i5 = iArr2[i4] + i;
                i4++;
                i = i5;
            }
            if (a2 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c0185f.m1152f(c0185f.m1143b(i));
            }
        }
        try {
            if (stringBuilder.length() != 2) {
                throw C0213t.m1269a();
            }
            try {
                if (Integer.parseInt(stringBuilder.toString()) % 4 == i2) {
                    return i;
                }
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        } catch (C0213t e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private static Map<C0206k, Object> m608a(String str) {
        if (str.length() != 2) {
            return null;
        }
        Map<C0206k, Object> enumMap = new EnumMap(C0206k.class);
        enumMap.put(C0206k.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    C0208m m609a(int i, C0185f c0185f, int[] iArr) throws C0213t {
        StringBuilder stringBuilder = this.f334a;
        stringBuilder.setLength(0);
        int a = m607a(c0185f, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map a2 = db.m608a(stringBuilder2);
        C0208m c0208m = new C0208m(stringBuilder2, null, new eb[]{new eb(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i), new eb((float) a, (float) i)}, C0217x.UPC_EAN_EXTENSION);
        if (a2 != null) {
            try {
                c0208m.m1253a(a2);
            } catch (C0213t e) {
                throw e;
            }
        }
        return c0208m;
    }
}
