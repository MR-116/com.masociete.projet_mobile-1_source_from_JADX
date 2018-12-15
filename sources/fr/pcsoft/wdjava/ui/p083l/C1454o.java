package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.o */
class C1454o implements C1440l {
    /* renamed from: z */
    private static final String[] f4417z = new String[]{C1454o.m10253z(C1454o.m10254z("i\u0016c\u0006*")), C1454o.m10253z(C1454o.m10254z("d|\u0002\u000eB\u0011\\r\u000f*1|s\u000e!\u0011\\r\u000f*1[\u0018b5\u0016z8\u00124~Z\u0018\u00135uz\u0018b5\u0016zj\u0003'd|s\u000e!\u0011|\u0002\u000eB\u0011\\q^1"))};
    final C1453n this$0;

    C1454o(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10253z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 76;
                    break;
                case 1:
                    i2 = 39;
                    break;
                case 2:
                    i2 = 67;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10254z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 24);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4417z[1], f4417z[0]);
    }
}
