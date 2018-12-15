package p000a.p001a.p002a.p003a.p004a;

import java.util.Arrays;

/* renamed from: a.a.a.a.a.i */
public class C0008i {
    /* renamed from: a */
    private final int f45a;
    /* renamed from: b */
    private final CharSequence f46b;
    /* renamed from: c */
    private final int f47c;
    /* renamed from: d */
    private final byte[] f48d;

    public C0008i(CharSequence charSequence, int i, int i2) {
        this.f46b = charSequence;
        this.f45a = i;
        this.f47c = i2;
        this.f48d = new byte[(i * i2)];
        Arrays.fill(this.f48d, (byte) -1);
    }

    /* renamed from: a */
    private void m76a(int i) {
        m78a(this.f47c - 3, 0, i, 1);
        m78a(this.f47c - 2, 0, i, 2);
        m78a(this.f47c - 1, 0, i, 3);
        m78a(0, this.f45a - 2, i, 4);
        m78a(0, this.f45a - 1, i, 5);
        m78a(1, this.f45a - 1, i, 6);
        m78a(2, this.f45a - 1, i, 7);
        m78a(3, this.f45a - 1, i, 8);
    }

    /* renamed from: a */
    private void m77a(int i, int i2, int i3) {
        m78a(i - 2, i2 - 2, i3, 1);
        m78a(i - 2, i2 - 1, i3, 2);
        m78a(i - 1, i2 - 2, i3, 3);
        m78a(i - 1, i2 - 1, i3, 4);
        m78a(i - 1, i2, i3, 5);
        m78a(i, i2 - 2, i3, 6);
        m78a(i, i2 - 1, i3, 7);
        m78a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m78a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z = true;
        if (i < 0) {
            i5 = i + this.f47c;
            i6 = (4 - ((this.f47c + 4) % 8)) + i2;
        } else {
            i6 = i2;
            i5 = i;
        }
        if (i6 < 0) {
            i6 += this.f45a;
            i5 += 4 - ((this.f45a + 4) % 8);
        }
        if ((this.f46b.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m79a(i6, i5, z);
    }

    /* renamed from: a */
    private void m79a(int i, int i2, boolean z) {
        this.f48d[(this.f45a * i2) + i] = (byte) (z ? 1 : 0);
    }

    /* renamed from: b */
    private void m80b(int i) {
        m78a(this.f47c - 1, 0, i, 1);
        m78a(this.f47c - 1, this.f45a - 1, i, 2);
        m78a(0, this.f45a - 3, i, 3);
        m78a(0, this.f45a - 2, i, 4);
        m78a(0, this.f45a - 1, i, 5);
        m78a(1, this.f45a - 3, i, 6);
        m78a(1, this.f45a - 2, i, 7);
        m78a(1, this.f45a - 1, i, 8);
    }

    /* renamed from: b */
    private boolean m81b(int i, int i2) {
        return this.f48d[(this.f45a * i2) + i] >= (byte) 0;
    }

    /* renamed from: c */
    private void m82c(int i) {
        m78a(this.f47c - 3, 0, i, 1);
        m78a(this.f47c - 2, 0, i, 2);
        m78a(this.f47c - 1, 0, i, 3);
        m78a(0, this.f45a - 4, i, 4);
        m78a(0, this.f45a - 3, i, 5);
        m78a(0, this.f45a - 2, i, 6);
        m78a(0, this.f45a - 1, i, 7);
        m78a(1, this.f45a - 1, i, 8);
    }

    /* renamed from: d */
    private void m83d(int i) {
        m78a(this.f47c - 1, 0, i, 1);
        m78a(this.f47c - 1, 1, i, 2);
        m78a(this.f47c - 1, 2, i, 3);
        m78a(0, this.f45a - 2, i, 4);
        m78a(0, this.f45a - 1, i, 5);
        m78a(1, this.f45a - 1, i, 6);
        m78a(2, this.f45a - 1, i, 7);
        m78a(3, this.f45a - 1, i, 8);
    }

    /* renamed from: a */
    final int m84a() {
        return this.f47c;
    }

    /* renamed from: a */
    public final boolean m85a(int i, int i2) {
        return this.f48d[(this.f45a * i2) + i] == (byte) 1;
    }

    /* renamed from: b */
    final byte[] m86b() {
        return this.f48d;
    }

    /* renamed from: c */
    public final void m87c() {
        int i = 0;
        int i2 = 4;
        int i3 = 0;
        while (true) {
            int i4;
            if (i2 == this.f47c && r0 == 0) {
                i4 = i3 + 1;
                m83d(i3);
                i3 = i4;
            }
            if (i2 == this.f47c - 2 && r0 == 0 && this.f45a % 4 != 0) {
                i4 = i3 + 1;
                m82c(i3);
                i3 = i4;
            }
            if (i2 == this.f47c - 2 && r0 == 0 && this.f45a % 8 == 4) {
                i4 = i3 + 1;
                m76a(i3);
                i3 = i4;
            }
            if (i2 == this.f47c + 4 && r0 == 2 && this.f45a % 8 == 0) {
                i4 = i3 + 1;
                m80b(i3);
                i3 = i4;
            }
            do {
                if (i2 < this.f47c && i >= 0 && !m81b(i, i2)) {
                    i4 = i3 + 1;
                    m77a(i2, i, i3);
                    i3 = i4;
                }
                i2 -= 2;
                i += 2;
                if (i2 < 0) {
                    break;
                }
            } while (i < this.f45a);
            i4 = i2 + 1;
            i2 = i + 3;
            i = i3;
            while (true) {
                if (i4 < 0 || i2 >= this.f45a || m81b(i2, i4)) {
                    i3 = i;
                } else {
                    i3 = i + 1;
                    m77a(i4, i2, i);
                }
                i4 += 2;
                i = i2 - 2;
                if (i4 >= this.f47c || i < 0) {
                    i2 = i4 + 3;
                    i++;
                } else {
                    i2 = i;
                    i = i3;
                }
            }
            i2 = i4 + 3;
            i++;
            if (i2 >= this.f47c && i >= this.f45a) {
                break;
            }
        }
        if (!m81b(this.f45a - 1, this.f47c - 1)) {
            m79a(this.f45a - 1, this.f47c - 1, true);
            m79a(this.f45a - 2, this.f47c - 2, true);
        }
    }

    /* renamed from: d */
    final int m88d() {
        return this.f45a;
    }
}
