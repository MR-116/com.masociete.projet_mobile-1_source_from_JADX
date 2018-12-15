package p000a.p001a.p002a.p020e.p021a;

import java.util.Map;
import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.C0216w;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p029b.C0179b;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0182e;

/* renamed from: a.a.a.e.a.a */
public final class C0142a {
    /* renamed from: a */
    private static final int f486a = 0;
    /* renamed from: b */
    private static final int f487b = 2;
    /* renamed from: d */
    private static final int f488d = 1;
    /* renamed from: c */
    private final C0182e f489c = new C0182e(C0180c.f688n);

    /* renamed from: a */
    private void m838a(byte[] bArr, int i, int i2, int i3, int i4) throws C0211r {
        int i5 = 0;
        int i6 = i2 + i3;
        int i7 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i6 / i7)];
        for (int i8 = 0; i8 < i6; i8++) {
            if (i4 != 0) {
                try {
                    if (i8 % 2 != i4 - 1) {
                    }
                } catch (C0179b e) {
                    throw e;
                }
            }
            iArr[i8 / i7] = bArr[i8 + i] & 255;
        }
        try {
            this.f489c.m1124a(iArr, i3 / i7);
            while (i5 < i2) {
                if (i4 != 0) {
                    try {
                        if (i5 % 2 != i4 - 1) {
                            i5++;
                        }
                    } catch (C0179b e2) {
                        throw e2;
                    }
                }
                bArr[i5 + i] = (byte) iArr[i5 / i7];
                i5++;
            }
        } catch (C0179b e3) {
            throw C0211r.m1265a();
        }
    }

    /* renamed from: a */
    public C0187h m839a(C0194n c0194n) throws C0211r, C0212s {
        return m840a(c0194n, null);
    }

    /* renamed from: a */
    public C0187h m840a(C0194n c0194n, Map<C0216w, ?> map) throws C0212s, C0211r {
        byte[] bArr;
        Object a = new C0144c(c0194n).m852a();
        m838a(a, 0, 10, 10, 0);
        int i = a[0] & 15;
        switch (i) {
            case 2:
            case 3:
            case 4:
                m838a(a, 20, 84, 40, 1);
                m838a(a, 20, 84, 40, 2);
                bArr = new byte[94];
                break;
            case 5:
                m838a(a, 20, 68, 56, 1);
                m838a(a, 20, 68, 56, 2);
                bArr = new byte[78];
                break;
            default:
                throw C0212s.m1267a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C0143b.m844a(bArr, i);
    }
}
