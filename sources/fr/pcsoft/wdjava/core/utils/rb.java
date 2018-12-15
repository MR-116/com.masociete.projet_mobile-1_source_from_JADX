package fr.pcsoft.wdjava.core.utils;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDDate;
import java.lang.reflect.Array;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class rb {
    /* renamed from: a */
    private static short f2148a = (short) -1;
    /* renamed from: b */
    private static final int f2149b = 3;
    /* renamed from: c */
    private static final int f2150c = 1;
    /* renamed from: d */
    private static final int f2151d = 4;
    /* renamed from: e */
    private static final int f2152e = 0;
    /* renamed from: f */
    private static HashSet<C0801e> f2153f = null;
    /* renamed from: g */
    private static final int f2154g = 2;
    /* renamed from: h */
    private static short[][] f2155h = ((short[][]) null);
    /* renamed from: z */
    private static final String[] f2156z = new String[]{m4128z(m4129z("^\u0005")), m4128z(m4129z("^\u0004")), m4128z(m4129z("^\u0006")), m4128z(m4129z("E\u0007W*;e\u0005\u0007L=.\u001aCN\u001d/J%HV3\u000e'hWc")), m4128z(m4129z("^\u0003")), m4128z(m4129z("^\u0002")), m4128z(m4129z("\u0013=")), m4128z(m4129z("=r(A9Tx/A9Xr(Z#Ay5]9Zr<Z(W"))};

    /* renamed from: a */
    public static synchronized void m4122a() {
        synchronized (rb.class) {
            if (f2153f != null) {
                f2153f.clear();
            }
        }
    }

    /* renamed from: a */
    private static final void m4123a(int i) {
        if (i != f2148a) {
            short[] access$000 = hb.m3919b(i);
            if (access$000 != null) {
                if (f2155h == null) {
                    f2155h = (short[][]) Array.newInstance(Short.TYPE, new int[]{5, 2});
                }
                f2155h[0][0] = access$000[1];
                f2155h[0][1] = access$000[2];
                GregorianCalendar g = C0725i.m3077g();
                g.set(i, hb.m3937j(access$000[1]), access$000[2]);
                g.add(6, -2);
                f2155h[4][0] = (short) hb.m3931f(g.get(2));
                f2155h[4][1] = (short) g.get(5);
                g.add(6, 3);
                f2155h[2][0] = (short) hb.m3931f(g.get(2));
                f2155h[2][1] = (short) g.get(5);
                g.add(6, 38);
                f2155h[1][0] = (short) hb.m3931f(g.get(2));
                f2155h[1][1] = (short) g.get(5);
                g.add(6, 11);
                f2155h[3][0] = (short) hb.m3931f(g.get(2));
                f2155h[3][1] = (short) g.get(5);
                f2148a = (short) i;
                return;
            }
            f2155h = (short[][]) null;
        }
    }

    /* renamed from: a */
    public static final synchronized void m4124a(String str) {
        int i = 0;
        synchronized (rb.class) {
            if (f2153f == null) {
                f2153f = new LinkedHashSet();
            }
            switch (str.length()) {
                case 2:
                    if (!str.equals(f2156z[2])) {
                        i = str.equals(f2156z[5]) ? 2 : str.equals(f2156z[0]) ? 1 : str.equals(f2156z[1]) ? 3 : str.equals(f2156z[4]) ? 4 : -1;
                    }
                    if (i >= 0) {
                        f2153f.add(new C0805i(str, i));
                        break;
                    }
                    break;
                case 4:
                    f2153f.add(new C0802f(str));
                    break;
                case 6:
                    if (str.matches(f2156z[3])) {
                        f2153f.add(new C0803g(str));
                        break;
                    }
                    break;
                case 8:
                    f2153f.add(new C0804h(str));
                    break;
            }
        }
    }

    /* renamed from: a */
    public static boolean m4125a(WDDate wDDate, boolean z) {
        if (f2153f != null) {
            return wDDate.m2520f() ? m4126a(new zb(wDDate)) : false;
        } else {
            if (!z) {
                return false;
            }
            WDErreurManager.m2883a(C0745b.m3222b(f2156z[7], new String[0]));
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m4126a(zb zbVar) {
        boolean z;
        synchronized (rb.class) {
            if (f2153f != null) {
                Iterator it = f2153f.iterator();
                while (it.hasNext()) {
                    if (((C0801e) it.next()).mo2757a(zbVar)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    static void access$100(int i) {
        m4123a(i);
    }

    static short[][] access$200() {
        return f2155h;
    }

    /* renamed from: b */
    public static final String m4127b() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = f2153f.iterator();
        while (it.hasNext()) {
            C0801e c0801e = (C0801e) it.next();
            if (stringBuilder.length() > 0) {
                stringBuilder.append(f2156z[6]);
            }
            stringBuilder.append(c0801e.f2056a);
        }
        return stringBuilder.toString();
    }

    /* renamed from: z */
    private static String m4128z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 30;
                    break;
                case 1:
                    i2 = 55;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 102;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4129z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 102);
        }
        return toCharArray;
    }
}
