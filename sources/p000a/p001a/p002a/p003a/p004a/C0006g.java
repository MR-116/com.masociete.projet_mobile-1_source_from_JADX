package p000a.p001a.p002a.p003a.p004a;

import java.nio.charset.Charset;
import p000a.p001a.p002a.C0209p;

/* renamed from: a.a.a.a.a.g */
final class C0006g {
    /* renamed from: z */
    private static final String[] f34z = new String[]{C0006g.m50z(C0006g.m51z("\u000eb4\u0000\u001c\u0004B\u0000\u0015")), C0006g.m50z(C0006g.m51z("\nT\b^E T[NK)E\u001aDJ4\u0011\u0018EE5P\u0018YA5B[BQ3B\u0012IAgx(b\t\tN\u0014\tv\u0011\u001eCG(U\u0012CCi"))};
    /* renamed from: a */
    int f35a;
    /* renamed from: b */
    private final String f36b;
    /* renamed from: c */
    private final StringBuilder f37c;
    /* renamed from: d */
    private C0004e f38d;
    /* renamed from: e */
    private C0002c f39e;
    /* renamed from: f */
    private C0209p f40f;
    /* renamed from: g */
    private int f41g;
    /* renamed from: h */
    private int f42h;
    /* renamed from: i */
    private C0209p f43i;

    C0006g(String str) {
        int i = 0;
        byte[] bytes = str.getBytes(Charset.forName(f34z[0]));
        StringBuilder stringBuilder = new StringBuilder(bytes.length);
        int length = bytes.length;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c == '?') {
                try {
                    if (str.charAt(i) != '?') {
                        throw new IllegalArgumentException(f34z[1]);
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            stringBuilder.append(c);
            i++;
        }
        this.f36b = stringBuilder.toString();
        this.f38d = C0004e.FORCE_NONE;
        this.f37c = new StringBuilder(str.length());
        this.f42h = -1;
    }

    /* renamed from: d */
    private int m49d() {
        return this.f36b.length() - this.f41g;
    }

    /* renamed from: z */
    private static String m50z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 71;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 45;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m51z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m52a() {
        this.f39e = null;
    }

    /* renamed from: a */
    public void m53a(char c) {
        this.f37c.append(c);
    }

    /* renamed from: a */
    public void m54a(int i) {
        try {
            if (this.f39e != null) {
                if (i <= this.f39e.m37h()) {
                    return;
                }
            }
            this.f39e = C0002c.m21a(i, this.f38d, this.f43i, this.f40f, true);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public void m55a(C0004e c0004e) {
        this.f38d = c0004e;
    }

    /* renamed from: a */
    public void m56a(C0209p c0209p, C0209p c0209p2) {
        this.f43i = c0209p;
        this.f40f = c0209p2;
    }

    /* renamed from: a */
    public void m57a(String str) {
        this.f37c.append(str);
    }

    /* renamed from: b */
    public int m58b() {
        return m49d() - this.f35a;
    }

    /* renamed from: b */
    public void m59b(int i) {
        this.f42h = i;
    }

    /* renamed from: c */
    public StringBuilder m60c() {
        return this.f37c;
    }

    /* renamed from: c */
    public void m61c(int i) {
        this.f41g = i;
    }

    /* renamed from: e */
    public char m62e() {
        return this.f36b.charAt(this.f35a);
    }

    /* renamed from: f */
    public void m63f() {
        m54a(m65h());
    }

    /* renamed from: g */
    public void m64g() {
        this.f42h = -1;
    }

    /* renamed from: h */
    public int m65h() {
        return this.f37c.length();
    }

    /* renamed from: i */
    public boolean m66i() {
        try {
            return this.f35a < m49d();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* renamed from: j */
    public C0002c m67j() {
        return this.f39e;
    }

    /* renamed from: k */
    public String m68k() {
        return this.f36b;
    }

    /* renamed from: l */
    public int m69l() {
        return this.f42h;
    }

    /* renamed from: m */
    public char m70m() {
        return this.f36b.charAt(this.f35a);
    }
}
