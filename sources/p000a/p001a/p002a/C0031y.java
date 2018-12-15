package p000a.p001a.p002a;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: a.a.a.y */
public abstract class C0031y {
    /* renamed from: z */
    private static final String[] f93z = new String[]{C0031y.m190z(C0031y.m191z("\u001e\u000fX4\\&\u0012\\.\u0012+\tR\"\\9\bD5\u001f/GU(\u00199G_(\bj\u0014D7\f%\u0015Eg\u001f8\bA7\u0015$\u0000\u001f")), C0031y.m190z(C0031y.m191z("\u001e\u000fX4\\&\u0012\\.\u0012+\tR\"\\9\bD5\u001f/GU(\u00199G_(\bj\u0014D7\f%\u0015Eg\u000e%\u0013P3\u0015%\t\u0011%\u0005j^\u0001g\u0018/\u0000C\"\u00199I")), C0031y.m190z(C0031y.m191z("\u001e\u000fX4\\&\u0012\\.\u0012+\tR\"\\9\bD5\u001f/GU(\u00199G_(\bj\u0014D7\f%\u0015Eg\u000e%\u0013P3\u0015%\t\u0011%\u0005jS\u0004g\u0018/\u0000C\"\u00199I"))};
    /* renamed from: a */
    private final int f94a;
    /* renamed from: b */
    private final int f95b;

    protected C0031y(int i, int i2) {
        this.f94a = i;
        this.f95b = i2;
    }

    /* renamed from: z */
    private static String m190z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m191z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public C0031y mo37a() {
        throw new UnsupportedOperationException(f93z[2]);
    }

    /* renamed from: a */
    public C0031y mo12a(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException(f93z[0]);
    }

    /* renamed from: a */
    public abstract byte[] mo13a(int i, byte[] bArr);

    /* renamed from: b */
    public abstract byte[] mo14b();

    /* renamed from: c */
    public boolean mo38c() {
        return false;
    }

    /* renamed from: d */
    public final int m197d() {
        return this.f94a;
    }

    /* renamed from: e */
    public final int m198e() {
        return this.f95b;
    }

    /* renamed from: f */
    public C0031y mo39f() {
        return new C0218z(this);
    }

    /* renamed from: g */
    public C0031y mo40g() {
        throw new UnsupportedOperationException(f93z[1]);
    }

    /* renamed from: h */
    public boolean mo15h() {
        return false;
    }

    public final String toString() {
        byte[] bArr = new byte[this.f94a];
        StringBuilder stringBuilder = new StringBuilder(this.f95b * (this.f94a + 1));
        byte[] bArr2 = bArr;
        for (int i = 0; i < this.f95b; i++) {
            bArr2 = mo13a(i, bArr2);
            for (int i2 = 0; i2 < this.f94a; i2++) {
                int i3 = bArr2[i2] & 255;
                char c = i3 < 64 ? '#' : i3 < 128 ? '+' : i3 < 192 ? '.' : ' ';
                stringBuilder.append(c);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
