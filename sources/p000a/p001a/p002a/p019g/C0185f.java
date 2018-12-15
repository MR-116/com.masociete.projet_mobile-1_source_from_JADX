package p000a.p001a.p002a.p019g;

import java.util.Arrays;

/* renamed from: a.a.a.g.f */
public final class C0185f implements Cloneable {
    /* renamed from: z */
    private static final String[] f704z = new String[]{C0185f.m1134z(C0185f.m1135z("84\u0011P\u001bK9\u0004[O\u001f}\u0006T\u001c\b5")), C0185f.m1134z(C0185f.m1135z("%(\u0006\u0015\n\u0002)\u0018\u0015\u0005\u001e.\u001f\u0015\n\u000e}\tP\u001c\u001c8\u000e[H[}\n[\fKnY"))};
    /* renamed from: a */
    private int f705a;
    /* renamed from: b */
    private int[] f706b;

    public C0185f() {
        this.f705a = 0;
        this.f706b = new int[1];
    }

    public C0185f(int i) {
        this.f705a = i;
        this.f706b = C0185f.m1133e(i);
    }

    C0185f(int[] iArr, int i) {
        this.f706b = iArr;
        this.f705a = i;
    }

    /* renamed from: d */
    private void m1132d(int i) {
        if (i > this.f706b.length * 32) {
            Object e = C0185f.m1133e(i);
            System.arraycopy(this.f706b, 0, e, 0, this.f706b.length);
            this.f706b = e;
        }
    }

    /* renamed from: e */
    private static int[] m1133e(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: z */
    private static String m1134z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 107;
                    break;
                case 1:
                    i2 = 93;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1135z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int m1136a() {
        return this.f705a;
    }

    /* renamed from: a */
    public void m1137a(int i) {
        int[] iArr = this.f706b;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] ^ (1 << (i & 31));
    }

