package p000a.p001a.p002a.p022f.p025c.p026a;

import p000a.p001a.p002a.C0211r;

/* renamed from: a.a.a.f.c.a.c */
public final class C0157c {
    /* renamed from: a */
    private final C0155a f585a = C0155a.f576b;

    /* renamed from: a */
    private int[] m938a(C0156b c0156b) throws C0211r {
        int a = c0156b.m927a();
        int[] iArr = new int[a];
        int i = 0;
        int i2 = 1;
        while (i2 < this.f585a.m915a() && i < a) {
            try {
                try {
                    if (c0156b.m931b(i2) == 0) {
                        iArr[i] = this.f585a.m916a(i2);
                        i++;
                    }
                    i2++;
                } catch (C0211r e) {
                    throw e;
                }
            } catch (C0211r e2) {
                throw e2;
            } catch (C0211r e22) {
                throw e22;
            }
        }
        if (i == a) {
            return iArr;
        }
        try {
            throw C0211r.m1265a();
        } catch (C0211r e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    private int[] m939a(C0156b c0156b, C0156b c0156b2, int[] iArr) {
        int i;
        int a = c0156b2.m927a();
        int[] iArr2 = new int[a];
        for (i = 1; i <= a; i++) {
            iArr2[a - i] = this.f585a.m917a(i, c0156b2.m934c(i));
        }
        C0156b c0156b3 = new C0156b(this.f585a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (i = 0; i < length; i++) {
            int a2 = this.f585a.m916a(iArr[i]);
            iArr3[i] = this.f585a.m917a(this.f585a.m922c(0, c0156b.m931b(a2)), this.f585a.m916a(c0156b3.m931b(a2)));
        }
        return iArr3;
    }

    /* renamed from: a */
    private C0156b[] m940a(C0156b c0156b, C0156b c0156b2, int i) throws C0211r {
        if (c0156b.m927a() >= c0156b2.m927a()) {
            C0156b c0156b3 = c0156b2;
            c0156b2 = c0156b;
            c0156b = c0156b3;
        }
        C0156b c = this.f585a.m923c();
        C0156b b = this.f585a.m919b();
        while (c0156b.m927a() >= i / 2) {
            try {
                if (c0156b.m936c()) {
                    throw C0211r.m1265a();
                }
                C0156b c2 = this.f585a.m923c();
                int a = this.f585a.m916a(c0156b.m934c(c0156b.m927a()));
                C0156b c0156b4 = c2;
                c2 = c0156b2;
                while (c2.m927a() >= c0156b.m927a() && !c2.m936c()) {
                    try {
                        int a2 = c2.m927a() - c0156b.m927a();
                        int a3 = this.f585a.m917a(c2.m934c(c2.m927a()), a);
                        c0156b4 = c0156b4.m935c(this.f585a.m920b(a2, a3));
                        c2 = c2.m930a(c0156b.m929a(a2, a3));
                    } catch (C0211r e) {
                        throw e;
                    }
                }
                c0156b2 = c0156b;
                c0156b = c2;
                c0156b3 = b;
                b = c0156b4.m932b(b).m930a(c).m937d();
                c = c0156b3;
            } catch (C0211r e2) {
                throw e2;
            }
        }
        int c3 = b.m934c(0);
        if (c3 == 0) {
            try {
                throw C0211r.m1265a();
            } catch (C0211r e22) {
                throw e22;
            }
        }
        c3 = this.f585a.m916a(c3);
        b = b.m928a(c3);
        c = c0156b.m928a(c3);
        return new C0156b[]{b, c};
    }

    /* renamed from: a */
    public int m941a(int[] iArr, int i, int[] iArr2) throws C0211r {
        C0156b c0156b = new C0156b(this.f585a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int i3 = i; i3 > 0; i3--) {
            int b = c0156b.m931b(this.f585a.m918b(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        C0156b c0156b2;
        C0156b b2 = this.f585a.m919b();
        if (iArr2 != null) {
            c0156b2 = b2;
            for (int b3 : iArr2) {
                b3 = this.f585a.m918b((iArr.length - 1) - b3);
                c0156b2 = c0156b2.m932b(new C0156b(this.f585a, new int[]{this.f585a.m922c(0, b3), 1}));
            }
        }
        C0156b[] a = m940a(this.f585a.m920b(i, 1), new C0156b(this.f585a, iArr3), i);
        c0156b2 = a[0];
        b2 = a[1];
        int[] a2 = m938a(c0156b2);
        int[] a3 = m939a(b2, c0156b2, a2);
        for (i2 = 0; i2 < a2.length; i2++) {
            int length = (iArr.length - 1) - this.f585a.m921c(a2[i2]);
            if (length < 0) {
                try {
                    throw C0211r.m1265a();
                } catch (C0211r e) {
                    throw e;
                }
            }
            iArr[length] = this.f585a.m922c(iArr[length], a3[i2]);
        }
        return a2.length;
    }
}
