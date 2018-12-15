package fr.pcsoft.wdjava.tlm;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.jni.WDJNIException;

public abstract class WDTelemetrie {
    /* renamed from: a */
    public static final int f2921a = 11;
    /* renamed from: b */
    public static final int f2922b = 6;
    /* renamed from: c */
    protected static final int f2923c = 3;
    /* renamed from: d */
    public static final int f2924d = 14;
    /* renamed from: e */
    public static final int f2925e = 5;
    /* renamed from: f */
    public static final int f2926f = 9;
    /* renamed from: g */
    public static final int f2927g = 12;
    /* renamed from: h */
    protected static final int f2928h = 5;
    /* renamed from: i */
    protected static final int f2929i = 0;
    /* renamed from: j */
    protected static final int f2930j = 1;
    /* renamed from: k */
    public static final int f2931k = 1;
    /* renamed from: l */
    public static final int f2932l = 10;
    /* renamed from: m */
    public static final int f2933m = 2;
    /* renamed from: n */
    public static final int f2934n = 13;
    /* renamed from: o */
    private static WDTelemetrie f2935o = null;
    /* renamed from: p */
    protected static final int f2936p = 2;
    /* renamed from: q */
    protected static final String f2937q = m7400z(m7401z("./\"\u0019,4\u001d\u001c\u001d0\u0006+\u0013\u001e48,\u001e\b\u001f0&"));
    /* renamed from: r */
    protected static final int f2938r = 4;
    /* renamed from: s */
    protected static final int f2939s = 6;
    /* renamed from: t */
    protected static final int f2940t = 7;
    /* renamed from: u */
    public static final int f2941u = 3;
    /* renamed from: z */
    private static final String[] f2942z;

    static {
        r0 = new String[19];
        r0[0] = m7400z(m7401z("3,\u0014$.06)\b,</\u0018\u001920'"));
        r0[1] = m7400z(m7401z("3,\u0014+/+!\u0018(./-\u00149%5'\u0010\b4++\u0018"));
        r0[2] = m7400z(m7401z("?0S\u001d#*-\u001b\u0019n.&\u0017\f68l\t\u0001-w\u001599%5'\u0010\b4++\u0018$-)."));
        r0[3] = m7400z(m7401z("\u0010/\r\u00023*+\u001f\u0001%y&\u0018M#1#\u000f\n%+b\u0011\f`:.\u001c\u001e3<b\u0019J)42\u0011-<,\t\f40-\u0013M$<b\u0011\f`-«\u0011-°6\u000f\u0004%w"));
        r0[4] = m7400z(m7401z("3,\u0014>%-\u0016\u0018\u00000*\r\b\u001b%+6\b\u001f%"));
        r0[5] = m7400z(m7401z("3,\u0014+%+/\u0018+%7'\t\u001f%"));
        r0[6] = m7400z(m7401z("3,\u0014840.\u0014\u001e%\u000b'\u000e\b!,"));
        r0[7] = m7400z(m7401z("3,\u0014>%-\u0012\u001c\u001f!4'\t\u001f%"));
        r0[8] = m7400z(m7401z("3,\u0014*%-\u0016\u0018\u00000*\u0007\u0005\b#,6\u0014\u0002.\u0014+\u0013\u0004-8.0\u0004,5+\u000e\b#6,\u0019\b"));
        r0[9] = m7400z(m7401z("3,\u0014>)>,\u001c\u0001%\u001c:\u001e\b0-+\u0012\u0003"));
        r0[10] = m7400z(m7401z("3,\u0014,*67\t\b\u001081\u000e\f'<\u0001\u0011\b"));
        r0[11] = m7400z(m7401z("3,\u00149%+/\u0014\u0003%\r'\u0011\b-<6\u000f\u0004%"));
        r0[12] = m7400z(m7401z("3,\u0014*%-\u0012\u001c\u001f!4'\t\u001f%"));
        r0[13] = m7400z(m7401z("3,\u0014,*67\t\b\r<1\b\u001f%\u001a.\u0018"));
        r0[14] = m7400z(m7401z("3,\u0014.2<')\b,</\u0018\u001920';\b.<6\u000f\b"));
        r0[15] = m7400z(m7401z("3,\u0014,#-+\u0012\u0003\u0005?$\u0018\u000e4,'\u0018"));
        r0[16] = m7400z(m7401z("3,\u0014928+\t\b-<,\t(&?'\u001e\u00195<"));
        r0[17] = m7400z(m7401z("3,\u0014*%-\u0006\u0018\u0001!0\u000b\u0013\f#-+\u000b\u00044<\u0016\u0018\u0001%4'\t\u001f)<"));
        r0[18] = m7400z(m7401z("3,\u0014$$<,\t\u0004&0'(\u0019)5+\u000e\f4<7\u000f"));
        f2942z = r0;
    }

    /* renamed from: e */
    public static final synchronized WDTelemetrie m7399e() {
        WDTelemetrie wDTelemetrie;
        synchronized (WDTelemetrie.class) {
            if (f2935o == null) {
                try {
                    f2935o = (WDTelemetrie) Class.forName(f2942z[2]).newInstance();
                } catch (Throwable th) {
                    C0691a.m2857a(f2942z[3], th instanceof Exception ? (Exception) th : new Exception(th.getMessage()));
                }
                if (f2935o == null) {
                    f2935o = new C1030c();
                }
            }
            wDTelemetrie = f2935o;
        }
        return wDTelemetrie;
    }

