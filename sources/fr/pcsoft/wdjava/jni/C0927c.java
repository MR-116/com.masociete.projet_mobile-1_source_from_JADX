package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.p032m.C0926k;

/* renamed from: fr.pcsoft.wdjava.jni.c */
final class C0927c implements C0926k {
    /* renamed from: z */
    private static final String f2533z = C0927c.m6741z(C0927c.m6742z("X\"g3%b&u031+r|:x-þ.3co{9vr y(3i;r|2to{=vG\u00029"));

    C0927c() {
    }

    /* renamed from: z */
    private static String m6741z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 17;
                    break;
                case 1:
                    i2 = 79;
                    break;
                case 2:
                    i2 = 23;
                    break;
                case 3:
                    i2 = 92;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6742z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 86);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void mo3222a() {
        try {
            WDJNIHelper.jniReleaseThreadContext(WDJNIHelper.m6643b());
        } catch (Exception e) {
            C0691a.m2857a(f2533z, e);
        }
    }
}
