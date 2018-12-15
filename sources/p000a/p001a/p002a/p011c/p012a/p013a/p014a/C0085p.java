package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.C0213t;
import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.p */
final class C0085p extends C0084o {
    /* renamed from: d */
    private static final int f245d = 8;
    /* renamed from: e */
    private static final int f246e = 16;
    /* renamed from: g */
    private static final int f247g = 20;
    /* renamed from: f */
    private final String f248f;
    /* renamed from: h */
    private final String f249h;

    C0085p(C0185f c0185f, String str, String str2) {
        super(c0185f);
        this.f249h = str2;
        this.f248f = str;
    }

    /* renamed from: d */
    private void m493d(StringBuilder stringBuilder, int i) {
        int a = m475c().m465a(i, 16);
        if (a != 38400) {
            stringBuilder.append('(');
            stringBuilder.append(this.f249h);
            stringBuilder.append(')');
            int i2 = a % 32;
            a /= 32;
            int i3 = (a % 12) + 1;
            a /= 12;
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
            if (i3 / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i3);
            if (i2 / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i2);
        }
    }

    /* renamed from: a */
    protected int mo18a(int i) {
        return i % 100000;
    }

    /* renamed from: a */
    public String mo17a() throws C0213t {
        try {
            if (m474b().m1136a() != 84) {
                throw C0213t.m1269a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            m480b(stringBuilder, 8);
            m491b(stringBuilder, 48, 20);
            m493d(stringBuilder, 68);
            return stringBuilder.toString();
        } catch (C0213t e) {
            throw e;
        }
    }

    /* renamed from: c */
    protected void mo19c(StringBuilder stringBuilder, int i) {
        stringBuilder.append('(');
        stringBuilder.append(this.f248f);
        stringBuilder.append(i / 100000);
        stringBuilder.append(')');
    }
}
