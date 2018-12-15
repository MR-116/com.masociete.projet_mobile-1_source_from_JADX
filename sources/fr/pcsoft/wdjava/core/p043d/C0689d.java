package fr.pcsoft.wdjava.core.p043d;

import fr.pcsoft.wdjava.core.p043d.p044a.C0680a;
import fr.pcsoft.wdjava.core.p043d.p044a.C0683c;
import fr.pcsoft.wdjava.core.p043d.p045b.C0686c;
import fr.pcsoft.wdjava.core.p043d.p045b.C0687d;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

/* renamed from: fr.pcsoft.wdjava.core.d.d */
public class C0689d {
    /* renamed from: a */
    public static final int f1747a = 1024;
    /* renamed from: b */
    public static final int f1748b = 256;
    /* renamed from: c */
    public static final int f1749c = 512;
    /* renamed from: z */
    private static final String f1750z = C0689d.m2854z(C0689d.m2855z("BYPrh F\\s`5CZn~#C[ah3OJio5OGdh5O"));

    /* renamed from: a */
    public static final C0681g m2852a(int i) throws C0690f {
        switch (i) {
            case 256:
                try {
                    throw new C0690f(C0745b.m3222b(f1750z, new String[0]));
                } catch (C0690f e) {
                    throw e;
                }
            case 1024:
                return new C0686c();
            default:
                return new C0683c();
        }
    }

    /* renamed from: b */
    public static final C0678e m2853b(int i) throws C0690f {
        switch (i) {
            case 256:
                try {
                    throw new C0690f(C0745b.m3222b(f1750z, new String[0]));
                } catch (C0690f e) {
                    throw e;
                }
            case 1024:
                return new C0687d();
            default:
                return new C0680a();
        }
    }

    /* renamed from: z */
    private static String m2854z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 10;
                    break;
                case 2:
                    i2 = 21;
                    break;
                case 3:
                    i2 = 32;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2855z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 33);
        }
        return toCharArray;
    }
}
