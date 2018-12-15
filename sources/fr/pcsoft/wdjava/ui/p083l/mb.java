package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.mb */
class mb implements C1440l {
    /* renamed from: z */
    private static final String[] f4364z = new String[]{mb.m10228z(mb.m10229z("\u0017\u001c\"\u0014r")), mb.m10228z(mb.m10229z("\u001av3\u001cyov2\u001cyoV1Li\u0012\u0012*j\u0001\u001fw_JrO\u0004"))};
    final C1453n this$0;

    mb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10228z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 50;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 49;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10229z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 64);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4364z[1], f4364z[0]);
    }
}
