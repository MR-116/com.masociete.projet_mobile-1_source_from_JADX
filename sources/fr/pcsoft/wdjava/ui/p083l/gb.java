package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.gb */
class gb implements C1440l {
    final C1453n this$0;

    gb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return (i != 0 || str == null || str.equals("")) ? str : Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
