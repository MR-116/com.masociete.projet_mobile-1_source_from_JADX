package p000a.p001a.p002a.p003a.p006c;

import p000a.p001a.p002a.C0211r;
import p000a.p001a.p002a.C0212s;
import p000a.p001a.p002a.p019g.C0187h;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p029b.C0179b;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0182e;

/* renamed from: a.a.a.a.c.d */
public final class C0021d {
    /* renamed from: a */
    private final C0182e f74a = new C0182e(C0180c.f683e);

    /* renamed from: a */
    private void m141a(byte[] bArr, int i) throws C0211r {
        int i2 = 0;
        int length = bArr.length;
        int[] iArr = new int[length];
        int i3 = 0;
        while (i3 < length) {
            try {
                iArr[i3] = bArr[i3] & 255;
                i3++;
            } catch (C0179b e) {
                throw e;
            }
        }
        try {
            this.f74a.m1124a(iArr, bArr.length - i);
            while (i2 < i) {
                try {
                    bArr[i2] = (byte) iArr[i2];
                    i2++;
                } catch (C0179b e2) {
                    throw e2;
                }
            }
        } catch (C0179b e3) {
            throw C0211r.m1265a();
        }
    }

    /* renamed from: a */
    public C0187h m142a(C0194n c0194n) throws C0212s, C0211r {
        int i;
        C0024g c0024g = new C0024g(c0194n);
        C0022e[] a = C0022e.m144a(c0024g.m160b(), c0024g.m159a());
        int i2 = 0;
        for (C0022e b : a) {
            i2 += b.m146b();
        }
        byte[] bArr = new byte[i2];
        int length = a.length;
        for (i2 = 0; i2 < length; i2++) {
            C0022e c0022e = a[i2];
            byte[] a2 = c0022e.m145a();
            int b2 = c0022e.m146b();
            m141a(a2, b2);
            i = 0;
            while (i < b2) {
                try {
                    bArr[(i * length) + i2] = a2[i];
                    i++;
                } catch (C0212s e) {
                    throw e;
                }
            }
        }
        return C0027j.m165a(bArr);
    }

    /* renamed from: a */
    public C0187h m143a(boolean[][] zArr) throws C0212s, C0211r {
        int length = zArr.length;
        C0194n c0194n = new C0194n(length);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (zArr[i][i2]) {
                        c0194n.m1215b(i2, i);
                    }
                    i2++;
                } catch (C0212s e) {
                    throw e;
                }
            }
        }
        return m142a(c0194n);
    }
}
