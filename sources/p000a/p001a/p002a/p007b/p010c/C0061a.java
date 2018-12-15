package p000a.p001a.p002a.p007b.p010c;

import java.lang.reflect.Array;

/* renamed from: a.a.a.b.c.a */
public final class C0061a {
    /* renamed from: z */
    private static final String[] f168z = new String[]{C0061a.m322z(C0061a.m323z("\u001f5")), C0061a.m322z(C0061a.m323z("\u001f$")), C0061a.m322z(C0061a.m323z("\u001f4"))};
    /* renamed from: a */
    private final int f169a;
    /* renamed from: b */
    private final byte[][] f170b;
    /* renamed from: c */
    private final int f171c;

    public C0061a(int i, int i2) {
        this.f170b = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{i2, i});
        this.f169a = i;
        this.f171c = i2;
    }

    /* renamed from: z */
    private static String m322z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 63;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 69;
                    break;
                case 3:
                    i2 = 39;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m323z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 68);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public byte m324a(int i, int i2) {
        return this.f170b[i2][i];
    }

    /* renamed from: a */
    public int m325a() {
        return this.f171c;
    }

    /* renamed from: a */
    public void m326a(byte b) {
        for (int i = 0; i < this.f171c; i++) {
            for (int i2 = 0; i2 < this.f169a; i2++) {
                this.f170b[i][i2] = b;
            }
        }
    }

    /* renamed from: a */
    public void m327a(int i, int i2, byte b) {
        this.f170b[i2][i] = b;
    }

    /* renamed from: a */
    public void m328a(int i, int i2, int i3) {
        this.f170b[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void m329a(int i, int i2, boolean z) {
        this.f170b[i2][i] = (byte) (z ? 1 : 0);
    }

    /* renamed from: b */
    public byte[][] m330b() {
        return this.f170b;
    }

    /* renamed from: c */
    public int m331c() {
        return this.f169a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(((this.f169a * 2) * this.f171c) + 2);
        for (int i = 0; i < this.f171c; i++) {
            for (int i2 = 0; i2 < this.f169a; i2++) {
                switch (this.f170b[i][i2]) {
                    case (byte) 0:
                        stringBuilder.append(f168z[2]);
                        break;
                    case (byte) 1:
                        stringBuilder.append(f168z[0]);
                        break;
                    default:
                        stringBuilder.append(f168z[1]);
                        break;
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
