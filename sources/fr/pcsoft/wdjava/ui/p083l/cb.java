package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.cb */
class cb implements C1440l {
    /* renamed from: z */
    private static final String[] f4298z = new String[]{cb.m10139z(cb.m10140z("6\u0013J@=C3O\u0010-3wR643q'\u00167ca")), cb.m10139z(cb.m10140z(";yWH6"))};
    final C1453n this$0;

    cb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10139z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 30;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 4;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10140z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 4);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4298z[0], f4298z[1]);
    }
}
