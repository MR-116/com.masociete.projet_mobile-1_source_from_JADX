package fr.pcsoft.wdjava.database.hf.rpl;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.WDHF;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.jni.WDSablierJNI;
import fr.pcsoft.wdjava.jni.IWDSablierJNI;
import fr.pcsoft.wdjava.jni.WDJNIException;

public class WDRPL {
    /* renamed from: a */
    private static ThreadLocal<C0870a> f2356a = null;
    /* renamed from: z */
    private static final String[] f2357z = new String[]{m6160z(m6161z("[<R\u0003FA>R2lD$I4")), m6160z(m6161z("[<R\u0017QT7i\u0001or=U%FI&")), m6160z(m6161z("[<R\u0019pH<X9Q^<R\"Fc7K=JR3")), m6160z(m6161z("[<R\u0019qA>|4PE;T?eX1S8FC")), m6160z(m6161z("[<R\u0016FE\u001eZ\"Wt I>Q")), m6160z(m6161z("[<R\u0003FA>R2j_4T")), m6160z(m6161z("[<R\u0016FE\u001eZ\"Wt I>Q}7M4O")), m6160z(m6161z("[<R\u0019qA>k0PB7")), m6160z(m6161z("[<R\u0019`C7^\u0003FA>R2Be Z?PA=I%BS>^")), m6160z(m6161z("[<R\u0003s}\u0011T?WT*O")), m6160z(m6161z("[<R\u0003FA>R2j_;O8B];H4")), m6160z(m6161z("[<R\u0019qA>4@]3I0oX3R\"L_")), m6160z(m6161z("}7\u001b2L_&^)WTri\u0001o\u0011<\u001c0\u0003A3HqÊE»\u001b2QØ»\u0015")), m6160z(m6161z("[<R\u0019`C7^\u0003FA>R2B|3R%QT")), m6160z(m6161z("[<R\u0019qT1I4Fc7K=JR3z3L_<^")), m6160z(m6161z("[<R\u0019`C7^\u0003FA>R2Bp0T?MT")), m6160z(m6161z("[<R\u0003FA>R2pH<X9Q^<R\"F")), m6160z(m6161z("[<R\u0019dT ^\u0003FA>R2BE;T?")), m6160z(m6161z("[<R\u0003FA>R2pD\"K#J\\7z3L_<^<F_&")), m6160z(m6161z("[<R\u0019qA>|4PE;T?qD0I8RD7"))};

