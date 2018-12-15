package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.utils.C0857z;

public class hc {
    /* renamed from: a */
    private static C0857z f2094a = null;
    /* renamed from: z */
    private static final String[] f2095z = new String[]{m3946z(m3947z(" k2w8\u001ao t.Ib'8(\u001bï'jk\u0005gb{'\bu1}k>B\u0011y)\u0005o'j\u0002\u0004v.8;\btbq%\u001dt-k;\fe6q$\u0007(")), m3946z(m3947z("\u000ftlh(\u001ai$le\u001eb(y=\b(7qe\u001cr+t8GQ\u0006K*\u000bj+}9 k2t"))};

    /* renamed from: a */
    public static final synchronized void m3942a() {
        synchronized (hc.class) {
            if (C0938m.m6815b()) {
                m3944b().hide();
            } else {
                C0938m.m6810a(new lb());
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m3943a(String str) {
        synchronized (hc.class) {
            if (C0938m.m6815b()) {
                m3944b().show(str, 1);
            } else {
                C0938m.m6810a(new C0799b(str));
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0857z m3944b() {
        C0857z c0857z;
        synchronized (hc.class) {
            try {
                if (f2094a == null || f2094a.isDestroyed()) {
                    try {
                        f2094a = (C0857z) Class.forName(f2095z[1]).newInstance();
                    } catch (Exception e) {
                        C0691a.m2857a(f2095z[0], e);
                    }
                }
                c0857z = f2094a;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return c0857z;
    }

    /* renamed from: c */
    public static final synchronized boolean m3945c() {
        boolean isShown;
        synchronized (hc.class) {
            isShown = f2094a != null ? f2094a.isShown() : false;
        }
        return isShown;
    }

    /* renamed from: z */
    private static String m3946z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 105;
                    break;
                case 1:
                    i2 = 6;
                    break;
                case 2:
                    i2 = 66;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3947z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 75);
        }
        return toCharArray;
    }
}
