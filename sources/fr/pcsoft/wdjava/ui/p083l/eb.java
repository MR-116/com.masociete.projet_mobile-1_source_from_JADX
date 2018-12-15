package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.eb */
class eb implements C1440l {
    /* renamed from: z */
    private static final String[] f4300z = new String[]{eb.m10147z(eb.m10148z("ap1\u001d'\u0014P2M7d\u0014)k.d\u0012\\K-4\u0002,\u000f6\u0012\u001b,\tC2\u0018|\u0019")), eb.m10147z(eb.m10148z("l\u001a,\u0015,d\u000e2"))};
    final C1453n this$0;

    eb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10147z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 73;
                    break;
                case 1:
                    i2 = 43;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10148z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 30);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4300z[0], f4300z[1]);
    }
}
