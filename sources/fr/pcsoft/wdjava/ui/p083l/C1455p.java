package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.p */
class C1455p implements C1440l {
    /* renamed from: z */
    private static final String[] f4419z = new String[]{C1455p.m10259z(C1455p.m10260z("'\u0012VB\u001f\"\u0006EG\b6\u0003SR")), C1455p.m10259z(C1455p.m10260z("*x7Jw_XD\u001a\u0004\"\u001c^<\u001d/\u001a+\u001c\u001f\nVX\u0005Y\u0013[^py\u0011\u000bN\r=\u000b-W\u0000;~\rUP+\u0003IOvC\u000e,:\u0004"))};
    final C1453n this$0;

    C1455p(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10259z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 35;
                    break;
                case 2:
                    i2 = 118;
                    break;
                case 3:
                    i2 = 103;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10260z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4419z[1], f4419z[0]);
    }
}
