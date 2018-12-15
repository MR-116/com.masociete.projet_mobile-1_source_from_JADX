package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.jb */
class jb implements C1440l {
    /* renamed from: z */
    private static final String[] f4356z = new String[]{jb.m10211z(jb.m10212z(".>\fl^+*\u001f")), jb.m10211z(jb.m10212z("#T\u001cdUVt\u001a4E+0\u0004\u0012\\&6q2_v&\fvDP?\u0001p1p=Q`"))};
    final C1453n this$0;

    jb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10211z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 15;
                    break;
                case 2:
                    i2 = 44;
                    break;
                case 3:
                    i2 = 73;
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
    private static char[] m10212z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 108);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4356z[1], f4356z[0]);
    }
}
