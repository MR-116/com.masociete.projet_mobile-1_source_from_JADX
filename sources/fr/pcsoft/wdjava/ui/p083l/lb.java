package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.lb */
class lb implements C1440l {
    final C1453n this$0;

    lb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        int i2 = 1;
        if (str.equals("")) {
            return str;
        }
        int i3;
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isDigit(charAt)) {
                stringBuffer2.append(charAt);
            }
        }
        i3 = stringBuffer2.length();
        if (i3 % 2 != 0) {
            stringBuffer.append(stringBuffer2.charAt(0));
            if (i3 > 1) {
                stringBuffer.append('.');
            }
        } else {
            i2 = 0;
        }
        while (i2 < i3) {
            stringBuffer.append(stringBuffer2.charAt(i2));
            stringBuffer.append(stringBuffer2.charAt(i2 + 1));
            if (i2 + 2 < i3) {
                stringBuffer.append('.');
            }
            i2 += 2;
        }
        return stringBuffer.toString();
    }
}
