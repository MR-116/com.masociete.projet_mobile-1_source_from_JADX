package fr.pcsoft.wdjava.core.erreur;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;

/* renamed from: fr.pcsoft.wdjava.core.erreur.a */
public class C0694a {
    /* renamed from: a */
    private static boolean f1779a = false;
    /* renamed from: b */
    private static String f1780b = "";
    /* renamed from: c */
    private static String f1781c = "";
    /* renamed from: d */
    private static String f1782d = "";

    /* renamed from: a */
    public static void m2902a() {
        f1780b = "";
        f1781c = "";
        f1782d = "";
        f1779a = false;
        WDObjet.ErreurDetectee.setValeur(false);
    }

    /* renamed from: a */
    public static void m2903a(String str) {
        f1781c = str;
    }

    /* renamed from: a */
    public static void m2904a(boolean z) {
        f1779a = z;
    }

    /* renamed from: b */
    public static void m2905b(String str) {
        WDObjet.ErreurDetectee.setValeur(true);
        f1780b = str;
        WDAppelContexte.getContexte().m2706a(new WDErreurNonFatale(str, ""), 0);
    }

    /* renamed from: b */
    public static boolean m2906b() {
        return f1779a;
    }

    /* renamed from: c */
    public static String m2907c() {
        return f1782d;
    }

    /* renamed from: c */
    public static void m2908c(String str) {
        f1782d = str;
    }

    /* renamed from: d */
    public static String m2909d() {
        return f1780b;
    }

    /* renamed from: e */
    public static String m2910e() {
        return f1781c;
    }
}
