package p000a.p001a.p002a.p015d.p016a;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.hb;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.eb;
import p000a.p001a.p002a.p015d.C0140e;
import p000a.p001a.p002a.p019g.C0183d;
import p000a.p001a.p002a.p019g.C0194n;
import p000a.p001a.p002a.p019g.p028a.C0175a;
import p000a.p001a.p002a.p019g.p028a.C0176b;
import p000a.p001a.p002a.p019g.p029b.C0179b;
import p000a.p001a.p002a.p019g.p029b.C0180c;
import p000a.p001a.p002a.p019g.p029b.C0182e;

/* renamed from: a.a.a.d.a.b */
public final class C0126b {
    /* renamed from: e */
    private static final int[] f426e = new int[]{3808, 476, 2107, hb.f1513r};
    /* renamed from: a */
    private int f427a;
    /* renamed from: b */
    private boolean f428b;
    /* renamed from: c */
    private final C0194n f429c;
    /* renamed from: d */
    private int f430d;
    /* renamed from: f */
    private int f431f;
    /* renamed from: g */
    private int f432g;

    public C0126b(C0194n c0194n) {
        this.f429c = c0194n;
    }

    /* renamed from: a */
    private static float m728a(eb ebVar, eb ebVar2) {
        return C0175a.m1080a(ebVar.m312b(), ebVar.m311a(), ebVar2.m312b(), ebVar2.m311a());
    }

    /* renamed from: a */
    private int m729a() {
        return this.f428b ? (this.f430d * 4) + 11 : this.f430d <= 4 ? (this.f430d * 4) + 15 : ((this.f430d * 4) + ((((this.f430d - 4) / 8) + 1) * 2)) + 15;
    }

    /* renamed from: a */
    private static int m730a(long j, boolean z) throws C0213t {
        int i;
        int i2;
        int i3 = 0;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i4 = i - i2;
        int[] iArr = new int[i];
        for (i--; i >= 0; i--) {
            iArr[i] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C0182e(C0180c.f685j).m1124a(iArr, i4);
            for (int i5 = 0; i5 < i2; i5++) {
                i3 = iArr[i5] + (i3 << 4);
            }
            return i3;
        } catch (C0179b e) {
            throw C0213t.m1269a();
        }
    }

    /* renamed from: a */
    private int m731a(C0125a c0125a, C0125a c0125a2) {
        float b = C0126b.m742b(c0125a, c0125a2);
        float b2 = ((float) (c0125a2.m726b() - c0125a.m726b())) / b;
        float c = ((float) (c0125a2.m727c() - c0125a.m727c())) / b;
        float b3 = (float) c0125a.m726b();
        float c2 = (float) c0125a.m727c();
        boolean d = this.f429c.m1221d(c0125a.m726b(), c0125a.m727c());
        int ceil = (int) Math.ceil((double) b);
        int i = 0;
        float f = b3;
        b3 = c2;
        for (int i2 = 0; i2 < ceil; i2++) {
            f += b2;
            b3 += c;
            if (this.f429c.m1221d(C0175a.m1082a(f), C0175a.m1082a(b3)) != d) {
                i++;
            }
        }
        float f2 = ((float) i) / b;
        if (f2 > 0.1f && f2 < 0.9f) {
            return 0;
        }
        return ((f2 > 0.1f ? 1 : (f2 == 0.1f ? 0 : -1)) <= 0) == d ? 1 : -1;
    }

