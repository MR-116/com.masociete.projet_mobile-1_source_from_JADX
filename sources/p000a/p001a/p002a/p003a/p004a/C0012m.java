package p000a.p001a.p002a.p003a.p004a;

import fr.pcsoft.wdjava.ui.p065b.p067a.qb;

/* renamed from: a.a.a.a.a.m */
final class C0012m extends C0010k {
    C0012m() {
    }

    /* renamed from: a */
    public int mo3a() {
        return 3;
    }

    /* renamed from: a */
    int mo5a(char c, StringBuilder stringBuilder) {
        if (c == '\r') {
            stringBuilder.append('\u0000');
        } else if (c == '*') {
            stringBuilder.append('\u0001');
        } else if (c == '>') {
            stringBuilder.append('\u0002');
        } else if (c == ' ') {
            stringBuilder.append('\u0003');
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - 48) + 4));
        } else if (c < qb.f3195j || c > qb.f3192g) {
            C0001b.m15g(c);
        } else {
            stringBuilder.append((char) ((c - 65) + 14));
        }
        return 1;
    }

    /* renamed from: a */
    public void mo4a(C0006g c0006g) {
        StringBuilder stringBuilder = new StringBuilder();
        while (c0006g.m66i()) {
            char e = c0006g.m62e();
            c0006g.f35a++;
            mo5a(e, stringBuilder);
            if (stringBuilder.length() % 3 == 0) {
                C0010k.m98b(c0006g, stringBuilder);
                int a = C0001b.m4a(c0006g.m68k(), c0006g.f35a, mo3a());
                if (a != mo3a()) {
                    c0006g.m59b(a);
                    break;
                }
            }
        }
        mo6a(c0006g, stringBuilder);
    }

    /* renamed from: a */
    void mo6a(C0006g c0006g, StringBuilder stringBuilder) {
        c0006g.m63f();
        int h = c0006g.m67j().m37h() - c0006g.m65h();
        c0006g.f35a -= stringBuilder.length();
        if (c0006g.m58b() > 1 || h > 1 || c0006g.m58b() != h) {
            c0006g.m53a('þ');
        }
        if (c0006g.m69l() < 0) {
            c0006g.m59b(0);
        }
    }
}
