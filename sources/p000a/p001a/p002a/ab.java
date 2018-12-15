package p000a.p001a.p002a;

/* renamed from: a.a.a.ab */
public final class ab extends C0031y {
    /* renamed from: g */
    private static final int f96g = 2;
    /* renamed from: z */
    private static final String[] f97z = new String[]{ab.m203z(ab.m204z("\n:p\u0014.;-|\u0010o'/s\u0001.-'z\u0017.''kDh <?\u0013g= v\n. %~\u0003ki,~\u0010og")), ab.m203z(ab.m204z("\u001b-n\u0011k:<z\u0000.;'hDg:hp\u0011z:!{\u0001.= zDg$)x\u00014i"))};
    /* renamed from: c */
    private final int f98c;
    /* renamed from: d */
    private final int f99d;
    /* renamed from: e */
    private final int f100e;
    /* renamed from: f */
    private final int f101f;
    /* renamed from: h */
    private final byte[] f102h;

    public ab(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            try {
                throw new IllegalArgumentException(f97z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            this.f102h = bArr;
            this.f98c = i;
            this.f100e = i2;
            this.f99d = i3;
            this.f101f = i4;
            if (z) {
                m202a(i5, i6);
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private void m202a(int i, int i2) {
        byte[] bArr = this.f102h;
        int i3 = this.f99d + (this.f101f * this.f98c);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + (i / 2);
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i3 += this.f98c;
        }
    }

    /* renamed from: z */
    private static String m203z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 73;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 100;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m204z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 14);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0031y mo12a(int i, int i2, int i3, int i4) {
        return new ab(this.f102h, this.f98c, this.f100e, this.f99d + i, this.f101f + i2, i3, i4, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public byte[] mo13a(int r5, byte[] r6) {
        /*
        r4 = this;
        if (r5 < 0) goto L_0x0008;
    L_0x0002:
        r0 = r4.m198e();	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r5 < r0) goto L_0x0026;
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0024 }
        r2 = f97z;	 Catch:{ IllegalArgumentException -> 0x0024 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0024 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0024 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0024 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r4.m197d();
        if (r6 == 0) goto L_0x002f;
    L_0x002c:
        r1 = r6.length;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r1 >= r0) goto L_0x0031;
    L_0x002f:
        r6 = new byte[r0];
    L_0x0031:
        r1 = r4.f101f;
        r1 = r1 + r5;
        r2 = r4.f98c;
        r1 = r1 * r2;
        r2 = r4.f99d;
        r1 = r1 + r2;
        r2 = r4.f102h;
        r3 = 0;
        java.lang.System.arraycopy(r2, r1, r6, r3, r0);
        return r6;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.ab.a(int, byte[]):byte[]");
    }

    /* renamed from: b */
    public byte[] mo14b() {
        int d = m197d();
        int e = m198e();
        try {
            if (d == this.f98c) {
                if (e == this.f100e) {
                    return this.f102h;
                }
            }
            int i = d * e;
            Object obj = new byte[i];
            int i2 = (this.f101f * this.f98c) + this.f99d;
            try {
                if (d == this.f98c) {
                    System.arraycopy(this.f102h, i2, obj, 0, i);
                    return obj;
                }
                for (int i3 = 0; i3 < e; i3++) {
                    System.arraycopy(this.f102h, i2, obj, i3 * d, d);
                    i2 += this.f98c;
                }
                return obj;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* renamed from: h */
    public boolean mo15h() {
        return true;
    }

    /* renamed from: i */
    public int m209i() {
        return m197d() / 2;
    }

    /* renamed from: j */
    public int m210j() {
        return m198e() / 2;
    }

    /* renamed from: k */
    public int[] m211k() {
        int d = m197d() / 2;
        int e = m198e() / 2;
        int[] iArr = new int[(d * e)];
        byte[] bArr = this.f102h;
        int i = (this.f101f * this.f98c) + this.f99d;
        for (int i2 = 0; i2 < e; i2++) {
            int i3 = i2 * d;
            for (int i4 = 0; i4 < d; i4++) {
                iArr[i3 + i4] = ((bArr[(i4 * 2) + i] & 255) * 65793) | -16777216;
            }
            i += this.f98c * 2;
        }
        return iArr;
    }
}