    /* renamed from: a */
    private int m732a(eb ebVar, eb ebVar2, int i) {
        int i2 = 0;
        float a = C0126b.m728a(ebVar, ebVar2);
        float f = a / ((float) i);
        float b = ebVar.m312b();
        float a2 = ebVar.m311a();
        float b2 = ((ebVar2.m312b() - ebVar.m312b()) * f) / a;
        f = (f * (ebVar2.m311a() - ebVar.m311a())) / a;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f429c.m1221d(C0175a.m1082a((((float) i3) * b2) + b), C0175a.m1082a((((float) i3) * f) + a2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m733a(int[] iArr, int i) throws C0213t {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += (i4 & 1) + ((i4 >> (i - 2)) << 1);
        }
        int i5 = ((i3 & 1) << 11) + (i3 >> 1);
        while (i2 < 4) {
            try {
                if (Integer.bitCount(f426e[i2] ^ i5) <= 2) {
                    return i2;
                }
                i2++;
            } catch (C0213t e) {
                throw e;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private C0125a m734a(C0125a c0125a, boolean z, int i, int i2) {
        int b = c0125a.m726b() + i;
        int c = c0125a.m727c() + i2;
        while (m737a(b, c) && this.f429c.m1221d(b, c) == z) {
            b += i;
            c += i2;
        }
        int i3 = c - i2;
        c = b - i;
        while (m737a(c, i3) && this.f429c.m1221d(c, i3) == z) {
            c += i;
        }
        b = c - i;
        c = i3;
        while (m737a(b, c) && this.f429c.m1221d(b, c) == z) {
            c += i2;
        }
        return new C0125a(b, c - i2);
    }

    /* renamed from: a */
    private C0194n m735a(C0194n c0194n, eb ebVar, eb ebVar2, eb ebVar3, eb ebVar4) throws C0213t {
        C0183d a = C0183d.m1125a();
        int a2 = m729a();
        float f = (((float) a2) / 2.0f) - ((float) this.f431f);
        float f2 = (((float) a2) / 2.0f) + ((float) this.f431f);
        return a.mo32a(c0194n, a2, a2, f, f, f2, f, f2, f2, f, f2, ebVar.m312b(), ebVar.m311a(), ebVar2.m312b(), ebVar2.m311a(), ebVar3.m312b(), ebVar3.m311a(), ebVar4.m312b(), ebVar4.m311a());
    }

    /* renamed from: a */
    private void m736a(eb[] ebVarArr) throws C0213t {
        try {
            if (m739a(ebVarArr[0])) {
                if (m739a(ebVarArr[1])) {
                    try {
                        if (m739a(ebVarArr[2])) {
                            try {
                                if (m739a(ebVarArr[3])) {
                                    int[] iArr = new int[]{m732a(ebVarArr[0], ebVarArr[1], r1), m732a(ebVarArr[1], ebVarArr[2], r1), m732a(ebVarArr[2], ebVarArr[3], r1), m732a(ebVarArr[3], ebVarArr[0], this.f431f * 2)};
                                    this.f427a = C0126b.m733a(iArr, this.f431f * 2);
                                    long j = 0;
                                    for (int i = 0; i < 4; i++) {
                                        int i2 = iArr[(this.f427a + i) % 4];
                                        if (this.f428b) {
                                            j = (j << 7) + ((long) ((i2 >> 1) & C0607n.bx));
                                        } else {
                                            j = (j << 10) + ((long) (((i2 >> 1) & 31) + ((i2 >> 2) & 992)));
                                        }
                                    }
                                    int a = C0126b.m730a(j, this.f428b);
                                    try {
                                        if (this.f428b) {
                                            this.f430d = (a >> 6) + 1;
                                            this.f432g = (a & 63) + 1;
                                            return;
                                        }
                                        this.f430d = (a >> 11) + 1;
                                        this.f432g = (a & C0607n.fs) + 1;
                                        return;
                                    } catch (C0213t e) {
                                        throw e;
                                    }
                                }
                            } catch (C0213t e2) {
                                throw e2;
                            }
                        }
                    } catch (C0213t e22) {
                        throw e22;
                    }
                }
            }
            throw C0213t.m1269a();
        } catch (C0213t e222) {
            throw e222;
        } catch (C0213t e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    private boolean m737a(int i, int i2) {
        return i >= 0 && i < this.f429c.m1208a() && i2 > 0 && i2 < this.f429c.m1226i();
    }

    /* renamed from: a */
    private boolean m738a(C0125a c0125a, C0125a c0125a2, C0125a c0125a3, C0125a c0125a4) {
        C0125a c0125a5 = new C0125a(c0125a.m726b() - 3, c0125a.m727c() + 3);
        C0125a c0125a6 = new C0125a(c0125a2.m726b() - 3, c0125a2.m727c() - 3);
        C0125a c0125a7 = new C0125a(c0125a3.m726b() + 3, c0125a3.m727c() - 3);
        C0125a c0125a8 = new C0125a(c0125a4.m726b() + 3, 3 + c0125a4.m727c());
        int a = m731a(c0125a8, c0125a5);
        return a != 0 && m731a(c0125a5, c0125a6) == a && m731a(c0125a6, c0125a7) == a && m731a(c0125a7, c0125a8) == a;
    }

    /* renamed from: a */
    private boolean m739a(eb ebVar) {
        return m737a(C0175a.m1082a(ebVar.m312b()), C0175a.m1082a(ebVar.m311a()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private p000a.p001a.p002a.eb[] m740a(p000a.p001a.p002a.p015d.p016a.C0125a r15) throws p000a.p001a.p002a.C0213t {
        /*
        r14 = this;
        r0 = 1;
        r1 = 1;
        r14.f431f = r1;
        r2 = r15;
        r4 = r15;
        r6 = r15;
    L_0x0007:
        r1 = r14.f431f;
        r3 = 9;
        if (r1 >= r3) goto L_0x0051;
    L_0x000d:
        r1 = 1;
        r3 = -1;
        r7 = r14.m734a(r6, r0, r1, r3);
        r1 = 1;
        r3 = 1;
        r5 = r14.m734a(r4, r0, r1, r3);
        r1 = -1;
        r3 = 1;
        r3 = r14.m734a(r2, r0, r1, r3);
        r1 = -1;
        r8 = -1;
        r1 = r14.m734a(r15, r0, r1, r8);
        r8 = r14.f431f;
        r9 = 2;
        if (r8 <= r9) goto L_0x0064;
    L_0x002a:
        r8 = p000a.p001a.p002a.p015d.p016a.C0126b.m742b(r1, r7);
        r9 = r14.f431f;
        r9 = (float) r9;
        r8 = r8 * r9;
        r9 = p000a.p001a.p002a.p015d.p016a.C0126b.m742b(r15, r6);
        r10 = r14.f431f;
        r10 = r10 + 2;
        r10 = (float) r10;
        r9 = r9 * r10;
        r8 = r8 / r9;
        r10 = (double) r8;
        r12 = 4604930618986332160; // 0x3fe8000000000000 float:0.0 double:0.75;
        r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r9 < 0) goto L_0x0051;
    L_0x0044:
        r8 = (double) r8;
        r10 = 4608308318706860032; // 0x3ff4000000000000 float:0.0 double:1.25;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 > 0) goto L_0x0051;
    L_0x004b:
        r8 = r14.m738a(r7, r5, r3, r1);	 Catch:{ t -> 0x0062 }
        if (r8 != 0) goto L_0x0064;
    L_0x0051:
        r0 = r14.f431f;	 Catch:{ t -> 0x0074 }
        r1 = 5;
        if (r0 == r1) goto L_0x0076;
    L_0x0056:
        r0 = r14.f431f;	 Catch:{ t -> 0x0060 }
        r1 = 7;
        if (r0 == r1) goto L_0x0076;
    L_0x005b:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x0060 }
        throw r0;	 Catch:{ t -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        if (r0 != 0) goto L_0x0072;
    L_0x0066:
        r0 = 1;
    L_0x0067:
        r2 = r14.f431f;
        r2 = r2 + 1;
        r14.f431f = r2;
        r15 = r1;
        r2 = r3;
        r4 = r5;
        r6 = r7;
        goto L_0x0007;
    L_0x0072:
        r0 = 0;
        goto L_0x0067;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ t -> 0x0060 }
    L_0x0076:
        r0 = r14.f431f;	 Catch:{ t -> 0x00f2 }
        r1 = 5;
        if (r0 != r1) goto L_0x00f4;
    L_0x007b:
        r0 = 1;
    L_0x007c:
        r14.f428b = r0;
        r0 = new a.a.a.eb;
        r1 = r6.m726b();
        r1 = (float) r1;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r1 + r3;
        r3 = r6.m727c();
        r3 = (float) r3;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r3 - r5;
        r0.<init>(r1, r3);
        r1 = new a.a.a.eb;
        r3 = r4.m726b();
        r3 = (float) r3;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r3 + r5;
        r4 = r4.m727c();
        r4 = (float) r4;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r4 + r5;
        r1.<init>(r3, r4);
        r3 = new a.a.a.eb;
        r4 = r2.m726b();
        r4 = (float) r4;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r4 - r5;
        r2 = r2.m727c();
        r2 = (float) r2;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = r2 + r5;
        r3.<init>(r4, r2);
        r2 = new a.a.a.eb;
        r4 = r15.m726b();
        r4 = (float) r4;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r4 - r5;
        r5 = r15.m727c();
        r5 = (float) r5;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = r5 - r6;
        r2.<init>(r4, r5);
        r4 = 4;
        r4 = new p000a.p001a.p002a.eb[r4];
        r5 = 0;
        r4[r5] = r0;
        r0 = 1;
        r4[r0] = r1;
        r0 = 2;
        r4[r0] = r3;
        r0 = 3;
        r4[r0] = r2;
        r0 = r14.f431f;
        r0 = r0 * 2;
        r0 = r0 + -3;
        r0 = (float) r0;
        r1 = r14.f431f;
        r1 = r1 * 2;
        r1 = (float) r1;
        r0 = p000a.p001a.p002a.p015d.p016a.C0126b.m741a(r4, r0, r1);
        return r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;
    L_0x00f4:
        r0 = 0;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.d.a.b.a(a.a.a.d.a.a):a.a.a.eb[]");
    }

    /* renamed from: a */
    private static eb[] m741a(eb[] ebVarArr, float f, float f2) {
        float f3 = f2 / (2.0f * f);
        float b = ebVarArr[0].m312b() - ebVarArr[2].m312b();
        float a = ebVarArr[0].m311a() - ebVarArr[2].m311a();
        float b2 = (ebVarArr[0].m312b() + ebVarArr[2].m312b()) / 2.0f;
        float a2 = (ebVarArr[0].m311a() + ebVarArr[2].m311a()) / 2.0f;
        eb ebVar = new eb((f3 * b) + b2, (f3 * a) + a2);
        eb ebVar2 = new eb(b2 - (b * f3), a2 - (a * f3));
        b = ebVarArr[1].m312b() - ebVarArr[3].m312b();
        a = ebVarArr[1].m311a() - ebVarArr[3].m311a();
        b2 = (ebVarArr[1].m312b() + ebVarArr[3].m312b()) / 2.0f;
        a2 = (ebVarArr[1].m311a() + ebVarArr[3].m311a()) / 2.0f;
        eb ebVar3 = new eb((f3 * b) + b2, (f3 * a) + a2);
        eb ebVar4 = new eb(b2 - (b * f3), a2 - (f3 * a));
        return new eb[]{ebVar, ebVar3, ebVar2, ebVar4};
    }

    /* renamed from: b */
    private static float m742b(C0125a c0125a, C0125a c0125a2) {
        return C0175a.m1081a(c0125a.m726b(), c0125a.m727c(), c0125a2.m726b(), c0125a2.m727c());
    }

    /* renamed from: b */
    private C0125a m743b() {
        eb ebVar;
        eb ebVar2;
        eb ebVar3;
        eb ebVar4;
        int a;
        int i;
        try {
            eb[] a2 = new C0176b(this.f429c).m1087a();
            ebVar = a2[0];
            ebVar2 = a2[1];
            ebVar3 = a2[2];
            ebVar4 = a2[3];
        } catch (C0213t e) {
            a = this.f429c.m1208a() / 2;
            i = this.f429c.m1226i() / 2;
            ebVar = m734a(new C0125a(a + 7, i - 7), false, 1, -1).m725a();
            ebVar2 = m734a(new C0125a(a + 7, i + 7), false, 1, 1).m725a();
            ebVar3 = m734a(new C0125a(a - 7, i + 7), false, -1, 1).m725a();
            ebVar4 = m734a(new C0125a(a - 7, i - 7), false, -1, -1).m725a();
        }
        i = C0175a.m1082a((((ebVar.m312b() + ebVar4.m312b()) + ebVar2.m312b()) + ebVar3.m312b()) / 4.0f);
        a = C0175a.m1082a((((ebVar4.m311a() + ebVar.m311a()) + ebVar2.m311a()) + ebVar3.m311a()) / 4.0f);
        try {
            eb[] a3 = new C0176b(this.f429c, 15, i, a).m1087a();
            ebVar = a3[0];
            ebVar2 = a3[1];
            ebVar3 = a3[2];
            ebVar4 = a3[3];
        } catch (C0213t e2) {
            ebVar = m734a(new C0125a(i + 7, a - 7), false, 1, -1).m725a();
            ebVar2 = m734a(new C0125a(i + 7, a + 7), false, 1, 1).m725a();
            ebVar3 = m734a(new C0125a(i - 7, a + 7), false, -1, 1).m725a();
            ebVar4 = m734a(new C0125a(i - 7, a - 7), false, -1, -1).m725a();
        }
        return new C0125a(C0175a.m1082a((((ebVar.m312b() + ebVar4.m312b()) + ebVar2.m312b()) + ebVar3.m312b()) / 4.0f), C0175a.m1082a((((ebVar4.m311a() + ebVar.m311a()) + ebVar2.m311a()) + ebVar3.m311a()) / 4.0f));
    }

    /* renamed from: b */
    private eb[] m744b(eb[] ebVarArr) {
        return C0126b.m741a(ebVarArr, (float) (this.f431f * 2), (float) m729a());
    }

    /* renamed from: a */
    public C0140e m745a(boolean z) throws C0213t {
        eb[] a = m740a(m743b());
        if (z) {
            eb ebVar = a[0];
            a[0] = a[2];
            a[2] = ebVar;
        }
        m736a(a);
        return new C0140e(m735a(this.f429c, a[this.f427a % 4], a[(this.f427a + 1) % 4], a[(this.f427a + 2) % 4], a[(this.f427a + 3) % 4]), m744b(a), this.f428b, this.f432g, this.f430d);
    }

    /* renamed from: c */
    public C0140e m746c() throws C0213t {
        return m745a(false);
    }
}
