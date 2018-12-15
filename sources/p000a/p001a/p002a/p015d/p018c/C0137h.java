package p000a.p001a.p002a.p015d.p018c;

import java.util.Deque;
import java.util.LinkedList;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.d.c.h */
final class C0137h {
    /* renamed from: d */
    static final C0137h f470d = new C0137h(C0133d.f453b, 0, 0, 0);
    /* renamed from: z */
    private static final String f471z = C0137h.m801z(C0137h.m802z("aFv\u0015m0FkR`dW/\u0003a7\bs\u0013"));
    /* renamed from: a */
    private final int f472a;
    /* renamed from: b */
    private final int f473b;
    /* renamed from: c */
    private final int f474c;
    /* renamed from: e */
    private final C0133d f475e;

    private C0137h(C0133d c0133d, int i, int i2, int i3) {
        this.f475e = c0133d;
        this.f474c = i;
        this.f472a = i2;
        this.f473b = i3;
    }

    /* renamed from: z */
    private static String m801z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 68;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 86;
                    break;
                case 3:
                    i2 = 119;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m802z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m803a() {
        return this.f474c;
    }

    /* renamed from: a */
    C0137h m804a(int i) {
        C0133d b;
        C0133d c0133d = this.f475e;
        int i2 = this.f474c;
        int i3 = this.f473b;
        if (this.f474c == 4 || this.f474c == 2) {
            int i4 = C0136g.f464f[i2][0];
            i3 += i4 >> 16;
            b = c0133d.m788b(65535 & i4, i4 >> 16);
            i2 = 0;
        } else {
            b = c0133d;
        }
        int i5 = (this.f472a == 0 || this.f472a == 31) ? 18 : this.f472a == 62 ? 9 : 8;
        C0137h c0137h = new C0137h(b, i2, this.f472a + 1, i3 + i5);
        return c0137h.f472a == 2078 ? c0137h.m809b(i + 1) : c0137h;
    }

    /* renamed from: a */
    C0137h m805a(int i, int i2) {
        int i3;
        C0133d b;
        int i4 = this.f473b;
        C0133d c0133d = this.f475e;
        if (i != this.f474c) {
            i3 = C0136g.f464f[this.f474c][i];
            i3 = i4 + (i3 >> 16);
            b = c0133d.m788b(65535 & i3, i3 >> 16);
        } else {
            i3 = i4;
            b = c0133d;
        }
        int i5 = i == 2 ? 4 : 5;
        return new C0137h(b.m788b(i2, i5), i, 0, i5 + i3);
    }

    /* renamed from: a */
    C0185f m806a(byte[] bArr) {
        Deque<C0133d> linkedList = new LinkedList();
        for (C0133d c0133d = m809b(bArr.length).f475e; c0133d != null; c0133d = c0133d.m785a()) {
            linkedList.addFirst(c0133d);
        }
        C0185f c0185f = new C0185f();
        for (C0133d c0133d2 : linkedList) {
            c0133d2.mo28a(c0185f, bArr);
        }
        return c0185f;
    }

    /* renamed from: a */
    boolean m807a(C0137h c0137h) {
        int i = this.f473b + (C0136g.f464f[this.f474c][c0137h.f474c] >> 16);
        if (c0137h.f472a > 0 && (this.f472a == 0 || this.f472a > c0137h.f472a)) {
            i += 10;
        }
        return i <= c0137h.f473b;
    }

    /* renamed from: b */
    int m808b() {
        return this.f473b;
    }

    /* renamed from: b */
    C0137h m809b(int i) {
        return this.f472a == 0 ? this : new C0137h(this.f475e.m786a(i - this.f472a, this.f472a), this.f474c, 0, this.f473b);
    }

    /* renamed from: b */
    C0137h m810b(int i, int i2) {
        C0133d c0133d = this.f475e;
        int i3 = this.f474c == 2 ? 4 : 5;
        return new C0137h(c0133d.m788b(C0136g.f466h[this.f474c][i], i3).m788b(i2, 5), this.f474c, 0, (i3 + this.f473b) + 5);
    }

    /* renamed from: c */
    C0133d m811c() {
        return this.f475e;
    }

    /* renamed from: d */
    int m812d() {
        return this.f472a;
    }

    public String toString() {
        return String.format(f471z, new Object[]{C0136g.f462d[this.f474c], Integer.valueOf(this.f473b), Integer.valueOf(this.f472a)});
    }
}
