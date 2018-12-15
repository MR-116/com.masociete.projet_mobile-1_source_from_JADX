package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.ib */
class ib implements C1440l {
    final C1453n this$0;

    ib(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        int i2 = 0;
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 2);
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (i3 > 0 && i3 % 3 == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append(charAt);
            i3++;
            i2++;
        }
        return stringBuffer.toString();
    }
}
