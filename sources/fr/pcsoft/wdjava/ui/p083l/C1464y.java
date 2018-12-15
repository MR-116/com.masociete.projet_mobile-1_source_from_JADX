package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.y */
class C1464y implements C1440l {
    /* renamed from: z */
    private static final String[] f4472z = new String[]{C1464y.m10295z(C1464y.m10296z("\u0005\u0013wzqj\u0015\r\u001c\u001a\u0005\u0013\u0014\u0011\u001cp3\u0013A\f\rw\fgd\u0000\u0012y\u0015")), C1464y.m10295z(C1464y.m10296z("\by\u0004\u0019\u0017\rm\u0017"))};
    final C1453n this$0;

    C1464y(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10295z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 45;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 36;
                    break;
                case 3:
                    i2 = 60;
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
    private static char[] m10296z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4472z[0], f4472z[1]);
    }
}
