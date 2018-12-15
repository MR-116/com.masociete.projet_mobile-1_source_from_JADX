package p000a.p001a.p002a.p015d.p018c;

import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.d.c.e */
final class C0134e extends C0133d {
    /* renamed from: z */
    private static final String f455z = C0134e.m789z(C0134e.m790z("\u0019"));
    /* renamed from: c */
    private final short f456c;
    /* renamed from: d */
    private final short f457d;

    C0134e(C0133d c0133d, int i, int i2) {
        super(c0133d);
        this.f457d = (short) i;
        this.f456c = (short) i2;
    }

    /* renamed from: z */
    private static String m789z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 35;
                    break;
                case 1:
                    i2 = 69;
                    break;
                case 2:
                    i2 = 38;
                    break;
                case 3:
                    i2 = 66;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m790z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 122);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo28a(C0185f c0185f, byte[] bArr) {
        short s = (short) 0;
        while (s < this.f456c) {
            if (s == (short) 0 || (s == (short) 31 && this.f456c <= (short) 62)) {
                c0185f.m1138a(31, 5);
                if (this.f456c > (short) 62) {
                    c0185f.m1138a(this.f456c - 31, 16);
                } else if (s == (short) 0) {
                    c0185f.m1138a(Math.min(this.f456c, 31), 5);
                } else {
                    c0185f.m1138a(this.f456c - 31, 5);
                }
            }
            c0185f.m1138a(bArr[this.f457d + s], 8);
            s++;
        }
    }

    public String toString() {
        return "<" + this.f457d + f455z + ((this.f457d + this.f456c) - 1) + '>';
    }
}
