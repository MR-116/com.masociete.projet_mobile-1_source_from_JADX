package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.q */
class C1456q implements C1440l {
    final C1453n this$0;

    C1456q(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        if (str.length() != 1) {
            return str;
        }
        String texteAffiche = c0515x.getTexteAffiche();
        if (c0515x.getDebutSelection() != c0515x.getFinSelection() || i < 1 || i != texteAffiche.length() || !Character.isDigit(texteAffiche.charAt(i - 1)) || !Character.isDigit(str.charAt(0)) || texteAffiche.length() + 1 >= 14) {
            return str;
        }
        str = str + '.';
        C1453n.f4370G[0] = c0515x.getDebutSelection() + 2;
        C1453n.f4370G[1] = c0515x.getDebutSelection() + 2;
        return str;
    }
}