    public static final native void jniActionEffectuee(long j, int i, long j2, String str, int i2, long j3);

    public static final native void jniAjouteMesureCle(String str, String str2, long j) throws WDJNIException;

    public static final native void jniAjoutePassageCle(String str, String str2) throws WDJNIException;

    public static final native long jniCreeTelemetrieFenetre(String str);

    public static final native void jniFermeFenetre(long j, long j2);

    public static final native void jniForceEnvoiTelemetrie() throws WDJNIException;

    public static final native int jniGetDelaiInactiviteTelemetrie();

    public static final native WDObjet jniGetParametre(int i) throws WDJNIException;

    public static final native int jniGetTempsExecutionMinimalMilliseconde();

    public static final native void jniIdentifieUtilisateur(String str);

    public static final native void jniInitTelemetrie(String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native WDObjet jniSetParametre(int i, WDObjet wDObjet) throws WDJNIException;

    public static final native void jniSetTempsOuverture(long j, long j2);

    public static final native void jniSignaleException(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3);

    public static final native void jniTermineTelemetrie() throws WDJNIException;

    public static final native void jniTraitementEffectue(long j, int i, long j2, String str, int i2, long j3);

    public static final native void jniUtiliseReseau(int i) throws WDJNIException;

    /* renamed from: z */
    private static String m7400z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 66;
                    break;
                case 2:
                    i2 = 125;
                    break;
                case 3:
                    i2 = 109;
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
    private static char[] m7401z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 64);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final WDObjet m7402a(int i, WDObjet wDObjet) throws WDJNIException {
        try {
            return jniSetParametre(i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[7], e);
        }
    }

    /* renamed from: a */
    public final void m7403a() throws WDJNIException {
        try {
            jniTermineTelemetrie();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[11], e);
        }
    }

    /* renamed from: a */
    public final void m7404a(int i) throws WDJNIException {
        try {
            jniUtiliseReseau(i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[6], e);
        }
    }

    /* renamed from: a */
    public final void m7405a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3) throws WDJNIException {
        try {
            jniSignaleException(i, str, str2, str3, str4, str5, str6, str7, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[9], e);
        }
    }

    /* renamed from: a */
    public final void m7406a(long j, int i, long j2, String str, int i2, long j3) throws WDJNIException {
        try {
            jniTraitementEffectue(j, i, j2, str, i2, j3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[16], e);
        }
    }

    /* renamed from: a */
    public final void m7407a(long j, long j2) throws WDJNIException {
        try {
            jniSetTempsOuverture(j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[4], e);
        }
    }

    /* renamed from: a */
    public abstract void mo3310a(String str);

    /* renamed from: a */
    public final void m7409a(String str, String str2) throws WDJNIException {
        try {
            jniAjoutePassageCle(str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[10], e);
        }
    }

    /* renamed from: a */
    public final void m7410a(String str, String str2, long j) throws WDJNIException {
        try {
            jniAjouteMesureCle(str, str2, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[13], e);
        }
    }

    /* renamed from: a */
    public final void m7411a(String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, int i5, int i6) throws WDJNIException {
        try {
            jniInitTelemetrie(str, str2, bArr, str3, str4, str5, str6, i, i2, i3, i4, i5, i6);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[0], e);
        }
    }

    /* renamed from: b */
    public final int m7412b() throws WDJNIException {
        try {
            return jniGetTempsExecutionMinimalMilliseconde();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[8], e);
        }
    }

    /* renamed from: b */
    public final long m7413b(String str) throws WDJNIException {
        try {
            return jniCreeTelemetrieFenetre(str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[14], e);
        }
    }

    /* renamed from: b */
    public final WDObjet m7414b(int i) throws WDJNIException {
        try {
            return jniGetParametre(i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[12], e);
        }
    }

    /* renamed from: b */
    public final void m7415b(long j, int i, long j2, String str, int i2, long j3) throws WDJNIException {
        try {
            jniActionEffectuee(j, i, j2, str, i2, j3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[15], e);
        }
    }

    /* renamed from: b */
    public final void m7416b(long j, long j2) throws WDJNIException {
        try {
            jniFermeFenetre(j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[5], e);
        }
    }

    /* renamed from: c */
    public abstract void mo3311c();

    /* renamed from: c */
    public final void m7418c(String str) throws WDJNIException {
        try {
            jniIdentifieUtilisateur(str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[18], e);
        }
    }

    /* renamed from: d */
    public final void m7419d() throws WDJNIException {
        try {
            jniForceEnvoiTelemetrie();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[1], e);
        }
    }

    /* renamed from: f */
    public final void m7420f() throws WDJNIException {
        try {
            jniGetDelaiInactiviteTelemetrie();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2942z[17], e);
        }
    }

    /* renamed from: g */
    public abstract int mo3312g();

    /* renamed from: h */
    public abstract boolean mo3313h();
}
