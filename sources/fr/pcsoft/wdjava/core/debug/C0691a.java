package fr.pcsoft.wdjava.core.debug;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: fr.pcsoft.wdjava.core.debug.a */
public class C0691a {
    /* renamed from: a */
    private static SimpleDateFormat f1751a = null;
    /* renamed from: b */
    private static final boolean f1752b = C0691a.m2864c();
    /* renamed from: z */
    private static final String[] f1753z = new String[]{C0691a.m2865z(C0691a.m2866z("R5 \u001d{C$,\u0016\u000b:M")), C0691a.m2865z(C0691a.m2866z("7@C")), C0691a.m2865z(C0691a.m2866z("V>0\u001dyCMNx")), C0691a.m2865z(C0691a.m2866z("\u001e \u0006+Xv\n\u0006x\u00117")), C0691a.m2865z(C0691a.m2866z("\u001e9\u001a(N7WC")), C0691a.m2865z(C0691a.m2866z("\u001e!\f;J{\u0004\u00109_~\u0002\rx\u00117")), C0691a.m2865z(C0691a.m2866z("tW?vOr\u000f\u0016?{T>")), C0691a.m2865z(C0691a.m2866z("s\tL\u0015f8\u0014\u001a!R7\u0005\u000bbFzW\u0010+\u0011D>0\u000b"))};

    /* renamed from: a */
    public static final void m2856a(String str) {
        C0691a.m2860a(false, str);
    }

    /* renamed from: a */
    public static final void m2857a(String str, Exception exception) {
        C0691a.m2863b(str, exception);
    }

    /* renamed from: a */
    public static final void m2858a(String str, StackTraceElement[] stackTraceElementArr) {
        int i = 0;
        if (f1752b) {
            System.err.println(f1753z[0] + C0691a.m2862b() + f1753z[1] + str);
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                while (i < length) {
                    System.err.println(stackTraceElementArr[i]);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m2859a(boolean z) {
        if (f1752b && !z) {
            System.out.println(f1753z[2] + C0691a.m2862b());
        }
    }

    /* renamed from: a */
    public static final void m2860a(boolean z, String str) {
        if (f1752b && !z) {
            System.out.println(f1753z[2] + C0691a.m2862b() + f1753z[1] + str);
        }
    }

    /* renamed from: a */
    public static final boolean m2861a() {
        return f1752b;
    }

    /* renamed from: b */
    private static final String m2862b() {
        if (f1751a == null) {
            f1751a = new SimpleDateFormat(f1753z[7]);
        }
        return f1751a.format(new Date(System.currentTimeMillis()));
    }

    /* renamed from: b */
    public static final void m2863b(String str, Exception exception) {
        if (f1752b) {
            System.out.println(f1753z[0] + C0691a.m2862b() + f1753z[1] + str);
            if (exception != null) {
                System.out.println(f1753z[4] + exception.getClass());
                System.out.println(f1753z[3] + exception.getMessage());
                if (exception.getStackTrace() != null) {
                    System.out.println(f1753z[5] + exception.getStackTrace()[0]);
                }
            }
        }
    }

    /* renamed from: c */
    private static final boolean m2864c() {
        return new File(f1753z[6]).exists();
    }

    /* renamed from: z */
    private static String m2865z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 23;
                    break;
                case 1:
                    i2 = 109;
                    break;
                case 2:
                    i2 = 99;
                    break;
                case 3:
                    i2 = 88;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2866z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }
}
