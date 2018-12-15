package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.qb */
class qb implements C1440l {
    /* renamed from: z */
    private static final String[] f4421z = new String[]{qb.m10266z(qb.m10267z("\u001f\f4I\u0016")), qb.m10266z(qb.m10267z("\u0012fXA~g\u00144S\fa\r4UyA\bdE"))};
    final C1453n this$0;

    qb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10266z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 58;
                    break;
                case 1:
                    i2 = 61;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 108;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10267z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4421z[1], f4421z[0]);
    }
}
