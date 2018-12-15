package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.f */
class C1446f implements C1440l {
    /* renamed from: z */
    private static final String[] f4301z = new String[]{C1446f.m10150z(C1446f.m10151z("\u0011\u0012tn\\\u0014s\u0016N[\u0015r6\u001cA\u0006b\u0010tAc\u0017b")), C1446f.m10150z(C1446f.m10151z("\u001c{f\u0010^"))};
    final C1453n this$0;

    C1446f(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10150z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 74;
                    break;
                case 2:
                    i2 = 75;
                    break;
                case 3:
                    i2 = 53;
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
    private static char[] m10151z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4301z[0], f4301z[1]);
    }
}
