package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.ob */
class ob implements C1440l {
    /* renamed from: z */
    private static final String[] f4418z = new String[]{ob.m10256z(ob.m10257z("Gh\"-rX|+2eVc==zGo")), ob.m10256z(ob.m10257z("J\u0002(%y\u0003t~Im$\u0004c:=K\u0002\"%\u001d]qC8m[85n\u0001O\u001fEsr\u001fpC2m?f0SpO`y%&#t^U;P$1SzO\u0004' \u001bRt!im\u0004\u00185N\u001d\u0019ke!\u001bXtE7h9i51!O?Y%\u0006?\"*ui9c5UJ\u0002(%y\u0003t~Im$\u0004c:=K"))};
    final C1453n this$0;

    ob(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10256z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 98;
                    break;
                case 1:
                    i2 = 89;
                    break;
                case 2:
                    i2 = 24;
                    break;
                case 3:
                    i2 = 8;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10257z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 64);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4418z[1], f4418z[0]);
    }
}
