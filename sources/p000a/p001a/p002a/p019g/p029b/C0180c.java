package p000a.p001a.p002a.p019g.p029b;

/* renamed from: a.a.a.g.b.c */
public final class C0180c {
    /* renamed from: d */
    public static final C0180c f682d = new C0180c(4201, 4096, 1);
    /* renamed from: e */
    public static final C0180c f683e = new C0180c(301, 256, 1);
    /* renamed from: h */
    public static final C0180c f684h = new C0180c(67, 64, 1);
    /* renamed from: j */
    public static final C0180c f685j = new C0180c(19, 16, 1);
    /* renamed from: k */
    public static final C0180c f686k = f683e;
    /* renamed from: l */
    public static final C0180c f687l = new C0180c(285, 256, 0);
    /* renamed from: n */
    public static final C0180c f688n = f684h;
    /* renamed from: o */
    public static final C0180c f689o = new C0180c(1033, 1024, 1);
    /* renamed from: z */
    private static final String f690z = C0180c.m1104z(C0180c.m1105z("\u0000\u0016$D\u0010"));
    /* renamed from: a */
    private final int f691a;
    /* renamed from: b */
    private final C0178a f692b;
    /* renamed from: c */
    private final C0178a f693c;
    /* renamed from: f */
    private final int[] f694f;
    /* renamed from: g */
    private final int[] f695g;
    /* renamed from: i */
    private final int f696i;
    /* renamed from: m */
    private final int f697m;

    public C0180c(int i, int i2, int i3) {
        this.f691a = i;
        this.f696i = i2;
        this.f697m = i3;
        this.f694f = new int[i2];
        this.f695g = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f694f[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        i4 = 0;
        while (i4 < i2 - 1) {
            try {
                this.f695g[this.f694f[i4]] = i4;
                i4++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f693c = new C0178a(this, new int[]{0});
        this.f692b = new C0178a(this, new int[]{1});
    }

    /* renamed from: a */
    static int m1103a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: z */
    private static String m1104z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 71;
                    break;
                case 1:
                    i2 = 80;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 116;
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
    private static char[] m1105z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m1106a(int i) {
        return this.f694f[i];
    }

    /* renamed from: a */
    C0178a m1107a() {
        return this.f692b;
    }

    /* renamed from: b */
    public int m1108b() {
        return this.f696i;
    }

    /* renamed from: b */
    int m1109b(int i) {
        if (i != 0) {
            return this.f694f[(this.f696i - this.f695g[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: b */
    C0178a m1110b(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.f693c;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0178a(this, iArr);
        }
    }

    /* renamed from: c */
    int m1111c(int i) {
        if (i != 0) {
            return this.f695g[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: c */
    int m1112c(int i, int i2) {
        return (i == 0 || i2 == 0) ? 0 : this.f694f[(this.f695g[i] + this.f695g[i2]) % (this.f696i - 1)];
    }

    /* renamed from: c */
    C0178a m1113c() {
        return this.f693c;
    }

    /* renamed from: d */
    public int m1114d() {
        return this.f697m;
    }

    public String toString() {
        return f690z + Integer.toHexString(this.f691a) + ',' + this.f696i + ')';
    }
}
