package p000a.p001a.p002a.p011c;

import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.m */
public final class C0111m extends C0091l {
    /* renamed from: b */
    static final char[] f347b = f350f.toCharArray();
    /* renamed from: c */
    private static final float f348c = 1.5f;
    /* renamed from: d */
    private static final char[] f349d = new char[]{qb.f3195j, 'B', qb.f3208x, 'D'};
    /* renamed from: f */
    private static final String f350f = C0111m.m645z(C0111m.m646z(";v\u000bb\u0011>q\u000ei\u001c&c\u0003~\u000b \u0006{\u0012a"));
    /* renamed from: g */
    private static final int f351g = 3;
    /* renamed from: h */
    static final int[] f352h = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    /* renamed from: i */
    private static final float f353i = 2.0f;
    /* renamed from: a */
    private int f354a = 0;
    /* renamed from: e */
    private final StringBuilder f355e = new StringBuilder(20);
    /* renamed from: j */
    private int[] f356j = new int[80];

    /* renamed from: a */
    private void m639a(int i) throws C0213t {
        int[] iArr = new int[]{0, 0, 0, 0};
        int[] iArr2 = new int[]{0, 0, 0, 0};
        int length = this.f355e.length() - 1;
        int i2 = 0;
        int i3 = i;
        while (true) {
            int i4;
            int i5 = f352h[this.f355e.charAt(i2)];
            for (i4 = 6; i4 >= 0; i4--) {
                int i6 = (i4 & 1) + ((i5 & 1) * 2);
                iArr[i6] = iArr[i6] + this.f356j[i3 + i4];
                iArr2[i6] = iArr2[i6] + 1;
                i5 >>= 1;
            }
            if (i2 >= length) {
                break;
            }
            i3 += 8;
            i2++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        i2 = 0;
        while (i2 < 2) {
            try {
                fArr2[i2] = 0.0f;
                fArr2[i2 + 2] = ((((float) iArr[i2]) / ((float) iArr2[i2])) + (((float) iArr[i2 + 2]) / ((float) iArr2[i2 + 2]))) / f353i;
                fArr[i2] = fArr2[i2 + 2];
                fArr[i2 + 2] = ((((float) iArr[i2 + 2]) * f353i) + f348c) / ((float) iArr2[i2 + 2]);
                i2++;
            } catch (C0213t e) {
                throw e;
            }
        }
        i2 = 0;
        loop3:
        while (true) {
            i4 = f352h[this.f355e.charAt(i2)];
            i3 = 6;
            while (i3 >= 0) {
                int i7 = (i3 & 1) + ((i4 & 1) * 2);
                int i8 = this.f356j[i + i3];
                try {
                    if (((float) i8) < fArr2[i7]) {
                        break loop3;
                    }
                    if (((float) i8) > fArr[i7]) {
                        break loop3;
                    }
                    i4 >>= 1;
                    i3--;
                } catch (C0213t e2) {
                    throw e2;
                } catch (C0213t e22) {
                    throw e22;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: a */
    private void m640a(C0185f c0185f) throws C0213t {
        this.f354a = 0;
        int f = c0185f.m1152f(0);
        int a = c0185f.m1136a();
        if (f >= a) {
            try {
                throw C0213t.m1269a();
            } catch (C0213t e) {
                throw e;
            }
        }
        int i = 1;
        int i2 = f;
        f = 0;
        while (i2 < a) {
            try {
                if ((c0185f.m1149c(i2) ^ i) != 0) {
                    f++;
                } else {
                    m644c(f);
                    i = i == 0 ? 1 : 0;
                    f = 1;
                }
                i2++;
            } catch (C0213t e2) {
                throw e2;
            }
        }
        m644c(f);
    }

    /* renamed from: a */
    static boolean m641a(char[] cArr, char c) {
        if (cArr == null) {
            return false;
        }
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m642b() throws C0213t {
        for (int i = 1; i < this.f354a; i += 2) {
            int b = m643b(i);
            if (b != -1) {
                try {
                    if (C0111m.m641a(f349d, f347b[b])) {
                        int i2 = 0;
                        for (b = i; b < i + 7; b++) {
                            i2 += this.f356j[b];
                        }
                        if (i != 1) {
                            try {
                                if (this.f356j[i - 1] >= i2 / 2) {
                                }
                            } catch (C0213t e) {
                                throw e;
                            }
                        }
                        return i;
                    }
                    continue;
                } catch (C0213t e2) {
                    throw e2;
                }
            }
        }
        throw C0213t.m1269a();
    }

    /* renamed from: b */
    private int m643b(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = i + 7;
        if (i3 >= this.f354a) {
            return -1;
        }
        int[] iArr = this.f356j;
        int i4 = i;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = iArr[i4];
            if (i7 < i5) {
                i5 = i7;
            }
            if (i7 <= i6) {
                i7 = i6;
            }
            i4 += 2;
            i6 = i7;
        }
        i5 = (i5 + i6) / 2;
        i4 = i + 1;
        i6 = 0;
        while (i4 < i3) {
            i7 = iArr[i4];
            if (i7 < i2) {
                i2 = i7;
            }
            if (i7 <= i6) {
                i7 = i6;
            }
            i4 += 2;
            i6 = i7;
        }
        i6 = (i2 + i6) / 2;
        i4 = 0;
        i2 = 0;
        i3 = 128;
        while (i4 < 7) {
            i3 >>= 1;
            i7 = iArr[i + i4] > ((i4 & 1) == 0 ? i5 : i6) ? i2 | i3 : i2;
            i4++;
            i2 = i7;
        }
        for (i7 = 0; i7 < f352h.length; i7++) {
            if (f352h[i7] == i2) {
                return i7;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m644c(int i) {
        this.f356j[this.f354a] = i;
        this.f354a++;
        if (this.f354a >= this.f356j.length) {
            Object obj = new int[(this.f354a * 2)];
            System.arraycopy(this.f356j, 0, obj, 0, this.f354a);
            this.f356j = obj;
        }
    }

    /* renamed from: z */
    private static String m645z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 71;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 81;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m646z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public p000a.p001a.p002a.C0208m mo20a(int r11, p000a.p001a.p002a.p019g.C0185f r12, java.util.Map<p000a.p001a.p002a.C0216w, ?> r13) throws p000a.p001a.p002a.C0213t {
        /*
        r10 = this;
        r9 = 1;
        r8 = -1;
        r4 = 0;
        r0 = r10.f356j;
        java.util.Arrays.fill(r0, r4);
        r10.m640a(r12);
        r1 = r10.m642b();
        r0 = r10.f355e;
        r0.setLength(r4);
        r0 = r1;
    L_0x0015:
        r2 = r10.m643b(r0);
        if (r2 != r8) goto L_0x0020;
    L_0x001b:
        r0 = p000a.p001a.p002a.C0213t.m1269a();
        throw r0;
    L_0x0020:
        r3 = r10.f355e;	 Catch:{ t -> 0x0050 }
        r5 = (char) r2;	 Catch:{ t -> 0x0050 }
        r3.append(r5);	 Catch:{ t -> 0x0050 }
        r0 = r0 + 8;
        r3 = r10.f355e;	 Catch:{ t -> 0x0050 }
        r3 = r3.length();	 Catch:{ t -> 0x0050 }
        if (r3 <= r9) goto L_0x0054;
    L_0x0030:
        r3 = f349d;	 Catch:{ t -> 0x0052 }
        r5 = f347b;	 Catch:{ t -> 0x0052 }
        r2 = r5[r2];	 Catch:{ t -> 0x0052 }
        r2 = p000a.p001a.p002a.p011c.C0111m.m641a(r3, r2);	 Catch:{ t -> 0x0052 }
        if (r2 == 0) goto L_0x0054;
    L_0x003c:
        r2 = r10.f356j;
        r3 = r0 + -1;
        r5 = r2[r3];
        r2 = -8;
        r3 = r4;
    L_0x0044:
        if (r2 >= r8) goto L_0x0059;
    L_0x0046:
        r6 = r10.f356j;
        r7 = r0 + r2;
        r6 = r6[r7];
        r3 = r3 + r6;
        r2 = r2 + 1;
        goto L_0x0044;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ t -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r2 = r10.f354a;
        if (r0 < r2) goto L_0x0015;
    L_0x0058:
        goto L_0x003c;
    L_0x0059:
        r2 = r10.f354a;	 Catch:{ t -> 0x0068 }
        if (r0 >= r2) goto L_0x006a;
    L_0x005d:
        r2 = r3 / 2;
        if (r5 >= r2) goto L_0x006a;
    L_0x0061:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x0066 }
        throw r0;	 Catch:{ t -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ t -> 0x0066 }
    L_0x006a:
        r10.m639a(r1);
        r2 = r4;
    L_0x006e:
        r3 = r10.f355e;	 Catch:{ t -> 0x0088 }
        r3 = r3.length();	 Catch:{ t -> 0x0088 }
        if (r2 >= r3) goto L_0x008a;
    L_0x0076:
        r3 = r10.f355e;	 Catch:{ t -> 0x0088 }
        r5 = f347b;	 Catch:{ t -> 0x0088 }
        r6 = r10.f355e;	 Catch:{ t -> 0x0088 }
        r6 = r6.charAt(r2);	 Catch:{ t -> 0x0088 }
        r5 = r5[r6];	 Catch:{ t -> 0x0088 }
        r3.setCharAt(r2, r5);	 Catch:{ t -> 0x0088 }
        r2 = r2 + 1;
        goto L_0x006e;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r2 = r10.f355e;
        r2 = r2.charAt(r4);
        r3 = f349d;	 Catch:{ t -> 0x009d }
        r2 = p000a.p001a.p002a.p011c.C0111m.m641a(r3, r2);	 Catch:{ t -> 0x009d }
        if (r2 != 0) goto L_0x009f;
    L_0x0098:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x009d }
        throw r0;	 Catch:{ t -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r2 = r10.f355e;
        r3 = r10.f355e;
        r3 = r3.length();
        r3 = r3 + -1;
        r2 = r2.charAt(r3);
        r3 = f349d;	 Catch:{ t -> 0x00ba }
        r2 = p000a.p001a.p002a.p011c.C0111m.m641a(r3, r2);	 Catch:{ t -> 0x00ba }
        if (r2 != 0) goto L_0x00bc;
    L_0x00b5:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x00ba }
        throw r0;	 Catch:{ t -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r2 = r10.f355e;	 Catch:{ t -> 0x00ca }
        r2 = r2.length();	 Catch:{ t -> 0x00ca }
        r3 = 3;
        if (r2 > r3) goto L_0x00cc;
    L_0x00c5:
        r0 = p000a.p001a.p002a.C0213t.m1269a();	 Catch:{ t -> 0x00ca }
        throw r0;	 Catch:{ t -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        if (r13 == 0) goto L_0x00d6;
    L_0x00ce:
        r2 = p000a.p001a.p002a.C0216w.RETURN_CODABAR_START_END;	 Catch:{ t -> 0x00f7 }
        r2 = r13.containsKey(r2);	 Catch:{ t -> 0x00f7 }
        if (r2 != 0) goto L_0x00e9;
    L_0x00d6:
        r2 = r10.f355e;	 Catch:{ t -> 0x00f7 }
        r3 = r10.f355e;	 Catch:{ t -> 0x00f7 }
        r3 = r3.length();	 Catch:{ t -> 0x00f7 }
        r3 = r3 + -1;
        r2.deleteCharAt(r3);	 Catch:{ t -> 0x00f7 }
        r2 = r10.f355e;	 Catch:{ t -> 0x00f7 }
        r3 = 0;
        r2.deleteCharAt(r3);	 Catch:{ t -> 0x00f7 }
    L_0x00e9:
        r3 = r4;
        r2 = r4;
    L_0x00eb:
        if (r3 >= r1) goto L_0x00f9;
    L_0x00ed:
        r5 = r10.f356j;
        r5 = r5[r3];
        r5 = r5 + r2;
        r2 = r3 + 1;
        r3 = r2;
        r2 = r5;
        goto L_0x00eb;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r3 = (float) r2;
    L_0x00fa:
        r5 = r0 + -1;
        if (r1 >= r5) goto L_0x0106;
    L_0x00fe:
        r5 = r10.f356j;
        r5 = r5[r1];
        r2 = r2 + r5;
        r1 = r1 + 1;
        goto L_0x00fa;
    L_0x0106:
        r0 = (float) r2;
        r1 = new a.a.a.m;
        r2 = r10.f355e;
        r2 = r2.toString();
        r5 = 0;
        r6 = 2;
        r6 = new p000a.p001a.p002a.eb[r6];
        r7 = new a.a.a.eb;
        r8 = (float) r11;
        r7.<init>(r3, r8);
        r6[r4] = r7;
        r3 = new a.a.a.eb;
        r4 = (float) r11;
        r3.<init>(r0, r4);
        r6[r9] = r3;
        r0 = p000a.p001a.p002a.C0217x.CODABAR;
        r1.<init>(r2, r5, r6, r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.c.m.a(int, a.a.a.g.f, java.util.Map):a.a.a.m");
    }
}
