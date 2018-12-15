package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.m */
class C1452m implements C1440l {
    /* renamed from: z */
    private static final String[] f4363z = new String[]{C1452m.m10225z(C1452m.m10226z("Vz\u0000|,#Z\u0003,<S\u001e\u0018\n%S\u0018m*'\u0003\b\u001dn=%\u0011\u001dhH\u0005\u0015Mx")), C1452m.m10225z(C1452m.m10226z("[\u0010\u001dt'S\u0004\u0003"))};
    final C1453n this$0;

    C1452m(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10225z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 126;
                    break;
                case 1:
                    i2 = 33;
                    break;
                case 2:
                    i2 = 48;
                    break;
                case 3:
                    i2 = 81;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10226z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 21);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4363z[0], f4363z[1]);
    }
}
