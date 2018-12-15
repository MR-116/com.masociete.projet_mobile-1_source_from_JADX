package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.pb */
class pb implements C1440l {
    /* renamed from: z */
    private static final String[] f4420z = new String[]{pb.m10262z(pb.m10263z("\u0018|9 v")), pb.m10262z(pb.m10263z("\u0015\u0016X(\u001e\r` X?\u000e00%{\u0015\u0016X(\u001e\r` X?\u000e00"))};
    final C1453n this$0;

    pb(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10262z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 61;
                    break;
                case 1:
                    i2 = 77;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 5;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10263z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 68);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4420z[1], f4420z[0]);
    }
}
