package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.g */
class C1447g implements C1440l {
    final C1453n this$0;

    C1447g(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        String toUpperCase = str.toUpperCase();
        if (toUpperCase.length() != 1) {
            return toUpperCase;
        }
        char charAt = toUpperCase.charAt(0);
        if (!Character.isDigit(charAt) && charAt != ' ') {
            return toUpperCase;
        }
        String texteAffiche = c0515x.getTexteAffiche();
        String a = C0808l.m4018a(texteAffiche, " ", "");
        if (a.length() % 4 != 3 || a.length() >= 42) {
            return toUpperCase;
        }
        toUpperCase = toUpperCase + ' ';
        C1453n.f4370G[0] = texteAffiche.length() + 2;
        C1453n.f4370G[1] = texteAffiche.length() + 2;
        return toUpperCase;
    }
}
