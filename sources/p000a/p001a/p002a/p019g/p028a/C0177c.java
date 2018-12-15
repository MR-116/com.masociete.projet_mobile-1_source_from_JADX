package p000a.p001a.p002a.p019g.p028a;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p019g.C0194n;

@Deprecated
/* renamed from: a.a.a.g.a.c */
public final class C0177c {
    /* renamed from: a */
    private static final int f677a = 32;
    /* renamed from: b */
    private final C0194n f678b;

    public C0177c(C0194n c0194n) {
        this.f678b = c0194n;
    }

    /* renamed from: a */
    private eb m1088a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws C0213t {
        int i10 = i;
        int i11 = i5;
        int[] iArr = null;
        while (i11 < i8 && i11 >= i7 && i10 < i4 && i10 >= i3) {
            int[] a = i2 == 0 ? m1089a(i11, i9, i3, i4, true) : m1089a(i10, i9, i7, i8, false);
            if (a != null) {
                i10 += i2;
                iArr = a;
                i11 += i6;
            } else if (iArr == null) {
                try {
                    throw C0213t.m1269a();
                } catch (C0213t e) {
                    throw e;
                }
            } else if (i2 == 0) {
                r3 = i11 - i6;
                try {
                    if (iArr[0] >= i) {
                        return new eb((float) iArr[1], (float) r3);
                    }
                    if (iArr[1] <= i) {
                        return new eb((float) iArr[0], (float) r3);
                    }
                    try {
                        return new eb((float) iArr[i6 > 0 ? 0 : 1], (float) r3);
                    } catch (C0213t e2) {
                        throw e2;
                    }
                } catch (C0213t e22) {
                    throw e22;
                } catch (C0213t e222) {
                    throw e222;
                }
            } else {
                r3 = i10 - i2;
                try {
                    if (iArr[0] >= i5) {
                        return new eb((float) r3, (float) iArr[1]);
                    }
                    if (iArr[1] <= i5) {
                        return new eb((float) r3, (float) iArr[0]);
                    }
                    try {
                        return new eb((float) r3, (float) iArr[i2 < 0 ? 0 : 1]);
                    } catch (C0213t e2222) {
                        throw e2222;
                    }
                } catch (C0213t e22222) {
                    throw e22222;
                } catch (C0213t e222222) {
                    throw e222222;
                }
            }
        }
        throw C0213t.m1269a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private int[] m1089a(int r5, int r6, int r7, int r8, boolean r9) {
        /*
        r4 = this;
        r0 = r7 + r8;
        r1 = r0 / 2;
        r0 = r1;
    L_0x0005:
        if (r0 < r7) goto L_0x0031;
    L_0x0007:
        if (r9 == 0) goto L_0x0014;
    L_0x0009:
        r2 = r4.f678b;
        r2 = r2.m1221d(r0, r5);
        if (r2 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r0 + -1;
        goto L_0x0005;
    L_0x0014:
        r2 = r4.f678b;
        r2 = r2.m1221d(r5, r0);
        if (r2 != 0) goto L_0x0011;
    L_0x001c:
        r2 = r0;
    L_0x001d:
        r2 = r2 + -1;
        if (r2 < r7) goto L_0x002b;
    L_0x0021:
        if (r9 == 0) goto L_0x0043;
    L_0x0023:
        r3 = r4.f678b;
        r3 = r3.m1221d(r2, r5);
        if (r3 == 0) goto L_0x001d;
    L_0x002b:
        r3 = r0 - r2;
        if (r2 < r7) goto L_0x0031;
    L_0x002f:
        if (r3 <= r6) goto L_0x004c;
    L_0x0031:
        r2 = r0 + 1;
        r0 = r1;
    L_0x0034:
        if (r0 >= r8) goto L_0x006b;
    L_0x0036:
        if (r9 == 0) goto L_0x004e;
    L_0x0038:
        r1 = r4.f678b;
        r1 = r1.m1221d(r0, r5);
        if (r1 == 0) goto L_0x0056;
    L_0x0040:
        r0 = r0 + 1;
        goto L_0x0034;
    L_0x0043:
        r3 = r4.f678b;
        r3 = r3.m1221d(r5, r2);
        if (r3 == 0) goto L_0x001d;
    L_0x004b:
        goto L_0x002b;
    L_0x004c:
        r0 = r2;
        goto L_0x0005;
    L_0x004e:
        r1 = r4.f678b;
        r1 = r1.m1221d(r5, r0);
        if (r1 != 0) goto L_0x0040;
    L_0x0056:
        r1 = r0;
    L_0x0057:
        r1 = r1 + 1;
        if (r1 >= r8) goto L_0x0065;
    L_0x005b:
        if (r9 == 0) goto L_0x0079;
    L_0x005d:
        r3 = r4.f678b;
        r3 = r3.m1221d(r1, r5);
        if (r3 == 0) goto L_0x0057;
    L_0x0065:
        r3 = r1 - r0;
        if (r1 >= r8) goto L_0x006b;
    L_0x0069:
        if (r3 <= r6) goto L_0x0082;
    L_0x006b:
        r1 = r0 + -1;
        if (r1 <= r2) goto L_0x0084;
    L_0x006f:
        r0 = 2;
        r0 = new int[r0];
        r3 = 0;
        r0[r3] = r2;
        r2 = 1;
        r0[r2] = r1;
    L_0x0078:
        return r0;
    L_0x0079:
        r3 = r4.f678b;
        r3 = r3.m1221d(r5, r1);
        if (r3 == 0) goto L_0x0057;
    L_0x0081:
        goto L_0x0065;
    L_0x0082:
        r0 = r1;
        goto L_0x0034;
    L_0x0084:
        r0 = 0;
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.g.a.c.a(int, int, int, int, boolean):int[]");
    }

    /* renamed from: a */
    public eb[] m1090a() throws C0213t {
        int i = this.f678b.m1226i();
        int a = this.f678b.m1208a();
        int i2 = i / 2;
        int i3 = a / 2;
        int max = Math.max(1, i / 256);
        int max2 = Math.max(1, a / 256);
        int a2 = ((int) m1088a(i3, 0, 0, a, i2, -max, 0, i, i3 / 2).m311a()) - 1;
        int b = ((int) m1088a(i3, -max2, 0, a, i2, 0, a2, i, i2 / 2).m312b()) - 1;
        a = ((int) m1088a(i3, max2, b, a, i2, 0, a2, i, i2 / 2).m312b()) + 1;
        eb a3 = m1088a(i3, 0, b, a, i2, max, a2, i, i3 / 2);
        eb a4 = m1088a(i3, 0, b, a, i2, -max, a2, ((int) a3.m311a()) + 1, i3 / 4);
        return new eb[]{a4, r12, r11, a3};
    }
}
