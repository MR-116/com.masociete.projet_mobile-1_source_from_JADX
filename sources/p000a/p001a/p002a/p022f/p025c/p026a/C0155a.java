package p000a.p001a.p002a.p022f.p025c.p026a;

import p000a.p001a.p002a.p022f.C0170d;

/* renamed from: a.a.a.f.c.a.a */
public final class C0155a {
    /* renamed from: b */
    public static final C0155a f576b = new C0155a(C0170d.f654d, 3);
    /* renamed from: a */
    private final int[] f577a;
    /* renamed from: c */
    private final int[] f578c;
    /* renamed from: d */
    private final C0156b f579d;
    /* renamed from: e */
    private final int f580e;
    /* renamed from: f */
    private final C0156b f581f;

    private C0155a(int i, int i2) {
        int i3;
        this.f580e = i;
        this.f578c = new int[i];
        this.f577a = new int[i];
        int i4 = 1;
        for (i3 = 0; i3 < i; i3++) {
            this.f578c[i3] = i4;
            i4 = (i4 * i2) % i;
        }
        i3 = 0;
        while (i3 < i - 1) {
            try {
                this.f577a[this.f578c[i3]] = i3;
                i3++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.f579d = new C0156b(this, new int[]{0});
        this.f581f = new C0156b(this, new int[]{1});
    }

    /* renamed from: a */
    int m915a() {
        return this.f580e;
    }

    /* renamed from: a */
    int m916a(int i) {
        if (i != 0) {
            return this.f578c[(this.f580e - this.f577a[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: a */
    int m917a(int i, int i2) {
        return (i == 0 || i2 == 0) ? 0 : this.f578c[(this.f577a[i] + this.f577a[i2]) % (this.f580e - 1)];
    }

    /* renamed from: b */
    int m918b(int i) {
        return this.f578c[i];
    }

    /* renamed from: b */
    C0156b m919b() {
        return this.f581f;
    }

    /* renamed from: b */
    C0156b m920b(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.f579d;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C0156b(this, iArr);
        }
    }

    /* renamed from: c */
    int m921c(int i) {
        if (i != 0) {
            return this.f577a[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: c */
    int m922c(int i, int i2) {
        return ((this.f580e + i) - i2) % this.f580e;
    }

    /* renamed from: c */
    C0156b m923c() {
        return this.f579d;
    }

    /* renamed from: d */
    int m924d(int i, int i2) {
        return (i + i2) % this.f580e;
    }
}
