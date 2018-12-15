package p000a.p001a.p002a.p019g;

/* renamed from: a.a.a.g.m */
public final class C0193m {
    /* renamed from: a */
    private int f752a;
    /* renamed from: b */
    private final byte[] f753b;
    /* renamed from: c */
    private int f754c;

    public C0193m(byte[] bArr) {
        this.f753b = bArr;
    }

    /* renamed from: a */
    public int m1200a() {
        return this.f754c;
    }

    /* renamed from: a */
    public int m1201a(int i) {
        int i2 = 0;
        if (i >= 1 && i <= 32) {
            try {
                if (i <= m1202b()) {
                    int i3;
                    if (this.f752a > 0) {
                        i3 = 8 - this.f752a;
                        i2 = i < i3 ? i : i3;
                        i3 -= i2;
                        i3 = (((255 >> (8 - i2)) << i3) & this.f753b[this.f754c]) >> i3;
                        i -= i2;
                        try {
                            this.f752a = i2 + this.f752a;
                            if (this.f752a == 8) {
                                this.f752a = 0;
                                this.f754c++;
                                i2 = i3;
                                i3 = i;
                            } else {
                                i2 = i3;
                                i3 = i;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    i3 = i;
                    if (i3 <= 0) {
                        return i2;
                    }
                    while (i3 >= 8) {
                        i2 = (i2 << 8) | (this.f753b[this.f754c] & 255);
                        this.f754c++;
                        i3 -= 8;
                    }
                    if (i3 <= 0) {
                        return i2;
                    }
                    int i4 = 8 - i3;
                    i2 = (i2 << i3) | ((((255 >> i4) << i4) & this.f753b[this.f754c]) >> i4);
                    this.f752a = i3 + this.f752a;
                    return i2;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }

    /* renamed from: b */
    public int m1202b() {
        return ((this.f753b.length - this.f754c) * 8) - this.f752a;
    }

    /* renamed from: c */
    public int m1203c() {
        return this.f752a;
    }
}
