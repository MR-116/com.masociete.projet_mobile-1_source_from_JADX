package p000a.p001a.p002a.p011c.p012a.p013a.p014a;

import p000a.p001a.p002a.p019g.C0185f;

/* renamed from: a.a.a.c.a.a.a.o */
abstract class C0084o extends C0080k {
    C0084o(C0185f c0185f) {
        super(c0185f);
    }

    /* renamed from: a */
    protected abstract int mo18a(int i);

    /* renamed from: b */
    final void m491b(StringBuilder stringBuilder, int i, int i2) {
        int a = m475c().m465a(i, i2);
        mo19c(stringBuilder, a);
        int a2 = mo18a(a);
        int i3 = 100000;
        for (a = 0; a < 5; a++) {
            if (a2 / i3 == 0) {
                stringBuilder.append('0');
            }
            i3 /= 10;
        }
        stringBuilder.append(a2);
    }

    /* renamed from: c */
    protected abstract void mo19c(StringBuilder stringBuilder, int i);
}