    /* renamed from: a */
    public static final int m6139a(int i) throws C0871b {
        int jniHGereReplication;
        try {
            jniHGereReplication = jniHGereReplication(m6159d(), i);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[17], e));
            jniHGereReplication = 0;
        } finally {
            m6144a();
        }
        return jniHGereReplication;
    }

    /* renamed from: a */
    public static final int m6140a(String str, String str2, String str3) throws C0871b {
        int jniHRecreeReplicaAbonne;
        try {
            jniHRecreeReplicaAbonne = jniHRecreeReplicaAbonne(m6159d(), str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[14], e));
            jniHRecreeReplicaAbonne = 0;
        } finally {
            m6144a();
        }
        return jniHRecreeReplicaAbonne;
    }

    /* renamed from: a */
    public static final int m6141a(String str, String str2, String str3, int i, String str4) throws C0871b {
        int jniHCreeReplicaAbonne;
        try {
            jniHCreeReplicaAbonne = jniHCreeReplicaAbonne(m6159d(), str, str2, str3, i, str4);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[15], e));
            jniHCreeReplicaAbonne = 0;
        } finally {
            m6144a();
        }
        return jniHCreeReplicaAbonne;
    }

    /* renamed from: a */
    private static long m6142a(long j) {
        try {
            return jniRPLContext(j);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[9], e));
            return 0;
        }
    }

    /* renamed from: a */
    public static String m6143a(String str, int i) throws C0871b {
        String jniReplicInfo;
        try {
            jniReplicInfo = jniReplicInfo(m6159d(), str, i);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[5], e));
            jniReplicInfo = null;
        } finally {
            m6144a();
        }
        return jniReplicInfo;
    }

    /* renamed from: a */
    private static final void m6144a() throws C0871b {
        try {
            switch (m6157c()) {
                case 1:
                    throw new C0871b(m6154b());
                case 2:
                    WDErreurManager.m2883a(m6154b());
                    return;
                default:
                    return;
            }
        } catch (C0871b e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final void m6145a(WDObjet wDObjet, int i, int i2) throws C0871b {
        try {
            jniHRplGestionFichier(m6159d(), WDHF_Manager.m5183d(WDHF_Contexte.getInstance(), wDObjet, false).m3717k(), i, i2);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[3], e));
        } finally {
            m6144a();
        }
    }

    /* renamed from: a */
    public static final void m6146a(WDObjet wDObjet, WDObjet wDObjet2, int i) throws C0871b {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            jniHRplGestionRubrique(m6159d(), WDHF_Manager.m5183d(instance, wDObjet, false).m3717k(), WDHF_Manager.m5059a(instance, wDObjet2, false).m5852i(), i);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[19], e));
        } finally {
            m6144a();
        }
    }

    /* renamed from: a */
    public static final boolean m6147a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) throws C0871b {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        boolean jniHRplDeclaraLiaison;
        try {
            jniHRplDeclaraLiaison = jniHRplDeclaraLiaison(m6159d(), WDHF_Manager.m5183d(instance, wDObjet, false).m3717k(), WDHF_Manager.m5059a(instance, wDObjet2, false).m5852i(), WDHF_Manager.m5183d(instance, wDObjet3, false).m3717k(), WDHF_Manager.m5059a(instance, wDObjet4, false).m5852i());
            return jniHRplDeclaraLiaison;
        } catch (UnsatisfiedLinkError e) {
            jniHRplDeclaraLiaison = e;
            WDErreurManager.m2875a(new WDJNIException(f2357z[11], (UnsatisfiedLinkError) jniHRplDeclaraLiaison));
            return false;
        } finally {
            m6144a();
        }
    }

    /* renamed from: a */
    public static final boolean m6148a(String str) throws C0871b {
        boolean jniReplicSupprimeAbonnement;
        try {
            jniReplicSupprimeAbonnement = jniReplicSupprimeAbonnement(m6159d(), str);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[18], e));
            jniReplicSupprimeAbonnement = false;
        } finally {
            m6144a();
        }
        return jniReplicSupprimeAbonnement;
    }

    /* renamed from: a */
    public static final boolean m6149a(String str, String str2) throws C0871b {
        boolean z = false;
        try {
            if (C0808l.m4053k(str2)) {
                str2 = WDAppManager.m2599z().getPath();
            }
            z = jniReplicOuvre(m6159d(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[0], e));
        } finally {
            m6144a();
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m6150a(String str, String str2, int i, int i2) throws C0871b {
        boolean jniHSynchroniseReplica;
        try {
            jniHSynchroniseReplica = jniHSynchroniseReplica(m6159d(), str, str2, i, i2);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[2], e));
            jniHSynchroniseReplica = false;
        } finally {
            m6144a();
        }
        return jniHSynchroniseReplica;
    }

    /* renamed from: a */
    public static final boolean m6151a(String str, String str2, String str3, C0486m c0486m) throws C0871b {
        boolean jniHCreeReplicaTransportable;
        try {
            jniHCreeReplicaTransportable = jniHCreeReplicaTransportable(m6159d(), str, str2, str3, c0486m != null ? c0486m.toString() : "");
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[8], e));
            jniHCreeReplicaTransportable = false;
        } finally {
            m6144a();
        }
        return jniHCreeReplicaTransportable;
    }

    /* renamed from: a */
    public static final boolean m6152a(String str, String str2, String str3, String str4, String str5) throws C0871b {
        boolean jniReplicOuvre;
        try {
            jniReplicOuvre = jniReplicOuvre(m6159d(), str, C0808l.m4053k(str2) ? WDAppManager.m2599z().getPath() : str2, str3, str4, str5);
            return jniReplicOuvre;
        } catch (UnsatisfiedLinkError e) {
            jniReplicOuvre = e;
            WDErreurManager.m2875a(new WDJNIException(f2357z[0], (UnsatisfiedLinkError) jniReplicOuvre));
            return false;
        } finally {
            m6144a();
        }
    }

    /* renamed from: a */
    public static final boolean m6153a(String str, WDObjet... wDObjetArr) throws C0871b {
        boolean jniReplicInitialise;
        try {
            jniReplicInitialise = jniReplicInitialise(m6159d(), str, wDObjetArr);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[10], e));
            jniReplicInitialise = false;
        } finally {
            m6144a();
        }
        return jniReplicInitialise;
    }

    /* renamed from: b */
    private static String m6154b() {
        try {
            return jniGetLastError(m6159d());
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[4], e));
            return "";
        }
    }

    /* renamed from: b */
    public static final void m6155b(String str) throws C0871b {
        try {
            jniHRplPasse(m6159d(), str);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[7], e));
        } finally {
            m6144a();
        }
    }

    /* renamed from: b */
    public static final boolean m6156b(String str, int i) throws C0871b {
        boolean jniReplicSynchronise;
        try {
            jniReplicSynchronise = jniReplicSynchronise(m6159d(), str, i, new WDSablierJNI());
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[16], e));
            jniReplicSynchronise = false;
        } finally {
            m6144a();
        }
        return jniReplicSynchronise;
    }

    /* renamed from: c */
    private static int m6157c() {
        try {
            return jniGetLastErrorLevel(m6159d());
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[6], e));
            return 0;
        }
    }

    /* renamed from: c */
    public static final boolean m6158c(String str) throws C0871b {
        boolean jniHCreeReplicaMaitre;
        try {
            jniHCreeReplicaMaitre = jniHCreeReplicaMaitre(m6159d(), str);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[13], e));
            jniHCreeReplicaMaitre = false;
        } finally {
            m6144a();
        }
        return jniHCreeReplicaMaitre;
    }

    /* renamed from: d */
    private static final long m6159d() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        long h = instance.m5020h();
        if (h > 0) {
            return h;
        }
        long a = m6142a(((WDHF) instance.m5043x()).mo3062x());
        C0691a.m2860a(a > 0, f2357z[12]);
        instance.m4995a(a);
        return a;
    }

    public static final C0870a getVariableWL() {
        if (f2356a == null) {
            f2356a = new ThreadLocal();
        }
        C0870a c0870a = (C0870a) f2356a.get();
        if (c0870a != null) {
            return c0870a;
        }
        c0870a = new C0870a();
        f2356a.set(c0870a);
        return c0870a;
    }

    public static final void initVariableRPL(String str, int i, int i2, int i3, int i4, int i5, String str2, String str3) {
        C0870a variableWL = getVariableWL();
        variableWL.Fichier.setValeur(str);
        variableWL.Operation.setValeur(i);
        variableWL.Conflit.setValeur(i2);
        variableWL.Sens.setValeur(i3);
        variableWL.NumOperation.setValeur(i4);
        variableWL.MaxOperation.setValeur(i5);
        variableWL.AliasSource.setValeur(str2);
        variableWL.AliasDestination.setValeur(str3);
    }

    public static native void jniFreeRPLContext(long j);

    public static native String jniGetLastError(long j);

    public static native int jniGetLastErrorLevel(long j);

    public static native int jniHCreeReplicaAbonne(long j, String str, String str2, String str3, int i, String str4);

    public static native boolean jniHCreeReplicaMaitre(long j, String str);

    public static native boolean jniHCreeReplicaTransportable(long j, String str, String str2, String str3, String str4);

    public static native int jniHGereReplication(long j, int i);

    public static native int jniHRecreeReplicaAbonne(long j, String str, String str2, String str3);

    public static native boolean jniHRplDeclaraLiaison(long j, long j2, long j3, long j4, long j5);

    public static native void jniHRplGestionFichier(long j, long j2, int i, int i2);

    public static native void jniHRplGestionRubrique(long j, long j2, long j3, int i);

    public static native void jniHRplPasse(long j, String str);

    public static native boolean jniHSynchroniseReplica(long j, String str, String str2, int i, int i2);

    public static native long jniRPLContext(long j);

    public static native String jniReplicInfo(long j, String str, int i);

    public static native boolean jniReplicInitialise(long j, String str, WDObjet... wDObjetArr);

    public static native boolean jniReplicOuvre(long j, String str, String str2);

    public static native boolean jniReplicOuvre(long j, String str, String str2, String str3, String str4, String str5);

    public static native boolean jniReplicSupprimeAbonnement(long j, String str);

    public static native boolean jniReplicSynchronise(long j, String str, int i, IWDSablierJNI iWDSablierJNI);

    public static void releaseRPLContext(long j) {
        try {
            jniFreeRPLContext(j);
        } catch (UnsatisfiedLinkError e) {
            WDErreurManager.m2875a(new WDJNIException(f2357z[1], e));
        }
    }

    /* renamed from: z */
    private static String m6160z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 49;
                    break;
                case 1:
                    i2 = 82;
                    break;
                case 2:
                    i2 = 59;
                    break;
                case 3:
                    i2 = 81;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6161z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 35);
        }
        return toCharArray;
    }
}
