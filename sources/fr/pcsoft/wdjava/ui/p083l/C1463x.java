package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;

/* renamed from: fr.pcsoft.wdjava.ui.l.x */
class C1463x implements C1440l {
    /* renamed from: z */
    private static final String[] f4471z = new String[]{C1463x.m10292z(C1463x.m10293z("9\u00000!\u0007<\u0014#$\u0010(\u001151\u00159\u00070!\u0002<\u0014($\u0010%")), C1463x.m10292z(C1463x.m10293z("4jQ)o}\u001cjYN.LK4\u0018%lk6H5\u0011/,n]\u001cJe\u0018f\u0001==hg\u0005m-\n<\u000e8_t1kq)O,\u001c)YN(L9;\u0015#\u0019KE\u0018FP=~\u00051\bM\u0001a\u0018/$\n4jQ)o}\u001cj4\u0018%lk0H5\u000e0;\u001dGp=^T1K )\fAJ$y\u001c#\u0011/,n]\u001cJe\u0018f\u0001==hg\u0005m-\n<\u000e8_t1kq)O,\u001c)YN,\u001d$y\u001c#\u0011/,n]\u001cJe\u0018f\u0001==hg\u0001<6H5\u000e"))};
    final C1453n this$0;

    C1463x(C1453n c1453n) {
        this.this$0 = c1453n;
    }

    /* renamed from: z */
    private static String m10292z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 49;
                    break;
                case 2:
                    i2 = 16;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    i2 = 53;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10293z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 53);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3779a(String str, int i, C0515x c0515x) {
        return C0808l.m4035b(str, f4471z[1], f4471z[0]).trim();
    }
}
