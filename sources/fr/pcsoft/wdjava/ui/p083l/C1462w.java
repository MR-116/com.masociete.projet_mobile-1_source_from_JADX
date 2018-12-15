package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.w */
class C1462w implements C1440l {
    final C1453n this$0;

    C1462w(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        if (str.length() != 1) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isDigit(charAt) && charAt != '-') {
            return str;
        }
        String texteAffiche = c0515x.getTexteAffiche();
        String[] split = texteAffiche.split("-", -1);
        int length = split.length - 1;
        int length2 = split[length].length();
        switch (length) {
            case 0:
                if (length2 == 3 && charAt != '-') {
                    return "";
                }
                if (!Character.isDigit(charAt) || length2 != 2) {
                    return str;
                }
                str = str + '-';
                C1453n.f4370G[0] = texteAffiche.length() + 2;
                C1453n.f4370G[1] = texteAffiche.length() + 2;
                return str;
            case 1:
                if (length2 == 5 && charAt != '-') {
                    return "";
                }
                if (!Character.isDigit(charAt) || length2 != 4) {
                    return str;
                }
                str = str + '-';
                C1453n.f4370G[0] = texteAffiche.length() + 2;
                C1453n.f4370G[1] = texteAffiche.length() + 2;
                return str;
            case 2:
                if (length2 == 8 - split[1].length() && charAt != '-') {
                    return "";
                }
                if (!Character.isDigit(charAt) || length2 != 7 - split[1].length()) {
                    return str;
                }
                str = str + '-';
                C1453n.f4370G[0] = texteAffiche.length() + 2;
                C1453n.f4370G[1] = texteAffiche.length() + 2;
                return str;
            case 3:
                if (length2 == 9 - (split[1].length() + split[2].length()) && charAt != '-') {
                    return "";
                }
                if (!Character.isDigit(charAt) || length2 != 8 - (split[1].length() + split[2].length())) {
                    return str;
                }
                String str2 = str + '-';
                String a = C0808l.m4018a(texteAffiche.substring(0, i) + str2 + texteAffiche.substring(i), "-", "");
                int length3 = a.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length3; i3++) {
                    char charAt2 = a.charAt(i3);
                    i2 = i3 % 2 == 0 ? i2 + Character.digit(charAt2, 10) : i2 + (Character.digit(charAt2, 10) * 3);
                }
                i2 = 10 - (i2 % 10);
                if (i2 == 10) {
                    i2 = 0;
                }
                String str3 = i2 != 10 ? str2 + i2 : str2 + "X";
                C1453n.f4370G[0] = texteAffiche.length() + str3.length();
                C1453n.f4370G[1] = texteAffiche.length() + str3.length();
                return str3;
            case 4:
                return !Character.isDigit(charAt) ? "" : str;
            default:
                return str;
        }
    }
}
