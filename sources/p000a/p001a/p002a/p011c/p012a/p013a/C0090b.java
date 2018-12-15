package p000a.p001a.p002a.p011c.p012a.p013a;

import p000a.p001a.p002a.p011c.p012a.C0098e;
import p000a.p001a.p002a.p011c.p012a.C0100g;

/* renamed from: a.a.a.c.a.a.b */
final class C0090b {
    /* renamed from: z */
    private static final String[] f255z = new String[]{C0090b.m509z(C0090b.m510z("\b@")), C0090b.m509z(C0090b.m510z("s=")), C0090b.m509z(C0090b.m510z("\b'\u0006")), C0090b.m509z(C0090b.m510z("\b1\u0006")), C0090b.m509z(C0090b.m510z("FhJV"))};
    /* renamed from: a */
    private final boolean f256a;
    /* renamed from: b */
    private final C0098e f257b;
    /* renamed from: c */
    private final C0100g f258c;
    /* renamed from: d */
    private final C0098e f259d;

    C0090b(C0098e c0098e, C0098e c0098e2, C0100g c0100g, boolean z) {
        this.f257b = c0098e;
        this.f259d = c0098e2;
        this.f258c = c0100g;
        this.f256a = z;
    }

    /* renamed from: a */
    private static int m507a(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    /* renamed from: a */
    private static boolean m508a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: z */
    private static String m509z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 40;
                    break;
                case 1:
                    i2 = 29;
                    break;
                case 2:
                    i2 = 38;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m510z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    /* renamed from: a */
    C0098e m511a() {
        return this.f257b;
    }

    /* renamed from: b */
    C0100g m512b() {
        return this.f258c;
    }

    /* renamed from: c */
    C0098e m513c() {
        return this.f259d;
    }

    /* renamed from: d */
    public boolean m514d() {
        return this.f259d == null;
    }

    /* renamed from: e */
    boolean m515e() {
        return this.f256a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0090b)) {
            return false;
        }
        C0090b c0090b = (C0090b) obj;
        return C0090b.m508a(this.f257b, c0090b.f257b) && C0090b.m508a(this.f259d, c0090b.f259d) && C0090b.m508a(this.f258c, c0090b.f258c);
    }

    public int hashCode() {
        return (C0090b.m507a(this.f257b) ^ C0090b.m507a(this.f259d)) ^ C0090b.m507a(this.f258c);
    }

    public String toString() {
        return f255z[1] + this.f257b + f255z[3] + this.f259d + f255z[2] + (this.f258c == null ? f255z[4] : Integer.valueOf(this.f258c.m579a())) + f255z[0];
    }
}
