package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.k */
class C1451k implements C1440l {
    /* renamed from: z */
    private static final String[] f4357z = new String[]{C1451k.m10214z(C1451k.m10215z("i.\u000bT\u001a\u001c\u000e\u000f\u0004\nlJ\u0013\"\u0013lLf\u0002\u0010<\\")), C1451k.m10214z(C1451k.m10215z("dD\u0016\\\u0011"))};
    final C1453n this$0;

    C1451k(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10214z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 121;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10215z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4357z[0], f4357z[1]);
    }
}
