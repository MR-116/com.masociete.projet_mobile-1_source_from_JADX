package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.b */
class C1442b implements C1440l {
    final C1453n this$0;

    C1442b(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        if (str.length() != 1) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isDigit(charAt) && charAt != '.') {
            return str;
        }
        String texteAffiche = c0515x.getTexteAffiche();
        int length = texteAffiche.length();
        return (charAt == '.' && length > 0 && texteAffiche.charAt(length - 1) == '.' && c0515x.getDebutSelection() == c0515x.getFinSelection() && c0515x.getFinSelection() == length) ? "" : str;
    }
}
