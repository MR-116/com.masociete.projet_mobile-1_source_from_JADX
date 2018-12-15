package fr.pcsoft.wdjava.core.utils;

/* renamed from: fr.pcsoft.wdjava.core.utils.d */
public class C0800d {
    /* renamed from: a */
    private static double f2047a = 1.0E-6d;

    /* renamed from: a */
    public static boolean m3856a(double d, double d2) {
        return Math.abs(d - d2) < f2047a;
    }

    /* renamed from: a */
    public static boolean m3857a(double d, int i) {
        return Math.abs(d - ((double) i)) < f2047a;
    }

    /* renamed from: a */
    public static boolean m3858a(double d, long j) {
        return Math.abs(d - ((double) j)) < f2047a;
    }

    /* renamed from: a */
    public static boolean m3859a(int i, double d) {
        return Math.abs(((double) i) - d) < f2047a;
    }

    /* renamed from: a */
    public static boolean m3860a(long j, double d) {
        return Math.abs(((double) j) - d) < f2047a;
    }
}
