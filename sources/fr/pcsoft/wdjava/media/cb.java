package fr.pcsoft.wdjava.media;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.util.Comparator;

class cb implements Comparator<String> {
    /* renamed from: z */
    private static final String f2587z = m6833z(m6834z("+Ýcr\u0013\f@yr\u0011Y]~k\u001e\u0015]tx_\t[eo_\u0015U0~\u0010\u0014Dqo\u001e\u0010Gs"));
    final C0957s this$0;

    cb(C0957s c0957s) {
        this.this$0 = c0957s;
    }

    /* renamed from: a */
    private int m6832a(String str) {
        int indexOf = str.indexOf(C0607n.Gc);
        if (indexOf > 0 && indexOf < str.length() - 1) {
            return C0725i.m3064d(str.substring(0, indexOf)) * C0725i.m3064d(str.substring(indexOf + 1));
        }
        C0691a.m2856a(f2587z);
        return 0;
    }

    /* renamed from: z */
    private static String m6833z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 121;
                    break;
                case 1:
                    i2 = 52;
                    break;
                case 2:
                    i2 = 16;
                    break;
                case 3:
                    i2 = 29;
                    break;
                default:
                    i2 = C0607n.bx;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6834z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.bx);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int m6835a(String str, String str2) {
        return m6832a(str) - m6832a(str2);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m6835a((String) obj, (String) obj2);
    }
}
