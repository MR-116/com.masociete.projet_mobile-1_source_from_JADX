package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.h */
class C1448h implements C1440l {
    /* renamed from: z */
    private static final String[] f4303z = new String[]{C1448h.m10158z(C1448h.m10159z("pCd,VuWw)AaRa<")), C1448h.m10158z(C1448h.m10159z("})\u0005$>\b\twtMuMlR%x(\u0019rW([d6L\u000eBi09.@9R%x(\u0019RTxK\u0019rV([d6L\u000e3iS9\u000eBi09.A9 DjZ\u001fHI\u000f/m"))};
    final C1453n this$0;

    C1448h(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10158z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 85;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 9;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10159z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 100);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4303z[1], f4303z[0]);
    }
}
