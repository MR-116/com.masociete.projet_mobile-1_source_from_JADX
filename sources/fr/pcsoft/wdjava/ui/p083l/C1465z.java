package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.z */
class C1465z implements C1440l {
    /* renamed from: z */
    private static final String[] f4473z = new String[]{C1465z.m10298z(C1465z.m10299z("d)itU\u0011\tl$ElMq\u0002\\aK\u0004\"Y1[yfD\u00173t\u0003\ra\bitU\u0011\thh\u0011eRfq7|_`\u0004\u0017~\u000fp")), C1465z.m10298z(C1465z.m10299z("iCy|^lWjyIx"))};
    final C1453n this$0;

    C1465z(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10298z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 89;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = 108;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10299z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4473z[0], f4473z[1]);
    }
}
