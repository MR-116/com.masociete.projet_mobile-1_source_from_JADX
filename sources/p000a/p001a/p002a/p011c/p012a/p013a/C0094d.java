package p000a.p001a.p002a.p011c.p012a.p013a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: a.a.a.c.a.a.d */
final class C0094d {
    /* renamed from: z */
    private static final String[] f287z = new String[]{C0094d.m555z(C0094d.m556z("!]")), C0094d.m555z(C0094d.m556z("z\u0000"))};
    /* renamed from: a */
    private final List<C0090b> f288a;
    /* renamed from: b */
    private final int f289b;
    /* renamed from: c */
    private final boolean f290c;

    C0094d(List<C0090b> list, int i, boolean z) {
        this.f288a = new ArrayList(list);
        this.f289b = i;
        this.f290c = z;
    }

    /* renamed from: z */
    private static String m555z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 32;
                    break;
                case 2:
                    i2 = 81;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m556z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 28);
        }
        return toCharArray;
    }

    /* renamed from: a */
    int m557a() {
        return this.f289b;
    }

    /* renamed from: a */
    boolean m558a(List<C0090b> list) {
        return this.f288a.equals(list);
    }

    /* renamed from: b */
    boolean m559b() {
        return this.f290c;
    }

    /* renamed from: c */
    List<C0090b> m560c() {
        return this.f288a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0094d)) {
            return false;
        }
        C0094d c0094d = (C0094d) obj;
        return this.f288a.equals(c0094d.m560c()) && this.f290c == c0094d.f290c;
    }

    public int hashCode() {
        return this.f288a.hashCode() ^ Boolean.valueOf(this.f290c).hashCode();
    }

    public String toString() {
        return f287z[1] + this.f288a + f287z[0];
    }
}
