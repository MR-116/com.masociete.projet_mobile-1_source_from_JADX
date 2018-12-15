package p000a.p001a.p002a.p007b.p008a;

/* renamed from: a.a.a.b.a.a */
final class C0032a {
    /* renamed from: b */
    private static final int[][] f103b = new int[][]{new int[]{f104d, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    /* renamed from: d */
    private static final int f104d = 21522;
    /* renamed from: a */
    private final C0046o f105a;
    /* renamed from: c */
    private final byte f106c;

    private C0032a(int i) {
        this.f105a = C0046o.forBits((i >> 3) & 3);
        this.f106c = (byte) (i & 7);
    }

    /* renamed from: a */
    private static C0032a m212a(int i, int i2) {
        int i3 = Integer.MAX_VALUE;
        int[][] iArr = f103b;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr2 = iArr[i4];
            int i6 = iArr2[0];
            if (i6 == i || i6 == i2) {
                return new C0032a(iArr2[1]);
            }
            int i7;
            int c = C0032a.m214c(i, i6);
            if (c < i3) {
                i3 = iArr2[1];
            } else {
                c = i3;
                i3 = i5;
            }
            if (i != i2) {
                i5 = C0032a.m214c(i2, i6);
                if (i5 < c) {
                    i3 = iArr2[1];
                    i4++;
                    i7 = i3;
                    i3 = i5;
                    i5 = i7;
                }
            }
            i5 = c;
            i4++;
            i7 = i3;
            i3 = i5;
            i5 = i7;
        }
        return i3 <= 3 ? new C0032a(i5) : null;
    }

    /* renamed from: b */
    static C0032a m213b(int i, int i2) {
        C0032a a = C0032a.m212a(i, i2);
        return a != null ? a : C0032a.m212a(i ^ f104d, i2 ^ f104d);
    }

    /* renamed from: c */
    static int m214c(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* renamed from: a */
    C0046o m215a() {
        return this.f105a;
    }

    /* renamed from: b */
    byte m216b() {
        return this.f106c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0032a)) {
            return false;
        }
        C0032a c0032a = (C0032a) obj;
        return this.f105a == c0032a.f105a && this.f106c == c0032a.f106c;
    }

    public int hashCode() {
        return (this.f105a.ordinal() << 3) | this.f106c;
    }
}
