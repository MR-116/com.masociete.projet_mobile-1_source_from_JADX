package p000a.p001a.p002a;

/* renamed from: a.a.a.bb */
public final class bb extends C0031y {
    /* renamed from: z */
    private static final String[] f202z = new String[]{bb.m415z(bb.m416z("+\"p+\n\u001a5|/K\u00067s>\n\f?z(\n\u0006?k{L\u0001$?,C\u001c8v5\n\u0001=~<OH4~/KF")), bb.m415z(bb.m416z(":5n.O\u001b$z?\n\u001a?h{C\u001bpp.^\u001b9{>\n\u001c8z{C\u00051x>\u0010H"))};
    /* renamed from: c */
    private final byte[] f203c;
    /* renamed from: d */
    private final int f204d;
    /* renamed from: e */
    private final int f205e;
    /* renamed from: f */
    private final int f206f;
    /* renamed from: g */
    private final int f207g;

    public bb(int i, int i2, int[] iArr) {
        int i3 = 0;
        super(i, i2);
        this.f206f = i;
        this.f207g = i2;
        this.f204d = 0;
        this.f205e = 0;
        int i4 = i * i2;
        this.f203c = new byte[i4];
        while (i3 < i4) {
            int i5 = iArr[i3];
            int i6 = (i5 >> 16) & 255;
            int i7 = (i5 >> 7) & 510;
            this.f203c[i3] = (byte) (((i5 & 255) + (i6 + i7)) / 4);
            i3++;
        }
    }

    private bb(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            try {
                throw new IllegalArgumentException(f202z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f203c = bArr;
        this.f206f = i;
        this.f207g = i2;
        this.f204d = i3;
        this.f205e = i4;
    }

    /* renamed from: z */
    private static String m415z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 80;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 91;
                    break;
                default:
                    i2 = 42;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m416z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 42);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0031y mo12a(int i, int i2, int i3, int i4) {
        return new bb(this.f203c, this.f206f, this.f207g, this.f204d + i, this.f205e + i2, i3, i4);
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
        r2 = f202z;	 Catch:{ IllegalArgumentException -> 0x0024 }
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
        r1 = r4.f205e;
        r1 = r1 + r5;
        r2 = r4.f206f;
        r1 = r1 * r2;
        r2 = r4.f204d;
        r1 = r1 + r2;
        r2 = r4.f203c;
        r3 = 0;
        java.lang.System.arraycopy(r2, r1, r6, r3, r0);
        return r6;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.bb.a(int, byte[]):byte[]");
    }

    /* renamed from: b */
    public byte[] mo14b() {
        int d = m197d();
        int e = m198e();
        try {
            if (d == this.f206f) {
                if (e == this.f207g) {
                    return this.f203c;
                }
            }
            int i = d * e;
            Object obj = new byte[i];
            int i2 = (this.f205e * this.f206f) + this.f204d;
            try {
                if (d == this.f206f) {
                    System.arraycopy(this.f203c, i2, obj, 0, i);
                    return obj;
                }
                for (int i3 = 0; i3 < e; i3++) {
                    System.arraycopy(this.f203c, i2, obj, i3 * d, d);
                    i2 += this.f206f;
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
}
