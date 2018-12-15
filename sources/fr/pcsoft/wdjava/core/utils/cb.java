package fr.pcsoft.wdjava.core.utils;

import java.lang.reflect.Method;

class cb {
    /* renamed from: a */
    private static Method f2043a;
    /* renamed from: b */
    private static Object f2044b;
    /* renamed from: c */
    private static boolean f2045c;

    static {
        f2045c = false;
        f2043a = null;
        f2044b = null;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                f2044b = contextClassLoader.loadClass(m3852z(m3853z("g\u000f\u0018EUy\u000b\u0016PUC\u0001\u001cI\u001aa\u0007\u0014A\t)(\u0001V\u0016"))).getField(m3852z(m3853z("C(*"))).get(null);
                f2043a = contextClassLoader.loadClass(m3852z(m3853z("g\u000f\u0018EUy\u000b\u0016PUC\u0001\u001cI\u001aa\u0007\u0014A\t"))).getMethod(m3852z(m3853z("c\u0001\u001cI\u001aa\u0007\u0014A")), new Class[]{CharSequence.class, r1});
                f2045c = true;
            }
        } catch (Exception e) {
            f2045c = false;
            f2043a = null;
            f2044b = null;
        }
    }

    private cb() {
    }

    static boolean access$000() {
        return f2045c;
    }

    static Object access$100() {
        return f2044b;
    }

    static Method access$200() {
        return f2043a;
    }

    /* renamed from: z */
    private static String m3852z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 13;
                    break;
                case 1:
                    i2 = 110;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 36;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3853z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 123);
        }
        return toCharArray;
    }
}
