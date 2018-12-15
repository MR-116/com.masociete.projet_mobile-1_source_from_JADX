package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.t */
class C1459t implements C1440l {
    final C1453n this$0;

    C1459t(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        if (str.length() != 1) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isDigit(charAt)) {
            return str;
        }
        String texteAffiche = c0515x.getTexteAffiche();
        if (texteAffiche.length() == 7 && charAt > '/' && charAt < ':') {
            str = str + C0808l.m4060r(texteAffiche + str);
            C1453n.f4370G[0] = 8;
            C1453n.f4370G[1] = 9;
            return str;
        } else if (texteAffiche.length() != 12 || charAt <= '/' || charAt >= ':') {
            return str;
        } else {
            str = str + C0808l.m4060r(texteAffiche + str);
            C1453n.f4370G[0] = 13;
            C1453n.f4370G[1] = 14;
            return str;
        }
    }
}
