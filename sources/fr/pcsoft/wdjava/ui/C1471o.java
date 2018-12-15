package fr.pcsoft.wdjava.ui;

import fr.pcsoft.wdjava.core.application.C0638a;
import fr.pcsoft.wdjava.core.application.C0651k;

/* renamed from: fr.pcsoft.wdjava.ui.o */
public class C1471o {
    /* renamed from: a */
    private static boolean f4476a = false;
    /* renamed from: z */
    private static final String f4477z = C1471o.m10305z(C1471o.m10306z("x'\u001b(Sa'\u0006\u001eKa*\r-Km\u0017\u000b.Jx)\u001c\u001e\u0015:"));

    static {
        C1471o.m10304b();
    }

    /* renamed from: a */
    public static final boolean m10303a() {
        return f4476a;
    }

    /* renamed from: b */
    private static final void m10304b() {
        f4476a = C0651k.m2646a(C0638a.APP, f4477z, false);
    }

    /* renamed from: z */
    private static String m10305z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 8;
                    break;
                case 1:
                    i2 = 72;
                    break;
                case 2:
                    i2 = 104;
                    break;
                case 3:
                    i2 = 65;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10306z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }
}
