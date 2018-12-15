package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.database.hf.bb;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0938m;

public class lc {
    /* renamed from: z */
    private static final String[] f2118z = new String[]{m4070z(m4071z("5\u0005\u0005\r~\u0018\u0017V\u000b2\u001d\u0011\u0005\r}\u0017\u0010@\u0016f\u001cDm(2\u0017CDNb\u0018\u0017\u0005fDQ\u001c}\f\u0012Ì\u000b<")), m4070z(m4071z("\u001a\u0016@\u000b`:\u000bK\u001aw\u0001\u0010@&T")), m4070z(m4071z("\u001f\u0016\u000b\u001eq\n\u000bC\u001a<\u000e\u0000O\u000fd\u0018JA\u000ff\u0018\u0006D\u001dwW\fC@E=,c1Q\u0016\nQ\u000bj\r\u0001"))};

    /* renamed from: a */
    public static final bb m4067a(boolean z) {
        Class cls;
        try {
            cls = Class.forName(f2118z[2]);
        } catch (ClassNotFoundException e) {
            C0691a.m2856a(f2118z[0]);
            cls = null;
        }
        if (cls != null) {
            try {
                return (bb) cls.getMethod(f2118z[1], new Class[]{Boolean.TYPE}).invoke(null, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                WDErreurManager.m2885a(e2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m4068a() {
        m4069a(Thread.currentThread());
    }

    /* renamed from: a */
    public static final void m4069a(Thread thread) {
        if (!(thread instanceof C0933a) && C0938m.m6817d() == null) {
            WDProjet.getInstance().terminerApplication();
        } else if (Thread.currentThread() == thread) {
            throw new ThreadDeath();
        }
    }

    /* renamed from: z */
    private static String m4070z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 121;
                    break;
                case 1:
                    i2 = 100;
                    break;
                case 2:
                    i2 = 37;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4071z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }
}