    /* renamed from: a */
    public void m1138a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            try {
                throw new IllegalArgumentException(f704z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        m1132d(this.f705a + i2);
        while (i2 > 0) {
            m1141a(((i >> (i2 + -1)) & 1) == 1);
            i2--;
        }
    }

    /* renamed from: a */
    public void m1139a(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = i;
        while (i4 < i3) {
            int i6 = 0;
            int i7 = i5;
            i5 = 0;
            while (i6 < 8) {
                try {
                    if (m1149c(i7)) {
                        i5 |= 1 << (7 - i6);
                    }
                    i7++;
                    i6++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            bArr[i2 + i4] = (byte) i5;
            i4++;
            i5 = i7;
        }
    }

    /* renamed from: a */
    public void m1140a(C0185f c0185f) {
        int i = 0;
        try {
            if (this.f705a != c0185f.f705a) {
                throw new IllegalArgumentException(f704z[0]);
            }
            while (i < this.f706b.length) {
                try {
                    int[] iArr = this.f706b;
                    iArr[i] = iArr[i] ^ c0185f.f706b[i];
                    i++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m1141a(boolean z) {
        try {
            m1132d(this.f705a + 1);
            if (z) {
                int[] iArr = this.f706b;
                int i = this.f705a / 32;
                iArr[i] = iArr[i] | (1 << (this.f705a & 31));
            }
            this.f705a++;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean m1142a(int i, int i2, boolean z) {
        if (i2 >= i && i >= 0) {
            try {
                if (i2 <= this.f705a) {
                    if (i2 == i) {
                        return true;
                    }
                    int i3 = i2 - 1;
                    int i4 = i / 32;
                    int i5 = i3 / 32;
                    int i6 = i4;
                    while (i6 <= i5) {
                        int i7 = (2 << (i6 < i5 ? 31 : i3 & 31)) - (1 << (i6 > i4 ? 0 : i & 31));
                        try {
                            int i8 = this.f706b[i6] & i7;
                            if (!z) {
                                i7 = 0;
                            }
                            if (i8 != i7) {
                                return false;
                            }
                            i6++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    return true;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public int m1143b(int i) {
        try {
            if (i >= this.f705a) {
                return this.f705a;
            }
            int i2 = i / 32;
            int i3 = this.f706b[i2] & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 == this.f706b.length) {
                        return this.f705a;
                    }
                    i3 = this.f706b[i2];
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                return i3 > this.f705a ? this.f705a : i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    public void m1144b(int i, int i2) {
        this.f706b[i / 32] = i2;
    }

    /* renamed from: b */
    public void m1145b(C0185f c0185f) {
        int i = c0185f.f705a;
        m1132d(this.f705a + i);
        int i2 = 0;
        while (i2 < i) {
            try {
                m1141a(c0185f.m1149c(i2));
                i2++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: b */
    public int[] m1146b() {
        return this.f706b;
    }

    /* renamed from: c */
    public void m1147c() {
        int i = 0;
        int length = this.f706b.length;
        while (i < length) {
            try {
                this.f706b[i] = 0;
                i++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* renamed from: c */
    public void m1148c(int i, int i2) {
        if (i2 >= i && i >= 0) {
            try {
                if (i2 <= this.f705a) {
                    if (i2 != i) {
                        int i3 = i2 - 1;
                        int i4 = i / 32;
                        int i5 = i3 / 32;
                        int i6 = i4;
                        while (i6 <= i5) {
                            int i7 = (2 << (i6 < i5 ? 31 : i3 & 31)) - (1 << (i6 > i4 ? 0 : i & 31));
                            int[] iArr = this.f706b;
                            iArr[i6] = i7 | iArr[i6];
                            i6++;
                        }
                        return;
                    }
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public boolean m1149c(int i) {
        try {
            return (this.f706b[i / 32] & (1 << (i & 31))) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m1151e();
    }

    /* renamed from: d */
    public int m1150d() {
        return (this.f705a + 7) / 8;
    }

    /* renamed from: e */
    public C0185f m1151e() {
        return new C0185f((int[]) this.f706b.clone(), this.f705a);
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof C0185f)) {
                return false;
            }
            C0185f c0185f = (C0185f) obj;
            try {
                return this.f705a == c0185f.f705a ? Arrays.equals(this.f706b, c0185f.f706b) : false;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    public int m1152f(int i) {
        try {
            if (i >= this.f705a) {
                return this.f705a;
            }
            int i2 = i / 32;
            int i3 = (this.f706b[i2] ^ -1) & (((1 << (i & 31)) - 1) ^ -1);
            while (i3 == 0) {
                i2++;
                try {
                    if (i2 == this.f706b.length) {
                        return this.f705a;
                    }
                    i3 = this.f706b[i2] ^ -1;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            i3 = Integer.numberOfTrailingZeros(i3) + (i2 * 32);
            try {
                return i3 > this.f705a ? this.f705a : i3;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    public void m1153f() {
        int i;
        int i2 = 1;
        int[] iArr = new int[this.f706b.length];
        int i3 = (this.f705a - 1) / 32;
        int i4 = i3 + 1;
        for (i = 0; i < i4; i++) {
            long j = (long) this.f706b[i];
            j = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            j = ((j & 858993459) << 2) | ((j >> 2) & 858993459);
            j = ((j & 252645135) << 4) | ((j >> 4) & 252645135);
            j = ((j & 16711935) << 8) | ((j >> 8) & 16711935);
            iArr[i3 - i] = (int) (((j & 65535) << 16) | ((j >> 16) & 65535));
        }
        if (this.f705a != i4 * 32) {
            i3 = (i4 * 32) - this.f705a;
            i = iArr[0] >>> i3;
            while (i2 < i4) {
                int i5 = iArr[i2];
                iArr[i2 - 1] = i | (i5 << (32 - i3));
                i = i5 >>> i3;
                i2++;
            }
            iArr[i4 - 1] = i;
        }
        this.f706b = iArr;
    }

    /* renamed from: g */
    public void m1154g(int i) {
        int[] iArr = this.f706b;
        int i2 = i / 32;
        iArr[i2] = iArr[i2] | (1 << (i & 31));
    }

    public int hashCode() {
        return (this.f705a * 31) + Arrays.hashCode(this.f706b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.f705a);
        int i = 0;
        while (i < this.f705a) {
            try {
                if ((i & 7) == 0) {
                    stringBuilder.append(' ');
                }
                try {
                    stringBuilder.append(m1149c(i) ? 'X' : '.');
                    i++;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return stringBuilder.toString();
    }
}
