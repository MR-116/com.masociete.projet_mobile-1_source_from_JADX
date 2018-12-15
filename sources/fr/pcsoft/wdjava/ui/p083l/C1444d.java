package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.d */
class C1444d implements C1440l {
    /* renamed from: z */
    private static final String[] f4299z = new String[]{C1444d.m10142z(C1444d.m10143z("I\t\u000f@\u001c<)\u000b\u0010\fAm\u00176\u0015Lkb\u0016\u0011\u001c{\u001fR\r:b\u0012Tx\u001afBD\u0005^zd]\bX\u000fDYXH")), C1444d.m10142z(C1444d.m10143z("Dc\u001fH\u0017Aw\fM\u0000U"))};
    final C1453n this$0;

    C1444d(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10142z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 63;
                    break;
                case 3:
                    i2 = 109;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10143z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4299z[0], f4299z[1]);
    }
}
