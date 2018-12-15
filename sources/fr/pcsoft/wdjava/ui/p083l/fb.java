package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.fb */
class fb implements C1440l {
    /* renamed from: z */
    private static final String[] f4302z = new String[]{fb.m10153z(fb.m10154z("V\u0018J1:#8Na*^|RG3Sz'g5\u0003jZ#+%sW%^\u0005v\u00075")), fb.m10153z(fb.m10154z("[rZ91^fI"))};
    final C1453n this$0;

    fb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10153z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 126;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 28;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10154z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 3);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4302z[0], f4302z[1]);
    }
}
